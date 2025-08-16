import java.util.Scanner;

public class Check_Two_Digit {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n>9 && n<100){
            System.out.println("This is a two digit number:"+n);
        }
        else{
            System.out.println("This is not a two digit number"+n);
        }
    }
}
