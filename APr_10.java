class squre {
    protected double s1;
 
    public double getside1() {
        return s1;
    }
 
    public void setside1(double s1) {
        this.s1 = s1;
    }
 
    public void area1() {
        System.out.println("The Square Area : ");
        System.out.println("The area of square is : " + this.s1 * this.s1);
    }
}
 
class ComparableSquare extends squre {
    protected double s2;
 
    public double getside2() {
        return s2;
    }
 
    public void setside2(double s2) {
        this.s2 = s2;
    }
 
    public void area2() {
        System.out.println();
        System.out.println("The ColorableSquare Area : ");
        System.out.println("The area of square is : " + this.s2 * this.s2);
    }
}
 
class test extends ComparableSquare
{
 
    public void comp() {
        
        if (s1 == s2) {
            System.out.println();
            System.out.println("The Square and ColorableSquare is Same!!!!");
        } else {
            System.out.println("The Square and ColorableSquare is NOT Same!!!!");
        }
    }
}
 
class APr_10 {
    public static void main(String[] args) {
    test t=new test();
    t.setside1(10);
    t.getside1();
    t.area1();
    t.setside2(9);
    t.getside2();
    t.area2();
    t.comp();
    }
}
