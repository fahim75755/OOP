class Vec{

    int x,y;

    public Vec(int x,int y){
        this.x=x;
        this.y=y;

    }
    

    public double cal (Vec a,Vec b,Vec c){

        double ans = (a.x * b.x * c.x)+(a.y *b.y+c.y);

        return ans;

    }

}