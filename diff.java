import java.util.Scanner;
public class diff {
    public static void main(String[] args){
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter no of columns: ");
        int col=sc.nextInt();
        System.out.println("Enter values in first matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter values in second matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(c[i][j]);
            }
        }
    }
}
