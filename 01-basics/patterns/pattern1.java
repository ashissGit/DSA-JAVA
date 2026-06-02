
import java.util.Scanner;


public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        printSquare(n);
        sc.close();
    }

    public static void printSquare(int n) {
        
    for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= n; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}