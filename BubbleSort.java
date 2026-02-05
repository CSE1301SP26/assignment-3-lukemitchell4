import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    System.out.print("How big is your array? ");
    int size = in.nextInt();
    int[] array = new int[size];

    System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

    System.out.print("Given values: ");
    printArray(array);
    bubbleSort(array);
    System.out.print("Sorted values: ");
    printArray(array);
    in.close();
}    

public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
