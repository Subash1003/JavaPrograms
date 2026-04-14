import java.util.*;
public class fuel_calculator {

    public static int trip_calculator(int millage, int fuel_price) {
        
        int gallons = (int)Math.ceil(500.0/millage);
        int result = fuel_price*gallons;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int millage = sc.nextInt();
       int fuel_price= sc.nextInt();
        System.out.print(trip_calculator(millage,fuel_price));

        sc.close();
       
    }
}
