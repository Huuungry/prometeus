package stage3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1_1 {

	List<Task1> list;
	Task1 node;

	public Task1_1() {
		// PUT YOUR CODE HERE
		list = new LinkedList<Task1>();
		node = new Task1();
		// PUT YOUR CODE HERE
	}

	public void add(Integer data) {
		// PUT YOUR CODE HERE
		node.setNext(node);
//		node.getNext();
		node.setData(data);
		list.add(node);
		// PUT YOUR CODE HERE
	}

	public Integer get(int index) {
		// PUT YOUR CODE HERE
		
		return list.get(index).getData();
		// PUT YOUR CODE HERE
	}

	public boolean delete(int index) {
		// PUT YOUR CODE HERE

		if (index < list.size()) {
			list.remove(index);
			return true;
		} else {
			return false;
		}
		// PUT YOUR CODE HERE
	}

	public int size() {
		// PUT YOUR CODE HERE
		return list.size();
		// PUT YOUR CODE HERE
	}
}
