import java.util.Scanner;
public class palindrome {
    public static boolean palin(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev= rev + str.charAt(i);
        }
        return rev.equals(str);
    }
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string: ");
        String str= sc.nextLine();
        System.out.println(palin(str));
        sc.close();

    }
}
