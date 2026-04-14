public  class leapyear{
    public static boolean LeapyearOrNot(int year){

        if((year%400==0) || (year%4==0 && year%100!=0))
            return true;
        else
             return false;
        
    }
    public static void main(String[] args) {
        int year=1982;
        System.out.println(LeapyearOrNot(year));
    }
}