import java.util.Scanner;
import java.util.Random;

public class SymmetricalImage {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Random rand = new Random();


    System.out.print("How many rows? ");
    int rows = in.nextInt();
    System.out.print("How many columns? ");
    int cols = in.nextInt();

    char[][] image = new char[rows][cols];

    for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                image[r][c] = ' ';
            }
        }
    
    int points = (rows * cols) / 4;

    for (int i = 0; i < points; i++) {
        int r = rand.nextInt(rows);

            // Only pick from left half to avoid duplicates
            int c = rand.nextInt(cols / 2);

            int mirror = cols - 1 - c;

            image[r][c] = '*';
            image[r][mirror] = '*';
    }

    for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(image[r][c]);
            }
            System.out.println();
        }

}
}
