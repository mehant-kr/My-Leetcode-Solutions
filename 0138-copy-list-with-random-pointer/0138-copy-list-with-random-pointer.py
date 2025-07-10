"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        # if not head:
        #     return None

        # my_dict = {}
        # while head:
        #     my_dict[head] = Node(head.val)
        #     head = head.next
        
        # keys = list(my_dict.keys())
        # for i in range(len(keys) - 1):
        #     my_dict[keys[i]].next = my_dict[keys[i+1]]
        #     if (keys[i].random):
        #         temp = my_dict[keys[i].random]
        #     else:
        #         temp = None
        #     my_dict[keys[i]].random = temp

        # if keys[len(keys)-1].random:
        #     # print(keys[len(keys)-1].random.val)
        #     temp = my_dict[keys[len(keys)-1].random]
        # else: 
        #     temp = None
        # my_dict[keys[len(keys)-1]].random = temp
        
        # newHead = my_dict[keys[0]]
        
        # # while newHead:
        # #     print(newHead.val)
        # #     newHead = newHead.next
        # return newHead


        oldToCopy = {None: None}
        cur = head

        while cur:
            oldToCopy[cur] = Node(cur.val)
            cur = cur.next

        cur = head

        while cur:
            copy = oldToCopy[cur]
            copy.next = oldToCopy[cur.next]
            copy.random = oldToCopy[cur.random]
            cur = cur.next

        return oldToCopy[head]
        