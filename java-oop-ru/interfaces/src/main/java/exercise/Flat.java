package exercise;

// BEGIN
public class Flat implements Home {
    private int area;
    private int balcony;
    private int floor;

    public Flat(int area, int balcony, int floor) {
        this.area = area;
        this.balcony = balcony;
        this.floor = floor;
    }

    @Override
    public Double getArea() {
        return (double) (area + balcony);
    }

    @Override
    public int compareTo(Home anotherHome) {
        var ar1 = this.getArea();
        var ar2 = anotherHome.getArea();
        if (ar1 == ar2) {
            return 0;
        }

        return ar1 > ar2 ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + this.getArea() +
                " метров на " + floor +
                " этаже";
    }
}
// END
