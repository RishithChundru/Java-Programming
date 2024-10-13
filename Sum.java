import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of elements: ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
        }
        double average=sum/arr.length-1;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(average);
        System.out.println(max);
    }
}
