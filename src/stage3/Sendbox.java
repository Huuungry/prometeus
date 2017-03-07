package stage3;

public class Sendbox {

	public static void main(String[] args) {

		Fibonacci a = new Fibonacci();
		
		for(int j=-1; j<10; j++){
			System.out.println(a.getNumber(j));
		}
	}

}
