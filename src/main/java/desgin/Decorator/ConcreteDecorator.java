package desgin.Decorator;

/**
 * Created on 2021/5/4.4:00 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }
    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
