import java.util.Scanner;

public class constructors {
    String name;
    int reg_no;

    public constructors(String name, int reg) {
        this.name = name; // Use 'this' to refer to the class field
        reg_no = reg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your registration number: ");
        int reg = sc.nextInt();
        constructors res = new constructors(name, reg);
        System.out.println("Name: " + res.name);
        System.out.println("Registration Number: " + res.reg_no);
    }
}
