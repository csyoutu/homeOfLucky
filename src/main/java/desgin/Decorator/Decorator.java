package desgin.Decorator;

/**
 * Created on 2021/5/4.3:59 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Decorator implements Component{
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
