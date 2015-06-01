/**
 * Created by priyara on 01/06/15.
 */

public class Line {
    double startX,startY,endX,endY;
    public Line(int startX,int startY,int endX,int endY)
    {
        this.startX=startX;
        this.startY=startY;
        this.endX=endX;
        this.endY=endY;
    }

    public double length()
    {
        return Math.sqrt(Math.pow(startX-endX,2)+Math.pow(startY-endY,2));
    }

}
