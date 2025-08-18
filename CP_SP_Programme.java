import java.util.Scanner;

public class CP_SP_Programme {
    public static void main(String[] args) {
        double sp,cp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cp value:");
        cp=sc.nextDouble();
        System.out.println("Enter the sp value:");
        sp=sc.nextDouble();
        if(sp>cp){
            System.out.print("Your profit is:");
            System.out.print(sp-cp);

        }
        else if(sp<cp){
            System.out.print("you are in loss:");
            System.out.println(cp-sp);
        }
        else if(sp==cp){
            System.out.println("Business is neither profit nor loss");
        }

    }
}
