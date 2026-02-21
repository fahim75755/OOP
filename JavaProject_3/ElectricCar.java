public class ElectricCar extends Car{
    int battery,charge_time;
    public ElectricCar (){


    }
    public ElectricCar(int battery,int charge_time,int accelerator,int brake,int engine,int transmission){
        super(accelerator,brake,engine);
        this.battery=battery;
        this.charge_time=charge_time;
       this.transmission=transmission;

     

    }
    void displayElectricCar(){
        System.out.println(battery+" "+charge_time+" "+transmission);
    }
    
    
}
