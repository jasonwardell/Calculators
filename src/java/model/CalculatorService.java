package model;

/**
 *
 * @author jwardell
 */
public class CalculatorService {
    private String length;
    private String width;
    private String area;

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
    
    public String getArea(String length, String width) {
        int value = Integer.parseInt(length) * Integer.parseInt(width);
        value = Integer.parseInt(area);
        return  "The area of that square is " + area;
    }
}
