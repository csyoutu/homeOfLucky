package algorithm.leetcode;


/**
 * Created on 2021/3/25.11:35 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Num28 {
    // abbcdef  bc
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        if(haystack.length()<needle.length())
            return -1;
        for(int i=0;i<haystack.length();i++){
            if(i+needle.length()>haystack.length()){
                return -1;
            }
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        String s1="mississippi";
        String s2="issip";
        System.out.println(strStr(s1,s2));
    }
}
