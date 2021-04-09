package desgin.proxy;

/**
 * Created on 2021/4/5.3:52 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class ProxySubject implements Subject{
    private RealSubject realSubject;


    @Override
    public void Request() {
        realSubject.Request();
    }
}
