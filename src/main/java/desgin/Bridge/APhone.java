package desgin.Bridge;

/**
 * Created on 2021/4/30.2:03 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class APhone extends AbstractPhone {
    @Override
    public void doSomething() {
        memory.addMemory();
    }

}
