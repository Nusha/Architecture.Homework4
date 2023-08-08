/**
 * Интерфейс, представляющий геометрическую фигуру.
 */
interface Shape {
    /**
     * Рассчитать и вернуть площадь фигуры.
     * @return площадь фигуры
     * @throws IllegalArgumentException если размеры фигуры несовместимы с расчетом площади
     */
    default double getArea() {
        throw new UnsupportedOperationException("Метод getArea должен быть переопределен в реализующем классе");
    }

    /**
     * Рассчитать и вернуть периметр фигуры.
     * @return периметр фигуры
     * @throws IllegalArgumentException если размеры фигуры не совместимы с расчетом периметра
     */
    default double getPerimeter() {
        throw new UnsupportedOperationException("Метод getPerimeter должен быть переопределен в реализующем классе");
    }
}
