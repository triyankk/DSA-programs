import java.util.Scanner;

public class sorting_algorithms {

    static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.println("\niterations: " + (i + 1));
            for (int k : arr) {
                System.out.print(k + " ");
            }
            boolean flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = !flag;
                    break;
                }
            }
            if (flag)
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            else
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 1, 2, 3, 4,  };
        Scanner sc = new Scanner(System.in);

        System.out.println(" choose a sorting algorithm: ");
        System.out.println(" 1. Bubble sort ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:

                bubble_sort(arr);
                System.out.println("\n sorted!");

                break;

            default:
                break;
        }

    }
}
