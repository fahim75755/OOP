public class Main2 {
    public static void main(String[] args) {

        Complex defaultComplex = new Complex();

        Complex parameterizedComplex = new Complex(9, 4);

        Complex copyComplex = new Complex(parameterizedComplex);
        
        Complex write = new Complex(20,30);

        System.out.println("Default Complex: " + defaultComplex.real + " + " + defaultComplex.im);
        System.out.println("Parameterized Complex: " + parameterizedComplex.real + " + " + parameterizedComplex.im);
        System.out.println("Copy Complex: " + copyComplex.real + " + " + copyComplex.im);
    copyComplex.sum(write);

    }
}

