import java.util.Scanner;

public class ConditionsOperator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int  value;
        System.out.println("Enter a Value:");
        value = obj.nextInt();
        if(value %2 ==0 && value % 3 == 0){ // (Logical Operator)if all the conditions are true, only that it evalueates true.
            System.out.println("found answer:"+value);
        }
    }
}
