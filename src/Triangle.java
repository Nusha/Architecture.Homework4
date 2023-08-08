/**
 * Класс, представляющий треугольник с заданными сторонами.
 */
class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    /**
     * @param side1 первая сторона треугольника
     * @param side2 вторая сторона треугольника
     * @param side3 третья сторона треугольника
     * @throws IllegalArgumentException если стороны не положительные или не образуют треугольник
     */
    public Triangle(double side1, double side2, double side3) {
        assert side1 > 0 : "Первая сторона должна быть положительной";
        assert side2 > 0 : "Вторая сторона должна быть положительной";
        assert side3 > 0 : "Третья сторона должна быть положительной";
        assert isValidTriangle(side1, side2, side3) : "Некорректные стороны треугольника";
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Переопределен
     * @return возвращает площадь треугольника по формуле
     */
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Переопределен
      * @return возвращает длину периметра по формуле
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Проверяет, являются ли заданные стороны допустимыми для треугольника.
     * @param side1 первая сторона треугольника
     * @param side2 вторая сторона треугольника
     * @param side3 третья сторона треугольника
     * @return true, если стороны образуют допустимый треугольник, иначе false
     */
    private boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}