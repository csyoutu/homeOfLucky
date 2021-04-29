package desgin.Adapter;

/**
 * Created on 2021/4/29.3:03 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void Request() {
        this.SpecificRequest();
    }
}
