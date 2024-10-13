                                          //  *** prime number***
/*import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int isprime=1;
        if(num<=1){
            isprime=0;
        }
        else{
        for(int i=2;i<=(num/2);i++){
            if(num%i==0){
                isprime=0;
                break;
            }
            else{
                isprime=1;
            }
        }
        }
        if(isprime==1){
            System.out.println("It is prime");
        }
        else{
            System.out.println("it is not");
        }
    }
}*/
                                                  //  ***fibonacci numbers**

import java.util.Scanner;
/*public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of digits: ");
        int dig=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<dig;i++){
            int res=a+b;
            System.out.println(res);
            a=b;
            b=res;
        }
    }
}*/
                                                    //***reverse a number***

/*import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int rem=0,reverse_num=0;
        while(num!=0){
            rem=num%10;
            reverse_num=(reverse_num*10)+rem;
            num/=10;
        }
        System.out.println(reverse_num);
    }
}*/

                                                //***LCM of two numbers***

/*public class Demo{
    public static int findGcd(int a,int b){
        if(b==0){
            return a;
        }
        return findGcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        int gcd=findGcd(num1,num2);
        int lcm=(num1*num2)/gcd;
        System.out.println(lcm);
    }
}*/
                                           //***Leap year or not***

/*public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=sc.nextInt();
        int isleap=0;
        if((year%4==0 && year%100!=0)||year%400==0){
            isleap=1;
        }
        else{
            isleap=0;
        }
        if(isleap==1){
            System.out.println("it is leap year!");
        }
        else{
            System.out.println("it is not leap year!");
        }
    }
}*/
                                        //***sum of digits in a number***

/*public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int sum=0;
        int digit;
        while(num!=0){
            digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println(sum);
    }
}*/
                                    //***sum of n natural numbers***

/*public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number that you  want to sum upto that: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}*/
 
                                    //***Neon number***

/*public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int square=num*num;
        int sum=0;
        while(square!=0){
            int digit=square%10;
            sum+=digit;
            square/=10;
        }
        if(num==sum){
            System.out.println("it is a neon number");
        }
        else{
            System.out.println("it is not");
        }
    }
}*/
                                        //***Bubble sort***


/*public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of elements: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array: ");
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
        bubbleSort(arr);
        System.out.println("After sorting: ");
        show(arr);
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void show(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    }*/
                                    //***table multiplication***

public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
                            
                            