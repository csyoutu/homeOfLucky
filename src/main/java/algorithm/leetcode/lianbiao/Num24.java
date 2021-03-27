package algorithm.leetcode.lianbiao;

import algorithm.leetcode.model.ListNode;

/**
 * Created on 2021/3/25.11:11 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Num24 {
    public ListNode swapPairs(ListNode head) {
        //   1->2->3->4
        //0->1->2->3->4
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
            ListNode start=temp.next;
            ListNode end=temp.next.next;
            temp.next=end;
            start.next=end.next;
            end.next=start;
            temp=start;
        }
        return pre.next;
    }
}
