package lamda.stream;


import java.util.function.Predicate;

/**
 * Created on 2021/3/7.10:58 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class PedicateStudy {
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213};
        Predicate<Integer> p1=(x) -> x>=0;
        for(Integer i:arr){
            if(p1.test(i)){
                System.out.println(i);
            }
        }
    }
}
