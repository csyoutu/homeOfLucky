package desgin.Decorator;

/**
 * Created on 2021/5/4.3:54 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class ConcreteComponent implements Component{
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
