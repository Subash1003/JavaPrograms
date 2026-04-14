import java.util.*;
public class Tcssecond {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
         int k=sc.nextInt();
         int sol=0;
         for(int i=0;i<c.length;i++){
            if(c[i]==k){
                sol=i;
            }
         }
         System.out.print(sol);
    }
}
