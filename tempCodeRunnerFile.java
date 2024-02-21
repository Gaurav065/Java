class square extends shape{
    double side;
    square(double a){
        this.side = a;
    }
    double area(){
        return side*side;
    }
}