public class perfectsquare{
    public static boolean  psquare( int num){
           int n=(int)Math.sqrt(num);
            return n*n == num; 
    }
    public static void main(String[] args) {
       System.out.println(psquare(64));
    
    }
}