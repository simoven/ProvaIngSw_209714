package unical.it.Lab1;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.TimeOfDay;
import org.junit.BeforeClass;
import org.junit.Test;

import unical.it.Lab1.MyListUtil.Order;

public class MyListUtilTest {
	
	private static List<Integer> list1;
	private static List<Integer> list2;
	private static List<Integer> list3;
	
	private static List<Integer> list1AscendingExpected;
	private static List<Integer> list2AscendingExpected;
	private static List<Integer> list3AscendingExpected;
	
	private static List<Integer> list1DescendingExpected;
	private static List<Integer> list2DescendingExpected;
	private static List<Integer> list3DecendingExpected;
	
	@BeforeClass
	public static void fillList() {
		list1 = Arrays.asList(3, 5, 9, 4, -1, 20, 10, 0);
		list2 = Arrays.asList(0, 3, 5, 2, -1, 10, 40, 2);
		list3 = Arrays.asList(30, 20, 21, 10, 5, 9, -3, 10);
		
		list1AscendingExpected = Arrays.asList(-1, 0, 3, 4, 5, 9, 10, 20);
		list2AscendingExpected = Arrays.asList(-1, 0, 2, 2, 3, 5, 10, 40);
		list3AscendingExpected = Arrays.asList(-3, 5, 9, 10, 10, 20, 21, 30);
		
		list1DescendingExpected = Arrays.asList(20, 10, 9, 5, 4, 3, 0, -1);
		list2DescendingExpected = Arrays.asList(40, 10, 5, 3, 2, 2, 0, -1);
		list3DecendingExpected = Arrays.asList(30, 21, 20, 10, 10, 9, 5, -3);
	}
	
	@Test
	public void ascendingOrderTest() {
		System.out.println("Test crescente inizia : " + LocalDateTime.now());
		MyListUtil.sort(list1, Order.CRESCENTE);
		MyListUtil.sort(list2, Order.CRESCENTE);
		MyListUtil.sort(list3, Order.CRESCENTE);
		
		assertArrayEquals(MyListUtil.listToArray(list1), MyListUtil.listToArray(list1AscendingExpected));
		assertArrayEquals(MyListUtil.listToArray(list2), MyListUtil.listToArray(list2AscendingExpected));
		assertArrayEquals(MyListUtil.listToArray(list3), MyListUtil.listToArray(list3AscendingExpected));
		System.out.println("Test crescente finisce : " + LocalDateTime.now());
	}
	
	@Test
	public void descendingOrderTest() {
		System.out.println("Test decrescente inizia : " + LocalDateTime.now());
		MyListUtil.sort(list1, Order.DECRESCENTE);
		MyListUtil.sort(list2, Order.DECRESCENTE);
		MyListUtil.sort(list3, Order.DECRESCENTE);
		
		assertArrayEquals(MyListUtil.listToArray(list1), MyListUtil.listToArray(list1DescendingExpected));
		assertArrayEquals(MyListUtil.listToArray(list2), MyListUtil.listToArray(list2DescendingExpected));
		assertArrayEquals(MyListUtil.listToArray(list3), MyListUtil.listToArray(list3DecendingExpected));
		System.out.println("Test decrescente finisce : " + LocalDateTime.now());
	}

}
