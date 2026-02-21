public class Main2 {
    public static void main(String args[]){
        int n=8;
        for(int i=0;i<n;i++){
            Thread obj=new Thread(new MultiThread2());
            obj.start();
        }
    }
    
}
