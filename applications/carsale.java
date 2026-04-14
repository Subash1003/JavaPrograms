public class carsale {
    public static double car_depreciation(double depreciation_value,
        double initial_amount,
        int years){
        double value = initial_amount;
        for(int i=0;i<years;i++){
            value=value*(1-depreciation_value/100);
        }
        return value;
    }
    public static void main(String[] args) {
       double result= car_depreciation(5,5000,5);
        System.out.printf("%.1f",result);
    }
}
