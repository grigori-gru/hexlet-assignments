package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    private static int getMid(int begin, int end) {
        return (begin + end) / 2;
    }

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return this.beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        var x = getMid(this.beginPoint.getX(), this.endPoint.getX());
        var y = getMid(this.beginPoint.getY(), this.endPoint.getY());
        return new Point(x, y);
    }
}
// END
