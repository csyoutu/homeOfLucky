package algorithm.leetcode.lianbiao;

import algorithm.leetcode.model.ListNode;

/**
 * Created on 2021/3/25.12:09 上午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Num23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return mergeLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeLists(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];
        int mid = left + (right - left) / 2;
        ListNode l1 = mergeLists(lists, left, mid);
        ListNode l2 = mergeLists(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }

    ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode node=new ListNode(-1);
        ListNode curNode = node;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                curNode.next=l2;
                l2=l2.next;
            }else {
                curNode.next=l1;
                l1=l1.next;
            }
            curNode = curNode.next;
        }
        if(l1==null)
            curNode.next=l2;
        else
            curNode.next=l1;
        return node.next;
    }

}
