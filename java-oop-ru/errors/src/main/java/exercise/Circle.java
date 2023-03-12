package exercise;

// BEGIN
class Circle {
    Point point;
    Integer radius;

    public Circle(Point point, Integer radius) {
        this.point = point;
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public Double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Radius < 0");
        }

        return Math.PI * radius * radius;
    }
}
// END
