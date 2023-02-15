package exercise;

// BEGIN
public class Cottage implements Home {

    private Double area;
    private int floorCount;

    public Cottage(int area, int floorCount) {
        this.area = (double) area;
        this.floorCount = floorCount;
    }
    public Cottage(Double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public Double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home anotherHome) {
        return 0;
    }

    @Override
    public String toString() {
        return this.floorCount +
                " этажный коттедж площадью " + this.getArea() +
                " метров";
    }
}
// END
