//***largest and smallest in array****
import java.util.Scanner;
public class lar_sma_array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of elements in array: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The original array: ");
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<num;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest array element is: " + largest);
        System.out.println("Smallest array element is: " + smallest);
    }
}