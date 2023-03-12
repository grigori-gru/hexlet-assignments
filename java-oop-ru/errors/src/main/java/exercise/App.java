package exercise;

// BEGIN
class App {
    public static void printSquare(Circle circle) {
        try {
            var square = circle.getSquare();
            System.out.println((int) Math.ceil(square));
        } catch (NegativeRadiusException err) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
