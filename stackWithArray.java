import java.util.Scanner;

class Stack {
    int top;
    int maxsize = 10;
    int[] arr = new int[maxsize];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    void push(Scanner sc) {
        if (top == maxsize)
            System.out.println("overflow");
        else {

            System.out.println("Enter an Integer");
            int num = sc.nextInt();
            top++;
            arr[top] = num;
            System.out.println("item pushed");
        }
    }

    void pop() {
        if (top < 0)
            System.out.println("Underflow");
        else {
            top--;
            System.out.println("item popped");
        }

    }

    void display() {
        for (int i = 0; i < top; ++i) {
            System.out.println(arr[i]);
        }
    }
}

public class stackWithArray {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        while (true) {
            System.out.println("\nEnter choice 1-5 \n1-IsEmpty\n2-push\n3-pop\n4-display all element\n5-exit");
            choice = sc.nextInt();
            if (choice == 5)
                break;

            switch (choice) {
                case 1:
                    System.out.println("\n" + s.isEmpty());
                    break;
                case 2:
                    s.push(sc);
                    break;
                case 3:
                    s.pop();
                    break;
                case 4:
                    s.display();
                    break;
                default:
                    System.out.println("enter a valid input");
                    break;
            }
        }
    }
}