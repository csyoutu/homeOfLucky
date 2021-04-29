package desgin.Adapter;

import lombok.Data;

/**
 * Created on 2021/4/29.3:04 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
@Data
public class Adapter2 implements Target{

    private Adaptee adaptee;
    @Override
    public void Request() {
        this.adaptee.SpecificRequest();
    }
}
