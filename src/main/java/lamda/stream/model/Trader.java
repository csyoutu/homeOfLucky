package lamda.stream.model;

import lombok.Data;

/**
 * Created on 2021/3/7.11:20 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
@Data
public class Trader {
    private String name;
    private String city;
    public Trader() {
    }

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
