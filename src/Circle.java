/**
 * Класс, представляющий круг с заданным радиусом.
 */
class Circle implements Shape {
    private double radius;

    /**
     * @param radius радиус круга
     * @throws IllegalArgumentException если радиус не положительный
     */
    public Circle(double radius) {
        assert radius > 0 : "Радиус должен быть положительным";
        this.radius = radius;
    }

    /**
     * Переопределен
     * @return метод возвращает площадь круга
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Переопределен
     * @return метод возвращает периметр круга
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
