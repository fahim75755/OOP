public class Main {

    public static void main(String []args){
        
        int n=9;
        for(int i=0;i<n;i++){
            MultiThread M = new MultiThread();
            M.start();
        }
    }
    
}
