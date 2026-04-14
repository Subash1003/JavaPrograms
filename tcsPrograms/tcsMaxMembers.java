import java.util.Arrays;
import java.util.Scanner;

public class tcsMaxMembers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        System.out.println("enter the size of group");
        int group=sc.nextInt();
        System.out.println("enter the num values");
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr.length %2!=0){

        }




    }
}