package algorithm.leetcode.lianbiao;

import algorithm.leetcode.model.ListNode;

/**
 * Created on 2021/3/11.11:03 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Num19 {
    //1 - 2 -3 -4  -6
    //
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
