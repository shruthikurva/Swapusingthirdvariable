import java.util.Scanner;

public class SwapusingthirdVariable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=scanner.nextInt();
        System.out.println("Enter the second number");
        int b= scanner.nextInt();
        System.out.println("\nBefore swapping:a=" + a + ", b = " + b ); 
int temp=a;
a=b;
b=temp;
System.out.println("after swapping:a="+a+",b"+b);
scanner.close();
    }
}
