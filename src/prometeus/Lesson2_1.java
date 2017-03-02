package prometeus;

public class Lesson2_1 {

	public static void main(String[] args) {

		double a = 3;
		double b = 2.5;
		double c = -0.5;

		double d, x1, x2;
		d = b * b - 4 * a * c;
		if (a == 0 || d < 0) {
			System.out.println("x1=");
			System.out.println("x2=");
		}

		else if (d >= 0) {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
			
			System.out.println(a*x2*x2+b*x2+c);
		}
	}
}
