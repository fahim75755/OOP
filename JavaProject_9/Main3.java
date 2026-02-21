public class Main3 {


    public static double safeDivide( int nominator, int denominator){

                try{
                if (denominator == 0)
                throw new DivideByZero();
                return nominator / (double) denominator;
                }

                catch(DivideByZero e){
                System.out.println(e.getMessage());
                return -1;
                }
    }


    public static void main(String []args){

    double r=safeDivide(7,0);
    System.out.println(r);
    }
}
