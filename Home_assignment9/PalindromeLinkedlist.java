// package Home_assignment9;

import java.util.*;

public class PalindromeLinkedlist {

    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;

        // Push all node values onto the stack
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        // Reset pointer to head and compare with stack values
        curr = head;
        while (curr != null) {
            if (curr.val != stack.pop()) {
                return false;
            }
            curr = curr.next;
        }

        return true;
    }
}
    
}


// Time Complexity (TC):
// - O(n):
// - First traversal to push all values into the stack.
// - Second traversal to compare values with stack.
// 🧠 Space Complexity (SC):
// - O(n):
// - Stack stores all node values, requiring linear space.


