public class factroial{
    public static int fact(int num){
        int n=1;
        while(num>0){
            n=n*num;
            num--;
        }
        return n;
    }
 public static void main(String [] args){
    int num=5;
    System.out.print(fact(num));

    }
}