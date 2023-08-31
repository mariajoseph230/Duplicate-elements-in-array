
import java.util.Scanner;
public class Duplicate{
    public static boolean dup(int[] arr) {
        int n=arr.length;
        int i=0;
       for( i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                return true;
                  
            }}}
            return false;
           

         
    }


    

    public static void main(String args[]){
        int i,n,arr[];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        n=in.nextInt();
        arr=new int[n];
        System.out.println("Enter those elements:");
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
             }
             System.out.println( dup(arr));

        }
      
    }

