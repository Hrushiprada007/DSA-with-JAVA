import java.util.Scanner;

//Take integer input and print the absolute value of that integer
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number:");
        int n=sc.nextInt();
        if(n<0){
           // System.out.println("The number is:"+ -(n));
            System.out.println("The negati number's abosoulute value is:"+ n*(-1));
        }
        else{
            System.out.println("The Positive number is:"+n);
        }

    }
}
