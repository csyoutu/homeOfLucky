package desgin.Bridge;

import lombok.Data;

/**
 * Created on 2021/4/30.11:49 上午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
@Data
public abstract class AbstractPhone {
    public Memory memory;

    public AbstractPhone(Memory memory){
        this.memory=memory;
    }

    public abstract void doSomething();
}
