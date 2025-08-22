import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int decimal_num = sc.nextInt();
        int ans = 0 ;//binary number

        int pw = 1 ; //powers of 10


        while(decimal_num > 0){
            int parity = decimal_num % 2;
            ans += (parity * pw) ;
            pw *= 10;
            decimal_num /=2;

        }
        System.out.println("The binary number is :"+ans);
    }
}
