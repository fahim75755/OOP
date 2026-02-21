

public class Car extends Vehicle {
    int engine,transmission;
public Car(){
super(0,9);
}
public Car(int accelerator,int brake,int engine){
super(accelerator,brake);
this.engine=engine;

}
void displayCar(){
   System.out.println(engine);
}
}

