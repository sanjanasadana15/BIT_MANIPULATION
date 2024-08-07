public class arrayAdd {
    public static void main(String[] args) {
        int[] arr={5,3,9,2,1,6};
        int n=arr.length;
        int max=arr[0];
       
        System.out.println(n);
        for(int i=1; i<n; i++){
            if( max < arr[i])
                max = arr[i];
        }
        System.out.println(max);
        boolean[] arry = new boolean[max+1];
        
        for(int i=0; i<n; i++){
            int val=arr[i];
           
            arry[val]= true;
        }
        
        for(int i=0; i<max; i++){
            System.out.print(arry[i]+ " ");
        }
        System.out.println();
        int k = 12;
        for(int i=0; i< max; i++){
           int elementstobesearched = k - arr[i];
                if( (arry[elementstobesearched]) == true){
                    System.out.println("True");
                    break;
                }
                    
                else
                    System.out.println("False");
        }


    }
}
