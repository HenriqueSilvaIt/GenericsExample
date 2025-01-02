package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	List<Integer> list = new ArrayList<>();
	
	public void addValue(Integer value) {
		list.add(value);
	}
	
	public int first() {
		if (list == null) {
		throw new IllegalStateException("List is empty");
		}
		else {
			return list.getFirst();
		}
	}
	
	public void print () {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
			}
		for (int i = 1; i<list.size(); i++) {
			System.out.print("," +list.get(i) );
		}
	}
}
