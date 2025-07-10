# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        if (l1.val == 0 and l2.val == 0 and l1.next == None and l2.next == None):
            return ListNode(0)
            
        list1 = []
        while l1:
            list1.append(l1.val)
            l1 = l1.next
        
        list2 = []
        while l2:
            list2.append(l2.val)
            l2 = l2.next

        a = 0
        while list1:
            a = (a * 10) + list1.pop()

        b = 0
        while list2:
            b = (b * 10) + list2.pop()

        result = a + b

        # create the linked list for result
        # get the last value
        
        head = ListNode()
        while result != 0:
            last = result % 10
            newNode = ListNode(last)
            result = result // 10
            current = head
            if not head:
                head = newNode
            else:
                while current.next:
                    current = current.next
                current.next = newNode
            
        return head.next


        