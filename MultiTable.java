import java.util.*;

public class MultiTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.printf("Table of %d is:\n",n);
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d \n",n,i,n*i);
        }
    }
}