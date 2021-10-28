package unical.it.Lab1;

import java.util.Arrays;
import java.util.List;

import unical.it.Lab1.MyListUtil.Order;

public class App 
{
    public static void main( String[] args )
    {
    	List <Integer> list1 = Arrays.asList(3, 5, 9, 4, -1, 20, 10, 0);
    	MyListUtil.sort(list1, Order.DECRESCENTE);
    	
    	//for(int num : list1)
    	//	System.out.print(num + ", ");
    }
}
