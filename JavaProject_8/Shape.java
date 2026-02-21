public class Shape{

    public void draw(){
        System.out.println("Drawing a shape");
    }
    public static void announce (){
        System.out.println("It's a generic shape");
    }
    public void show(){
        System.out.println("Display shape");
        announce();//shape.announce is used..compile time
    }
    public void center(){
    System.out.println("Shape is good");
    draw();
    }
}