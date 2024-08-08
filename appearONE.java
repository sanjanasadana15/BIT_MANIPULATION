public class appearONE {
    public static void main(String[] args){
        /* Find the element which appears once in the array */
        int [] arr={7,2,3,2,5,3,7};
        int num=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            num= num^arr[i];
        }
        
        System.out.println("num:"+num);
    }
}
