//prepared by 21CE008 
interface Colorable {
    static void howToColor() {
    }
}
 
class GeometricObject implements Colorable {
    static void howToColor() {
        System.out.println("Color of the each side is Green");
    }
}
 
class Square extends GeometricObject {
    private double s1 = 0;
 
    Square() {
        System.out.println("The Default Squre is :");
        System.out.println("The area of square is : " + s1 * s1);
        System.out.println();
    }
 
    public double getside1() {
        return s1;
    }
 
    public void setside1(double s1) {
        this.s1 = s1;
    }
 
    public void area() {
        System.out.println("The Squre Successfully Created!!!!");
        System.out.println("The area of square is : " + this.s1 * this.s1);
    }
}
 
class APr_9 extends GeometricObject {
    public static void main(String[] args) {
        Square s = new Square();
        APr_9 p = new APr_9();
        
        s.setside1(20);
        s.getside1();
        s.area();
    }
}



