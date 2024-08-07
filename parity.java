import java.util.*;

class parity{
    public static void main(String[] args) {
        //find a parity of the number using bit manipulation
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();

        if((x & 1) ==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}