import java.util.Scanner;
public class Demo013{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();
        int area = (int) (0.5 * base * height) ;
        System.out.println("Area of Triangle is: " + area);
        sc.close();
        
    }
}