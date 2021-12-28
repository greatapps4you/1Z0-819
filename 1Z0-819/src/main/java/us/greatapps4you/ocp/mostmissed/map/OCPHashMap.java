package us.greatapps4you.ocp.mostmissed.map;

import java.util.Arrays;

public class OCPHashMap<K, V> {

	private final Node<K, V>[] bucketArray;

	public OCPHashMap() {
		this.bucketArray = new Node[16];
		for (int i = 0; i < bucketArray.length; i++) {
			bucketArray[i] = new Node(0, null, null);
		}
	}

	public void put(K k, V v) {
		int hash = k.hashCode();
		int index = hash & (bucketArray.length - 1);
		Node<K, V> node = new Node<K, V>(hash, k, v);

		if (this.bucketArray[index].getHashCode() == 0) {
			this.bucketArray[index] = node;
		} else {
			addNextNode(this.bucketArray[index], node);
		}

		// System.out.println("index: " + index + " Node: " + node);
	}

	private void addNextNode(Node previous, Node next) {
		if (previous.getNext() == null) {
			previous.setNext(next);
		} else {
			if (previous.getNext().getKey().equals(next.getKey())) {
				previous.getNext().setValue(next.getValue());
			} else {
				addNextNode(previous.getNext(), next);
			}
		}
	}

	public String toJSON() {
		return Arrays.toString(this.bucketArray);
	}

}
