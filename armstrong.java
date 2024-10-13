import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        int org_num,rem=0,res=0,n=0;
        org_num=number;
        while(org_num!=0){
            org_num/=10;
            n++;
        }
        org_num=number;
        while(org_num!=0){
            rem=org_num%10;
            res+=Math.pow(rem,n);
            org_num/=10;
        } 
        if(res==number){
            System.out.println("it is armstrong");
        }
        else{
            System.out.println("it is not");
        }
    }
}

/*public class armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        int org_num,rem=0,res=0,n=0;
        org_num=number;
        while(org_num!=0){
            org_num/=10;
            n++;
        }
        org_num=number;
        while (org_num!=0) {
            rem=org_num%10;
            res+=Math.pow(rem,n);
            org_num/=10;
        }
        if(res==number){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not");
        }
    }
}*/