
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-3
 * @description 第十一章11-4
 */

public class TestCircleRectangle {
	public static void main(String[] args) {
		CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getArea());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());

		RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
	}
}
