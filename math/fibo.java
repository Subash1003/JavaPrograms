
public class fibo {
    public static void fibonacci(int num){
        int first=0 ,second=1,third;
        while(true){
        third=(first+second);
        if (third>num)
            break;
        System.out.print(third+",");
        first=second;
        second=third;
        }

    }
    public static void main(String[]args){
        int num=10;
        fibonacci(num);
    }
}
