package stage3;

public class Sendbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Node firstNode = new Node();
//		firstNode.setData(1);
//
//		firstNode.getNext();
//		firstNode.setNext(firstNode);
//		System.out.println(firstNode.getData());
		LinkedList list = new LinkedList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		


		System.out.println("list size = " + list.size());
		System.out.println("element value = " + list.get(0));
		System.out.println("element value = " + list.get(1));
		System.out.println("element value = " + list.get(2));
		System.out.println("element value = " + list.get(3));


//		System.out.println("delete element " + list.delete(3));
//		System.out.println("delete element " + list.delete(2));
		System.out.println("delete element " + list.delete(-2));
//		System.out.println("delete element " + list.delete(0));
//		System.out.println("delete element " + list.delete(0));
		System.out.println("element value = " + list.get(0));
		System.out.println("element value = " + list.get(1));
		System.out.println("element value = " + list.get(2));
		System.out.println("element value = " + list.get(3));

		System.out.println("list size = " + list.size());

				

	}

}
