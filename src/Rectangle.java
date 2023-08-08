/**
 * Класс, представляющий прямоугольник с заданными шириной и высотой.
 */
class Rectangle implements Shape {
    private final double width;
    private final double height;

    /**
     * @param width  ширина прямоугольника
     * @param height высота прямоугольника
     * @throws IllegalArgumentException если ширина или высота не положительные
     */
    public Rectangle(double width, double height) {
        assert width > 0 : "Ширина должна быть положительной";
        assert height > 0 : "Высота должна быть положительной";
        this.width = width;
        this.height = height;
    }
    /**
     * Переопределен
     * @return возвращает площадь треугольника по формуле
     */
    @Override
    public double getArea() {
        return width * height;
    }
    /**
     * Переопределен
     * @return возвращает длину периметра по формуле
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}