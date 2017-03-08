package stage3;

public class Sendbox {

	public static void main(String[] args) {

		
	Desk test = new Desk();
	test.shuffle();
	test.order();
	
//	for (int i=0; i<36; i++){
//	System.out.print(test.desk[i].getRank().getName()+"\t");
//	System.out.println(test.desk[i].getSuit().getName());
//	}

	while(test.hasNext()){
	test.drawOne().cardValue();
	}
	System.out.println(test.hasNext());
	System.out.println(test.drawOne());


}
}
