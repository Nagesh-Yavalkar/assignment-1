import java.util.*;
public class uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your chr");
        char ch = sc.next().charAt(0);
        if( ch>='A' && ch<='Z'||ch>=65 && ch<=90){
            System.out.println("upercase");
        }else{
            System.out.println("lowercase");
        }
    }
    
}
