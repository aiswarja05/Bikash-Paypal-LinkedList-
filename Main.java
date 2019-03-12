import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		String[] bikash= {"a","b","c","d"};
		String[] paypal= {"1","2","3","4"};
		LinkedList<String> list1= new LinkedList<String>();
		
		for(String s:bikash)
		list1.add(s);
		
		for(String x:paypal)
			list1.add(x);
		System.out.println(list1);
		
		LinkedList<String> listpaypal= new LinkedList<String>();
		
		listpaypal.addAll(list1.subList(4,8));
		
		list1.subList(4,8).clear();
		
		System.out.println("Bikash " +list1);
		System.out.println("Paypal " +listpaypal);
		
		String[] m=listpaypal.toArray(new String[listpaypal.size()]);
		
		
		for(String i:m) {
			System.out.println(i);
		}
		
	}

}
