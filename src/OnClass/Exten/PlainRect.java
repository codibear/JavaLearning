package OnClass.Exten;

/**
 * Created by 29185 on 2017/5/31.
 */
public class PlainRect extends Rect {
    private double startX;
    private double startY;
    PlainRect (double startX,double startY,double width,double height){
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }
    PlainRect(){
        this.startY = 0;
        this.startX = 0;
        this.width = 0;
        this.height = 0;
    }
    public boolean isInside(double x,double y){
        if(x>=startX&&x<=(startX+width)&&y<=startY&&y>=(startY-height)){
            return true;
        }else {
            return false;
        }
    }
}
