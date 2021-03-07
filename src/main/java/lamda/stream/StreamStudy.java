package lamda.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created on 2021/3/7.11:06 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class StreamStudy {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        String [] results=stream.filter(x->x.startsWith("郭")).toArray(String []::new);
        System.out.println(results);


        ArrayList<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");
        list.stream().limit(2).forEach(e-> System.out.println(e.toString()));
        list.stream().skip(list.size()-2).forEach(e-> System.out.println(e));


        Stream<Integer> s = Stream.of(1, -2, -3, 4,-5);
        s.map(x->Math.abs(x)).forEach(e-> System.out.println(e));

        Stream<String> streamA = Stream.of("郭靖", "杨康");
        Stream<String> streamB = Stream.of("黄蓉", "穆念慈");
        List<String> r=Stream.concat(streamA,streamB).collect(Collectors.toList());
        r.forEach(e-> System.out.println(e));


    }
}
