package lamda.stream.model;

import lombok.Data;

/**
 * Created on 2021/3/8.11:50 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
@Data
public class Employee {
    Integer num;
    String name;
    int age;
    long salary;
    Status status;

    public Employee(Integer num, String name, int age,long salary,Status status) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.salary=salary;
        this.status=status;
    }
}
