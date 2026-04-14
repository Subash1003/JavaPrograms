public class prime {
    public static boolean prm(int num){
        if(num<1)
            return false;
        if(num==2)
            return true;
        if(num%2==0)
            return false;
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main (String[]args){
        int num = 9;
        if(prm(num)==true) {
            System.out.print(num+" is prime");
        }
        else{
            System.out.print(num+" is  not prime");
        }
    }
}
