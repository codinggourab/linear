
import java.util.*;

public class linear_search {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        // input
        System.out.println("Enter the array element: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        // output
        for (int i = 0; i < size; i++) {

            if (number[i] == x) {
                System.out.println("x found ata index: " + i);
            }
        }
    }
}
