public class Customer {
    int age,phone;
    String name,email;

    Customer(){
System.out.println("Default constructor is called");
    }
    Customer(String name,int age){
System.out.println("PARAMETERIZED Constructor is called");
    }
    Customer(String name,int age,String email,int phone){
System.out.println("Parameterized constructor is called"+"\n");
this.name=name;
this.age=age;
this.email=email;
this.phone=phone;
System.out.println(this.name+" "+this.age+" "+this.email+" "+this.phone);
    }
}
