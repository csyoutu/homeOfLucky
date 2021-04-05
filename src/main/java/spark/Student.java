package spark;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2021/4/1.11:35 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
@Data
public class Student implements Serializable {
    private String name;
    private int age;
    private String sex;
    private Double math;
    private int rank;
    private List<String> loves;

    public Student(String name, int age, String sex, double math, int rank) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.math = math;
        this.rank = rank;
    }
}
