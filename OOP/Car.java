public class Car extends Vehicle{
    int engine,transmission;
public Car(){
super(0,0);

}
public Car(int accelerator,int brake,int engine){
super(accelerator,brake);

this.engine=engine;

}
}
