public class Main{
    public static void main(String []args){
        Bicycle B=new Bicycle(10,5);
        B.changeGear();
        B.speedUp(4);
        B.applyBrakes(2);
        System.out.println("------------------ ");
        
        B.printStates();
        System.out.println("------------------ ");

        Vehicle V =new Bicycle(50,100);
        V.printStates();

        System.out.println("------------------ ");
        B.printStates();

    }
    
}
