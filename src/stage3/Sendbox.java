package stage3;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

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
		list.add(6);

		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.delete(2));
		System.out.println(list.get(2));


	}

}
