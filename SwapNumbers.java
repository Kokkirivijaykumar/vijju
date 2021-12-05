import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner v = new Scanner(System.in);
        x = v.nextInt();
        y = v.nextInt();
        System.out.println("Before Swapping" + x + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping" + x + y);
         
    }
 
}
