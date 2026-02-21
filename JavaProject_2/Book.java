public class Book extends Item {
    String author;
  
    void displayInfo(){
System.out.println(" Bangladesh");
    }
    Book(String author,String title,int id){
        
        this.author=author;
        this.title=title;
        this.id=id;
    }

    void displayBook(){
        System.out.println(author+" "+title+" "+id);

    }
}
