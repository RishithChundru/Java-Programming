public class stringTo {
    private String name;
    private int age;
    public stringTo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        
        stringTo person = new stringTo("John Doe", 25);
        System.out.println(person.toString());
        //stringTo obj=new stringTo(name,age);
        //System.out.println(obj.toString());
    }
}