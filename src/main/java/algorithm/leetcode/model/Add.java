package algorithm.leetcode.model;

import lombok.Data;

import java.util.List;

/**
 * Created on 2021/3/27.3:32 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
@Data
public class Add {
    String add;
    List<Integer> number;
    List<Add> adds;
}
