package stage2;

public class Task1 {

	public static void main(String[] args) {

		double a = 1;
		double b = 10;
		double c = 1;

		double d, x1, x2;

		if (a != 0) {
			d = b * b - 4 * a * c;

			if (d < 0) {
				System.out.println("x1=");
				System.out.println("x2=");
			}

			else if (d >= 0) {
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				if(x1==-0.0){
					x1=x2=0.0;
				}
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
				System.out.println(a*x2*x2+b*x2+c);

			}

		} else if (b == 0) {
			System.out.println("x1=");
			System.out.println("x2=");
		}
		else{
			x1=x2=-c/b;
			if(x1==-0.0){
				x1=x2=0.0;
			}
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
			System.out.println(a*x2*x2+b*x2+c);

		}
		
	}
}
