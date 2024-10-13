import java.util.Scanner;
public class complex{
    int real,image;
    public complex(int r,int i){
        this.real=r;
        this.image=i;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part: ");
        int r=sc.nextInt();
        System.out.println("Enter imaginary part: ");
        int i=sc.nextInt();
        complex res=new complex(r,i);
        System.out.println(res.real + " + " +  res.image + "i");
    }
}