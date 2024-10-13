/*public class Throw{ 
        void check(int a){
        if(a<18){
            throw new ArithmeticException("not eligible");
        }
        else{
            System.out.println("You are eligible");
        }
    }
    public static void main(String[] args){

Throw t=new Throw();
            try{t.check(17);}
            catch(ArithmeticException e){
                        System.out.println("Something went wrong!! "+e.getMessage());
            }
    }
}*/
/*public class Throw{
    int div(int a,int b) throws ArithmeticException{
        int c=a/b;
        return c;
    }
    public static void main(String[] args){
        Throw t=new Throw();
        int ans=t.div(20,3);
        System.out.println(ans);
    }}*/
    
/*public class Throw {
        public static void main(String[] args) {
            try {
                // Code that may throw multiple exceptions
                int[] numbers = {1, 2, 3};
                int result = numbers[4] / 0; // This line will throw ArrayIndexOutOfBoundsException or ArithmeticException
            } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
                // Handling multiple exceptions
                System.out.println("Exception caught: " + e);
            }
        }
    }
 */
/*class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class Throw{
    int check(int a)throws CustomException{
        if(a<18){
            throw new CustomException("You are not eligible to vote");
        }
        else{
            System.out.println("You are eligible to vote");
            return a;
        }
     }
    public static void main(String[] args){
        Throw t=new Throw();
        try{
            t.check(1);
        }
        catch(CustomException e){
            System.out.println("This is custom Exception! "+e.getMessage());
        }
    }
}*/



