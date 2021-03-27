package algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2021/3/27.10:29 上午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Num30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer>  list=new ArrayList<>();
        if(words.length==0||s.length()==0||s==null) return list;
        Map<String,Integer> mapCount=new HashMap<>();
        for(String word:words) {
            mapCount.put(word, mapCount.containsKey(word) ? mapCount.get(word) + 1 : 1); //map用于单词出现次数计数
        }
        int n=s.length(),len=words[0].length(),num=words.length,j;
        Map<String,Integer> mapStore=new HashMap<>();
        for(int i=0;i<n-num*len+1;i++)    //循环到索引为n-num*len的字符即可，最后一个可能匹配子串
        {
            j=0;
            while(j<num)    //比较num个单词
            {
                String word=s.substring(i+j*len,i+(j+1)*len);
                if(mapCount.containsKey(word))
                {
                    mapStore.put(word,mapStore.containsKey(word)?mapStore.get(word)+1:1);
                    if(mapStore.get(word)>mapCount.get(word)) break; //比较出现次数，次数大于原words，则不符合，break
                }
                else{
                    break;
                }
                j++;
            }
            if(j==num)     //符合则添加
                list.add(i);
            mapStore.clear();  //清空mapStore
        }
        return list;
    }
}
