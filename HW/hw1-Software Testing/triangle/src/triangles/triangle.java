package triangles;

public class triangle {

    private int side1, side2, side3;

    // Constructor
    public triangle(int s1, int s2, int s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    // test is all values > 0
    public boolean is_greaterThanZero(){
        return ((side1 > 0) && (side2 > 0) && (side3 > 0));
    }

    // test is it a triangle
    public boolean is_triangle(){
        return (((side1 + side2) > side3) && ((side2 + side3) > side1) && ((side1 + side3) > side2));
    }

    // equilateral
    public boolean is_equilateral(){
        return ((side1 == side2) && (side2 == side3));
    }

    // isosceles
    public boolean is_isosceles(){
        return (((side1 == side2) && (side1 != side3)) || ((side1 == side3) && (side1 != side2)) || ((side2 == side3) && (side2 != side1)));

    }

    // scalene
    public boolean is_scalene(){
        return ((side1 != side2) && (side1 != side3) && (side2 != side3));

    }
}
