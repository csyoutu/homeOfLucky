package algorithm.leetcode;

/**
 * Created on 2021/3/24.11:04 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Num50 {
    public static double myPow(double x, int n) {
        double res = 1.0;
        int i = n;
        while(i!=0){
            //奇数
            if(Math.abs(i)%2==1){
                res*=x;
            }
            x*=x;
            i=i/2;
        }
        if(n<0)
            return 1.0/res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0,-2));
    }
}
