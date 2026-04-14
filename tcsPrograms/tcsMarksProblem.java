
import java.util.*;
public class tcsMarksProblem
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("size of matrics");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    System.out.println("enter internal marks");
	    
	    int internal[][]=new int[a][b];
	    for(int i=0;i<a;i++){
	        for(int j=0;j<b;j++){
	            internal[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("enter external marks");
	    int external[][]=new int[a][b];
	    for(int i=0;i<a;i++){
	        for(int j=0;j<b;j++){
	            external[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("enter the index to be calculated");
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	   int totMarks=internal[c][d]+external[c][d];
		System.out.println(totMarks);
	}
}
