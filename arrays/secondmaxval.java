public class secondmaxval{
    public static int smax (int[] arr){
        int n=arr.length;
        int result=0;
        int l=-1 ,sl=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]<l && arr[i]>sl){
                sl=arr[i];
            }
            
        }
        return sl;
    }
    public static void main(String[] args) {
        int[] arr ={3,5,7,9,5,6};
        System.out.println("secondmax element is :"+smax(arr));

    }
}