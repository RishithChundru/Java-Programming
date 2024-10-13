/*public class InstanceOf {
    public static void main(String[] args){
        InstanceOf obj=new InstanceOf();
        System.out.println(obj instanceof InstanceOf);
    }
}*/
import java.util.*;
import java.io.*;
/*class Animal{
    void sound(){
        System.out.println("Some animal sound!");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bow Bow!");
    }
    void WaigTail(){
        System.out.println("Tail Wagging!");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow Meow!");
    }
    void Purr(){
        System.out.println("Cat Purring");
    }
}
public class InstanceOf{
    public static void main(String[] args){
        Animal animal1=new Dog();
        Animal animal2=new Cat();
        if(animal1 instanceof Dog){
            Dog dog=new Dog();
            dog.sound();
            dog.WaigTail();
        }
        if(animal2 instanceof Cat){
            Cat cat=new Cat();
            cat.sound();
            cat.Purr();
        }
    }
}*/
class Vehicle{
    void drive(){
        System.out.println("Drive the vehicle!");
    }
}
class Car extends Vehicle{
    @Override
    void drive(){
        System.out.println("car is being driven");
    }
    void park(){
        System.out.println("Park the Car!");
    }
}
class Bike extends Vehicle{
    @Override
    void drive(){
        System.out.println("bike is being driven");
    }
    void RingHorn(){
        System.out.println("Kee Kee Kee!");
    }
}
public class InstanceOf{
    public static void main(String[] args){
        Vehicle v1=new Car();
        Vehicle v2=new Bike();
        Vehicle v3=new Vehicle();
        v3.drive();
        if(v1 instanceof Car){
            Car car=new Car();
            car.drive();
            car.park();
        }
        if(v2 instanceof Bike){
            Bike bike=new Bike();
            bike.drive();
            bike.RingHorn();
        }
        //v3.drive();
    }
}