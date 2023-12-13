import java.util.Scanner;

class Stack {
    int top;
    int maxsize = 10;
    int[] arr = new int[maxsize];

    boolean isEmpty() {
        return (top < 0);
    }

    void stack() {
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
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

public class stackWithArray {
    public static void main(String[] args) {
        int choice=0;
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        System.out.println();

    }
}