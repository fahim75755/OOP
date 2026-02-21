public class Main {
    public static int ratio(int pencil,int eraser) throws NegativeException,DivideByZero{

            if(pencil<0 || eraser<0)
            throw new NegativeException();

            if(eraser==0)
            throw new DivideByZero();

            return pencil/eraser;
            
    }

    public static void main(String []args){
        int pencil=9,eraser=-8;
        try {
            int result=ratio(pencil,eraser);
            System.out.println(result);
        } 

        catch (NegativeException e) {
            System.out.println(e.getMessage());
        }

        catch(DivideByZero e1){
            System.out.println(e1.getMessage());
        }
    }   
}
