public class Rectangle extends Shape{
    public Rectangle(String COLOR, int sideA, int sideB) {
        super(COLOR);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    private int sideA = 0, sideB= 0;

    public Rectangle(int i, int sideA) {
        super(i, sideA);
    }


    public void describe(){
        System.out.println("side a is "+ this.sideA + "side b "+ this.sideB);
    }

    public boolean equals(Object obj){
        Rectangle r = (Rectangle) obj;
        if(this.sideA == r.sideA && this.sideB == r.sideB && this.getColor() == r.getColor()){
            return true;
        }else {
            return false;
        }

    }

}
