public class Bicycle implements Vehicle{
    int speed;
    int gear;

    public Bicycle(int speed,int gear){
        this.speed=speed;
        this.gear=gear;

    }
    @Override
    public void changeGear(){
        System.out.println("Gear good");
    }
    @Override
    public void speedUp(int increment){
        System.out.println("Speed is high");
        speed+=increment;
    }
    @Override
    public void applyBrakes(int decrement){
        System.out.println("Brake is hard");
        speed-=decrement;
    }
    public void printStates(){
        System.out.println("Speed: "+speed+" Gear: "+gear);
    }
}

