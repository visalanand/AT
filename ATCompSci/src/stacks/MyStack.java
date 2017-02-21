package stacks;

import java.util.Arrays;
import java.util.Collections;

public class MyStack {

	Object[] arr;

	public MyStack() {
		arr = new Object[0];
	}

	public Object push(Object Item) {
		if (arr.length != 0) {
			Object[] fin = new Object[arr.length + 1];
			int count = 0;
			fin[count++] = Item;
			for (Object n : arr) {
				fin[count++] = n;
			}
			arr = fin;
			return Item;
		} else {
			arr = new Object[1];
			arr[0] = Item;
			return Item;
		}

	}

	public Object pop() {
		if (arr.length > 0) {
			Object[] temp = new Object[arr.length - 1];
			int a = 0;
			for (int count = 0; count<arr.length; count++) {
				if (count == 0) {

				} else {
					temp[a++] = arr[count];
				}
				
			}
			Object n = arr[0];
			arr = temp;
			return n;
		} else {
			throw new RuntimeException();
		}
	}

	public Object peek() {

		try {
			return arr[0];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}

	}

	public boolean isEmpty() {
		if (arr.length == 0) {
			return true;
		} else {
			return false;
		}

	}

	public int size() {
		return arr.length;
	}

	public int search(Object a) {
		
		for (int x = arr.length-1; x>=0;x--){
			if (arr[x].equals(a)){
				return x+1;
			}
		}
		return -1;
		
		
		
	}

	public String toString() {
		String n = "";
		for (Object s : arr) {
			n += s.toString() + "\n";
		}
		return n;

	}

}
