import java.util.Scanner;
public class sum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int sum = 0;
        while ( x != 0) {
            sum = sum + x;
            x = sc.nextInt();
        }

        System.out.println("the sum resulted in: " + sum);
        sc.close();
    }
}