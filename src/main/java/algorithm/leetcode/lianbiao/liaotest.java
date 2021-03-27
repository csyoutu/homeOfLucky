package algorithm.leetcode.lianbiao;

import algorithm.leetcode.model.ListNode;

/**
 * Created on 2021/3/26.5:28 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class liaotest {
    public static ListNode mergeList(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeList(l1.next, l2);
            return l1;
        }
        l2.next = mergeList(l1.next, l2);
        return l2;


    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        ListNode re = mergeList(l1, l4);
        System.out.println(re);
    }
}
