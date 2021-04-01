package spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.ArrayList;
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
        JavaRDD<Student> l2=sc.parallelize(s1);
        JavaRDD<Student> l3=sc.parallelize(s1);

    }
}
