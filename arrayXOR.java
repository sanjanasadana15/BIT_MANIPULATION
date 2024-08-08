public class arrayXOR {
    public static void main(String[] args) {
        int [] arr={3,2,8,5,4};
        int k=2;
        int max=arr[0];
        int n=arr.length;
        for(int i=1; i<n;i++)
        {
            if(max < arr[i])
                max =arr[i];
        }
        System.out.println("max="+max);
        boolean[] input= new boolean[max+1];

        for(int i=0;i<n;i++){
            int val=arr[i];
            input[val]=true;
        }
        System.out.println("max20="+max);
        boolean found = false;
        for(int i=0;i<n;i++){
            int val2= k ^ arr[i];
            if( val2 <= max && input[val2] ){
                found =true;
                break;
            }
               
        }

        if(found)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
