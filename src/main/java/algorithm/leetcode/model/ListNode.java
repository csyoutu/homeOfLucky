package algorithm.leetcode.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created on 2021/3/11.11:03 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class ListNode {
    public int val;

    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
