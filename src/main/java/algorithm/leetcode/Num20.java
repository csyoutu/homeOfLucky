package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created on 2021/3/14.3:44 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Num20 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(s.charAt(i)==']' && stack.peek()=='['){
                stack.pop();
            }

            else if(s.charAt(i)=='}' && stack.peek()=='{'){
                stack.pop();
            }
            else
                stack.push(s.charAt(i));

        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('{','}'); put('[',']'); put('(',')'); put('?','?');
    }};


    public static void main(String[] args) {
        String s="abc";
    }
}
