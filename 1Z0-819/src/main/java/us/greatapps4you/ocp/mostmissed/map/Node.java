package us.greatapps4you.ocp.mostmissed.map;

public class Node<K, V> {

	private final int hashCode;
	private final K key;
	private V value;
	private Node<K, V> next;

	public Node(int hashCode, K key, V value) {
		super();
		this.hashCode = hashCode;
		this.key = key;
		this.value = value;
	}

	public Node<K, V> getNext() {
		return next;
	}

	public void setNext(Node<K, V> next) {
		this.next = next;
	}

	public int getHashCode() {
		return hashCode;
	}

	public K getKey() {
		return key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "hashCode: " + hashCode + " | key: " + key + " | " + "value: " + value + " | next: " + next;
	}

}
