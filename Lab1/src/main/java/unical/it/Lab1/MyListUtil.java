package unical.it.Lab1;

import java.util.List;

import org.apache.commons.lang3.Validate;

public class MyListUtil {
	
	enum Order {CRESCENTE, DECRESCENTE};
	
	public static void sort(List <Integer> list, Order order) {
		Validate.notNull(list);
		realSort(list, order);
	}
	
	private static boolean compara(int n1, int n2, Order order) {
		switch(order) {
			case CRESCENTE:
				return n1 < n2;
			
			case DECRESCENTE:
				return n1 > n2;
		}
		
		return false;
	}
	
	// 3, 5, 9, 4, -1, 20, 10, 0
	private static void realSort(List <Integer> list, Order order) {
		for(int i = 0; i < list.size() - 1; ++i) {
			int j = i + 1;
			int numToMove = list.get(j); 
			
			while(j > 0 && compara(numToMove, list.get(j-1), order)) {
				list.set(j, list.get(j-1));
				j--;
			}
			
			list.set(j, numToMove);
		}
	}
	
	public static Integer [] listToArray(List <Integer> list) {
		Integer [] arr = new Integer [list.size()];
		for(int i = 0; i < list.size(); ++i) {
			arr [i] = list.get(i);
		}
		
		return arr;
	}
}
