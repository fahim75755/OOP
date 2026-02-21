public class Complex {
      int real,im;
    public Complex(){
        System.out.println("Default");
    }
    public Complex(int real,int im){
        System.out.println("Parameterized");
        this.real=real;
        this.im=im;
    }
    public Complex(Complex a){
        System.out.println("Copy");
        this.real=a.real;
        this.im=a.im;
    }
    public void sum(Complex a)
   {
       Complex c=new Complex();
       c.real=a.real+this.real;
       c.im=a.im+this.im;
      System.out.println(c.real+" "+c.im);
   }
   public void setValue(int real,int im){
       this.real=real;this.im=im;
   }
}
