package desgin.singleton;

/**
 * Created on 2021/4/5.3:03 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class DoubleCheck {
    private volatile static DoubleCheck instance=null;

    private DoubleCheck (){
    }

    public static DoubleCheck getInstance(){
        if(instance==null){
            synchronized (DoubleCheck.class){
                if(instance==null){
                    return new DoubleCheck();
                }
            }
        }
        return instance;
    }

}
