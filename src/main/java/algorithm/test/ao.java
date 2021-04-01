package algorithm.test;

import algorithm.leetcode.model.Add;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2021/3/27.3:31 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class ao {
    public static void main(String[] args) {
       Add a1=new Add();
       Add a2=new Add();
        List<Integer> t=new ArrayList<Integer>();
        t.add(1);
        t.add(2);
        a2.setAdds(null);
        a2.setNumber(t);

        List<Add>t2=new ArrayList<>();
        t2.add(a2);
        a1.setAdds(t2);

        List<Integer> t3=new ArrayList<Integer>();
        t3.add(3);


        a1.setNumber(t3);

        System.out.println(AddNum(a1));
    }
    static int AddNum(Add add){
        int result=0;
        if(add.getAdds()==null||add.getAdds().size()==0){
            for(int i=0;i<add.getNumber().size();i++){
                result+=add.getNumber().get(i);
            }
            return result;
        }
        if(add.getNumber()!=null){
            for(int i=0;i<add.getNumber().size();i++){
                result+=add.getNumber().get(i);
            }
        }
        if(add.getAdds()!=null){
            for (int j=0;j<add.getAdds().size();j++){
                result+=AddNum(add.getAdds().get(j));
            }
        }
        return result;
    }
}
