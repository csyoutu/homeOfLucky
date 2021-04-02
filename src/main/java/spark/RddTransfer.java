package spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created on 2021/4/1.11:30 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class RddTransfer {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("join").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);

        List<Student> s1=new ArrayList<Student>();
        List<Student> s2=new ArrayList<Student>();
        List<Student> s3=new ArrayList<Student>();
        for(int i=0;i<100;i++){
            Student s=new Student("s"+i,
                    15 + (int)(Math.random() * (25 - 15))
                    ,"m", 50 + Math.random() * (99 - 50),
                    0 + (int)(Math.random() * (100 - 0)));
            s1.add(s);
        }
        for(int i=50;i<150;i++){
            Student s=new Student("s"+i,
                    15 + (int)(Math.random() * (25 - 15))
                    ,"m", 50 + Math.random() * (99 - 50),
                    0 + (int)(Math.random() * (100 - 0)));
            s2.add(s);
        }
        for(int i=100;i<200;i++){
            Student s=new Student("s"+i,
                    15 + (int)(Math.random() * (25 - 15))
                    ,"m", 50 + Math.random() * (99 - 50),
                    0 + (int)(Math.random() * (100 - 0)));
            s3.add(s);
        }
        //获取rdd
        JavaRDD<Student> l1=sc.parallelize(s1);
        System.out.println("l1---"+l1.count());
        JavaRDD<Student> f1 = l1.filter(e -> e.getAge() > 18);
        System.out.println("f1---"+f1.count());
        JavaRDD<Student> l2=sc.parallelize(s2);
        JavaRDD<Student> l3=sc.parallelize(s3);

        JavaRDD<Student> f2 = l1.filter(new Function<Student, Boolean>() {
            @Override
            public Boolean call(Student student) throws Exception {
                return student.getAge() > 10 && student.getMath() > 85;
            }
        });
        System.out.println("f2---"+f2.count());
        JavaRDD<Student> f3 = l1.filter(new function1());
        l1.flatMap(new FlatMapFunction<Student, String>(){

            @Override
            public Iterator<String> call(Student student) throws Exception {
                return student.getLoves().iterator();
            }
        });

        l1.reduce(new Function2<Student, Student, Student>() {
            @Override
            public Student call(Student student, Student student2) throws Exception {
                return null;
            }
        });
        JavaPairRDD<String, Student> pair1 = l1.mapToPair(k -> new Tuple2<>(k.getName(), k));
        JavaPairRDD<String, Student> filter1 = pair1.filter(t -> t._1.equals(""));

        pair1.reduceByKey(new Function2<Student, Student, Student>() {
            @Override
            public Student call(Student student, Student student2) throws Exception {
                Student s=new Student();
                s.setAge(student.getAge()+student2.getAge());
                return s;
            }
        });

    }

    static class function1 implements Function<Student,Boolean>{

        @Override
        public Boolean call(Student student) throws Exception {
            return null;
        }
    }
}
