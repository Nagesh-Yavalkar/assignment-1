import java.util.*;
public class maxtwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num :");
        int num1 = sc.nextInt();
        System.out.println("Enter your first num :");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1 +" is greter than " +num2);
        } else {
              System.out.println(num2 +" is greter than " +num1);
        }

    }
    
}
