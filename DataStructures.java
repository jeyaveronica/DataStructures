package stackdemo;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class DataStructures {
	
	 public static void main(String[] args)
	    {
	        //Stack
	        Stack<String> stack = new Stack<String>();
	        stack.push("ALL");
	        stack.push("THE");
	        stack.push("BEST");  
	        System.out.println(stack);
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("The element at the top of the stack is: " + stack.peek());
	        while(!stack.isEmpty()) {
	            System.out.println(stack.pop());
	        }
	        System.out.println("End of stack operations");
	        //Queue
	        Queue<Integer> queue = new LinkedList<Integer>();
	        queue.add(10);
	        queue.add(20);
	        queue.add(30);
	        System.out.println("Elements in Queue:" + queue);
	        System.out.println("Element removed from the queue: "+queue.remove());
	        System.out.println("Head of the queue: "+queue.element());
	        System.out.println("Poll():Returned Head of the queue: "+queue.poll());
	        System.out.println("peek():Head of the queue: "+queue.peek());
	        System.out.println("Final Queue:"+queue);
	        System.out.println("END OF QUEUE operations");
	        //Dictionary
	        Dictionary<String, Integer> dictionary = new Hashtable<>();
	        dictionary.put("A", 1);
			dictionary.put("B", 2);
			dictionary.put("C", 3);
			int value_of_A = dictionary.get("A");
			System.out.println("Value of A: " + value_of_A);
	        //Hashmap
			Map<String,Integer> hm = new HashMap<String,Integer>();
			hm.put("AA", 10 );
			hm.put("BB", 20 );
			hm.put("CC", 30 );
			System.out.println(hm);
			Set s = hm.entrySet(); //using entrySet, we can iterate the elements in the object,
			System.out.println(s);
			Iterator i = s.iterator();
			
			while(i.hasNext()) 
			{
							
				Object o = i.next();
				Map.Entry e = (Map.Entry) o; // Using entry, we are separating into key and value
				System.out.println(e);
						
				Object key = e.getKey();
				System.out.println("The key is  " +key);
				
				Object value = e.getValue();
				System.out.println("The value is the key is " +value);
			}
			//HashTable	
			Enumeration names;String key;
			Hashtable<String, String> hashtable = new Hashtable<String, String>();
			hashtable.put("Key1","AAA");
			hashtable.put("Key2","BBB");
			hashtable.put("Key3","CCC");
			names = hashtable.keys();
			   while(names.hasMoreElements()) {
			      key = (String) names.nextElement();
			      System.out.println(key+ " & Value of the key: " + hashtable.get(key));
			   }
	       
	        
	    }

}
