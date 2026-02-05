import java.util.Scanner;
import java.util.Random;

public class FrequencyTable {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("How many dice do you want to roll? ");
    int dice = in.nextInt();

    int maxSum = dice * 6;

    int[] frequency = new int[maxSum+1];

    for (int roll = 0; roll < 10000; roll++) {
        int total = 0;
        for (int d = 0; d < dice; d++) {
            total += rand.nextInt(6) + 1;
        }
        frequency[total]++;
    }

    System.out.println("Total     Frequency");

        for (int i = dice; i <= maxSum; i++) {
            System.out.println(i + "         " + frequency[i]);
        }
}
}
