package us.greatapps4you.ocp.mostmissed.map;

import java.util.Arrays;

public class OCPHashMap<K, V> {

	private final Node<K,V>[] bucketArray;

	public OCPHashMap() {
		this.bucketArray = new Node[16];
	
	}

	public void put(K k, V v) {
		int hash = k.hashCode();
		int index = hash & (bucketArray.length - 1);
		Node<K, V> node =  new Node<K, V>(hash,k,v);
		
		if(this.bucketArray[index] == null) {
			 this.bucketArray[index] = node;
		} else {
			this.bucketArray[index].setNext(node);
		}

		System.out.println("index: " + index + " Node: " + node);
		
		printBucketArray();
	}
	
	private void printBucketArray() {
		System.out.println(Arrays.toString(this.bucketArray));
	}
	

}
