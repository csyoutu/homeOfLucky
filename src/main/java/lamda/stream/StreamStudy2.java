package lamda.stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import lamda.stream.model.Employee;
import lamda.stream.model.Status;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static lamda.stream.model.Status.FREE;

/**
 * Created on 2021/3/9.11:51 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class StreamStudy2 {
    public static void main(String[] args) {
//        allMatch(Predicate p) 检查是否匹配所有元素
//        anyMatch( (Predicate p) ) 检查是否至少匹配一个元素
//        noneMatch(Predicate p) 检查是否没有匹配所有元素
//        findFirst() 返回第一个元素
//        findAny() 返回当前流中的任意元素
//        count() 返回流中元素总数
//        max(Comparator c c) ) 返回流中最大值
//        min(Comparator c c) ) 返回流中最小值
//        forEach(Consumer c c) ) 内部迭代 ( (用 使用  Collection  接口需要用户去做迭代，称为 外部迭代 。相反， Stream API  使用内部迭代 —— 它帮你把迭代做了) )

        List<Employee> emps = Arrays.asList(
                new Employee(1, "Emma", 41,1000,FREE),
                new Employee(2, "Mary", 39,2000, Status.BUSY),
                new Employee(3, "Allen", 3,3000, Status.FREE),
                new Employee(4, "Olivia", 52,3000, Status.BUSY),
                new Employee(5, "Natasha", 27,3000, Status.FREE),
                new Employee(6, "Kevin", 25,3000, Status.BUSY),
                new Employee(7, "Haivent", 25,3000, Status.FREE)
        );
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        emps.stream()
                .filter(e -> e.getAge() > 10)
                .skip(2).distinct()
                .forEach(e -> System.out.println(e));

        emps.stream().mapToDouble(e->e.getAge()+e.getSalary()).forEach(
                e-> System.out.println(e)
        );

        emps.stream().allMatch(e->e.getStatus().equals(FREE));

        emps.stream().map(Employee::getSalary).reduce(Long::sum);

        Integer result=numList.stream().reduce(0,(x,y)->x+y);
        System.out.println(result);

//        emps.stream().map(e->e.getName())
//                .flatMap(StreamAPI03::filterCharacter)
//                .map(e->{
//                    if(e.equals('A')){
//                        return 1;
//                    }else {
//                        return 0;
//                    }
//                }).reduce(0,(x,y)->x+y);
        Map<Status, List<Employee>> collect=emps.stream().collect(Collectors.groupingBy(e->e.getStatus()));
        System.out.println(collect);
    }
}
