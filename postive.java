import java.util.*;
public class postive {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println(+num+" is postive");
        }else {
            System.out.println(+num+ " is negative");
        }
    }
}