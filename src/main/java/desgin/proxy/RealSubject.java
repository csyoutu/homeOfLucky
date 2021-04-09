package desgin.proxy;

import spire.math.Algebraic;

/**
 * Created on 2021/4/5.3:52 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("do somthing");
    }
}
