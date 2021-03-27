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
        if(haystack.isEmpty()||needle.isEmpty()){
            return 0;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        int i=0,j=0;
        while (i<haystack.length()){
            //首字符匹配
            int re=i;
            boolean isMatch=true;
            if(haystack.charAt(i)==needle.charAt(0)){
                while (j<needle.length()-1){
                    i++;
                    j++;
                    if(haystack.charAt(i)==needle.charAt(j)){
                        continue;
                    }
                    else{
                        isMatch=false;
                        break;
                    }
                }
                if(isMatch){
                    return re;
                }
            }
            if(!isMatch){
                i=re;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1="mississippi";
        String s2="issip";
        System.out.println(strStr(s1,s2));
    }
}
