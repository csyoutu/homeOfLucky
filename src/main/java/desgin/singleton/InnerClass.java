package desgin.singleton;


/**
 * Created on 2021/4/5.3:10 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
//内部类 单例模式
public class InnerClass {
    private InnerClass(){

    }
    private static class SingletonInner{
        private static final InnerClass instance=new InnerClass();
    }

    public InnerClass getInstance(){
        return SingletonInner.instance;
    }
}
