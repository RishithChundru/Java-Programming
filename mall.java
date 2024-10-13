import java.util.Scanner;
public class mall{
    String customer_name;
    int customer_age;
    int products;
    float per_cost;
    float total_cost;
    public mall(String name,int age,int pro,float cost){
        customer_name=name;
        customer_age=age;
        products=pro;
        per_cost=cost;
        total_cost=pro*cost;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        System.out.println("Enter number of products: ");
        int pro=sc.nextInt();
        System.out.println("Enter cost: ");
        float cost=sc.nextFloat();
        mall res=new mall(name,age,pro,cost);
            System.out.println("Name: " +res.customer_name);
            System.out.println("Age: "+res.customer_age);
            System.out.println(res.products);
            System.out.println(res.per_cost);
            System.out.println(res.total_cost);
    }
}