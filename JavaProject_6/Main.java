class Main {
    public static void main(String args[]){
        Animal a1=new Animal ();
        Animal a2=new Dog();
        Dog d1= new Dog();

//Same method name → different behavior depending on object → ✅ polymorphism

//Animal a1  etuk dekhe decision neya hche compile time
//new Animal(); etuk dekhe decision neya hche runtime

//late binding->runtime
//early binding->compile time
//Methods → can be late binding (polymorphic).
//Attributes (fields) → always early binding.



        a1.speak();//late
        a2.speak();//late

        a1.info();//early
        a2.info();//(early) :obj is created using dog ..still it prints which is in animal
        Animal.info();//early

        a1.sleep();//early
        a2.sleep();//(early) :obj is created using dog ..still it prints which is in animal


        //attributes always compile time
        System.out.println(d1.type);//early
        System.out.println(a1.type);//early
        System.out.println(a2.type);//early



    }
}