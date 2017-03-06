package stage3;

import java.util.List;

public class LinkedList {

	private Node firstNode;
	private Node lastNode;
	private int size;

	public LinkedList() {
		// PUT YOUR CODE HERE

		// PUT YOUR CODE HERE
	}

	public void add(Integer data) {
		// PUT YOUR CODE HERE
		Node currentNode = new Node();
		size++;
		if (firstNode == null) {
			firstNode = lastNode = currentNode;
		} else {
			lastNode.setNext(currentNode);
			lastNode = currentNode;
		}
		lastNode.setData(data);

		// PUT YOUR CODE HERE
	}

	public Integer get(int index) {
		// PUT YOUR CODE HERE

		if (index >= size) {
			return null;
		}
		Node currentNode = firstNode;

		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
		// PUT YOUR CODE HERE
	}

	public boolean delete(int index) {
		// PUT YOUR CODE HERE
		if (index<0)return false;
		if (index > size - 1) {
			return false;
		}

		if (index == 0) {
			firstNode = firstNode.getNext();
			size--;
			return true;
		}
		if (index == size - 1) {
			Node s = firstNode;
			Node t = firstNode;
			while (s != lastNode) {
				t = s;
				s = s.getNext();
			}
			lastNode = t;
			lastNode.setNext(null);
			size--;
			return true;
		}
		Node currentNode = firstNode;
		index = index - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == index) {
				Node tmp = currentNode.getNext();
				tmp = tmp.getNext();
				currentNode.setNext(tmp);
				break;
			}
			currentNode = currentNode.getNext();
		}
		size--;
		return true;

		// PUT YOUR CODE HERE
	}

	public int size() {
		// PUT YOUR CODE HERE
		return size;
		// PUT YOUR CODE HERE
	}
}
