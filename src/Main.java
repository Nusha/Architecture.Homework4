/**
 * Главный класс для отображения работы с фигурами.
 */
public class Main {
    public static void main(String[] args) {

        try {
            Circle circle = new Circle(5.0);
            System.out.printf("Площадь круга: %.2f%n", circle.getArea());
            System.out.printf("Периметр круга: %.2f%n", circle.getPerimeter());

            Rectangle rectangle = new Rectangle(4.0, 6.0);
            System.out.printf("Площадь прямоугольника: %.2f%n", rectangle.getArea());
            System.out.printf("Периметр прямоугольника: %.2f%n", rectangle.getPerimeter());

            Triangle triangle = new Triangle(3.0, 4.0, 5.0);
            System.out.printf("Площадь треугольника: %.2f%n", triangle.getArea());
            System.out.printf("Периметр треугольника: %.2f%n", triangle.getPerimeter());

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания фигуры: " + e.getMessage());
        }
    }
}