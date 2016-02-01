package model;

/**
 *
 * @author jwardell
 */
public class CalculatorService {
    private String length;
    private String width;
    private String area;
    private String radius;
    private String sideC;

    public String getSideC(String sideA, String sideB) {
       int temp = (Integer.parseInt(sideA) * Integer.parseInt(sideA)) +  
                (Integer.parseInt(sideB) * Integer.parseInt(sideB));
       int newTemp = (temp/2);
       sideC = Integer.toString(newTemp);
        return "The 3rd side of the triangle is " + sideC;
    }

    public void setSideC(String sideC) {
        this.sideC = sideC;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    
    public String getSquareArea(String length, String width) {
        int value = Integer.parseInt(length) * Integer.parseInt(width);
        area = Integer.toString(value);
        return  "The area of that square is " + area;
    }
    
    public String getCircleArea(String radius) {
        double circle = (3.14159265359 * (Integer.parseInt(radius) * Integer.parseInt(radius))); 
        String circleArea = Double.toString(circle);
        return "The area of that circle is " + circleArea;
    }
}
