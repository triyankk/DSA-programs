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
            
        }
    }

}

public class stackLinkedList {
    public static void main(String[] args) {

    }

}
