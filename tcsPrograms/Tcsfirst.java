import java.util.*;
public class Tcsfirst{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
      }
      LinkedHashSet<Integer>tl=new LinkedHashSet<Integer>(); 
      for(int i=0;i<n;i++){
        tl.add(arr[i]);
      }
      ArrayList<Integer>al=new ArrayList<>(tl);
      for(int i=al.size()-1;i>=0;i--){
              System.out.print(al.get(i)+" "); 
      }
     

    }
}