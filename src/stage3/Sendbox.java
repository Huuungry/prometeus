package stage3;

public class Sendbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1_1 test = new Task1_1();
		
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(666);
		
		System.out.println(test.get(0));
		System.out.println(test.size());
		System.out.println(test.delete(3));

//		Task1 note = new Task1();
//		note.setData(555);
//		note.getNext();
//		note.setNext(note);
//		System.out.println(note.getNext());
//		System.out.println(note.getData());
		
		
		
	}

}
