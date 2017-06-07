package OnClass.Exten;

/**
 * Created by 29185 on 2017/5/31.
 */
public class Rect {
    protected double width ;
    protected double height;
    Rect(double width,double height){
        this.width = width;
        this.height = height;
    }
    Rect(){
        width = 10;
        height = 10;
    }
    public double area(){
        return width*height;
    }
    public double perimeter(){
        return 2*width*height;
    }
}
