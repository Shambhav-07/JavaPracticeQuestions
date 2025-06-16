public class LinkedListPracticeQuestion {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        newNode.next = head;
        head = newNode;
        if (tail == null) tail = newNode;
    }

    public void addEnd(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void insertAtPosition(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) return Integer.MIN_VALUE;
        int val = head.data;
        head = head.next;
        size--;
        if (head == null) tail = null;
        return val;
    }

    public int removeLast() {
        if (size == 0) return Integer.MIN_VALUE;
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void deleteAtPosition(int idx) {
        if (idx == 0) {
            removeFirst();
            return;
        }
        Node prev = head;
        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        if (prev.next == null) tail = prev;
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        tail = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void findMiddle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is: " + (slow != null ? slow.data : "None"));
    }

    public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
                size--;
            } else {
                current = current.next;
            }
        }
    }

    public static Node mergeSortedLists(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public void nthFromEnd(int n) {
        Node mainPtr = head, refPtr = head;
        for (int i = 0; i < n; i++) {
            if (refPtr == null) return;
            refPtr = refPtr.next;
        }
        while (refPtr != null) {
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }
        System.out.println("Nth node from end is: " + mainPtr.data);
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) return true;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private Node reverseList(Node head) {
        Node prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node getIntersection(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public boolean detectAndRemoveLoop() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                removeLoop(slow);
                return true;
            }
        }
        return false;
    }

    private void removeLoop(Node loopNode) {
        Node ptr1 = head;
        Node ptr2;
        while (true) {
            ptr2 = loopNode;
            while (ptr2.next != loopNode && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            if (ptr2.next == ptr1) break;
            ptr1 = ptr1.next;
        }
        ptr2.next = null;
    }

    public void rotate(int k) {
        if (k == 0 || head == null) return;
        Node curr = head;
        int count = 1;
        while (count < k && curr != null) {
            curr = curr.next;
            count++;
        }
        if (curr == null) return;
        Node kthNode = curr;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        head = kthNode.next;
        kthNode.next = null;
    }

    public void deleteNodeWithoutHead(Node node) {
        if (node == null || node.next == null) return;
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public boolean isIdentical(Node headA, Node headB) {
        while (headA != null && headB != null) {
            if (headA.data != headB.data) return false;
            headA = headA.next;
            headB = headB.next;
        }
        return headA == null && headB == null;
    }

    public Node findFirstNodeInLoop() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (slow != fast) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedListPracticeQuestion ll = new LinkedListPracticeQuestion();
        ll.addEnd(1);
        ll.addEnd(2);
        ll.addEnd(2);
        ll.addEnd(3);
        ll.display();
        ll.removeDuplicates();
        ll.display();
        ll.findMiddle();
        ll.reverse();
        ll.display();
        System.out.println("Is Palindrome: " + ll.isPalindrome());
    }
}
