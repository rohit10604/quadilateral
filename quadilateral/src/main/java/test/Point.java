package test;

public class Point {


    private String x;
    private String y;

    public Point(){

    }

    public String pointPrint(){
        return x+" " + y;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
