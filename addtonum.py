class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class addtonum:
    def addTwoNumbers(self, l1, l2):

        dummy = ListNode(0)
        current = dummy
        carry = 0

        while l1 or l2 or carry:

            if l1:
                val1 = l1.val
            else:
                val1 = 0

            if l2:
                val2 = l2.val
            else:
                val2 = 0

            total = val1 + val2 + carry

            digit = total % 10
            carry = total // 10

            current.next = ListNode(digit)
            current = current.next

            if l1:
                l1 = l1.next

            if l2:
                l2 = l2.next

        return dummy.next