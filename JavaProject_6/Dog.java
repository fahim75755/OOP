public class Dog extends Animal {
    String type="DOG";

    @Override
    void speak(){
        System.out.println("Dog barks loudly");
        System.out.println(type);

    }
     public static void info(){
        System.out.println("Dogs are loyal");
    }
    
}
