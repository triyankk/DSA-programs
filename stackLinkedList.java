import static java.lang.System.exit;

class dummy {
    private class node {
        int data;
        node link;
    }

    node top;

    dummy() {
        this.top = null;
    }

    public void push(int x) {
        node temp = new node();

        if (temp == null) {
            System.out.println("Stack Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty())
            return top.data;
        else {
            System.out.println("stack is empty");
            return -1;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("stack is underflow");
            return;
        }
        top = (top).link;

    }

    public void display() {
        if (top == null) {
            System.out.println("underflow");
            exit(1);
        } else {
            node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.link;
                if (temp != null) {
                    System.out.println("-> ");
                }
            }
        }
    }

}
public class stackLinkedList {
    public static void main(String[] args) {
        dummy obj = new dummy();
        System.out.printf("top element is %d\n", obj.peek());
        obj.push(12);
        obj.push(13);
        obj.push(14);
        obj.push(15);
        obj.push(16);
        obj.display();
        System.out.printf("top element is %d\n", obj.peek());
        obj.pop();
        obj.pop();
        obj.display();
        System.out.printf("top element is %d\n", obj.peek());

    }

}
