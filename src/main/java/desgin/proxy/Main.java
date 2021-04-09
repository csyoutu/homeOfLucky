package desgin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created on 2021/4/5.4:09 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        InvocationHandler handler=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("方法---"+method);
                if(method.getName().equals("morning")){
                    System.out.println("shit "+args[0]);

                }
                return null;
            }
        };
        Hello hello=(Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(),new Class[]{Hello.class},handler);
        hello.morning(" youtu");

    }
}
