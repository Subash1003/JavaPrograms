
public class maxandmin {
    public static int[] maxmin(int []arr){
        int n=arr.length;
      int max=arr[0],min=arr[0];
      for(int i=1;i<n;i++){
        if(arr[i]>max)
           max=arr[i];
        else if(arr[i]<min)
           min=arr[i];
      }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        int[] arr ={5,7,8,4,3,6,1,4};
        int[] result = maxmin(arr);
      System.out.println("max is "+result[0]);
        System.out.println("min is "+result[1]);

    }
}
