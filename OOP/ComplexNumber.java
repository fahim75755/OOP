public class ComplexNumber {
    int real,im;
    ComplexNumber(){

    }
    ComplexNumber(int real,int im){
        this.real=real;
        this.im=im;
    }
 public void add(ComplexNumber B2){
ComplexNumber c =new ComplexNumber();
c.real=this.real+B2.real;
c.im=this.im+B2.im;

System.out.println(c.real+" "+c.im);

    
 }
    
}
