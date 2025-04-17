public class Shape {

    private String color = "white" ;

    public Shape(String COLOR){

    }

    public Shape(int i, int sideA) {
    }

    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }


    public double area(){

        return 0.0;
    }
    public double perimeter(){
        return 0.0;
    }
    public void describe(int sideA , int sideB){
        System.out.println("side A is"+ sideA
                + "side B ia " + sideB);
    }

    public void describe(int sideA){
        System.out.println("radius is"+ sideA);
    }

    public void describe(double sideA){
        System.out.println("radius is"+ sideA);
    }



}