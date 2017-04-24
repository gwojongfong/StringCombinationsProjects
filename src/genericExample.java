import java.util.ArrayList;
import java.util.List;

public class genericExample {

//	public static void main(String[] args) {
//		A a = new A();
//		List<A> listA = new ArrayList<A>();
//		a.setValue("123");
//		listA.add(a);
//		System.out.println(a.getValue());
//		processElements(listA);
//		listA.add(a);
//	}
	public static void processElements(List<A> elements){
		   for(A o : elements){
		      System.out.println(o.getValue());
		   }
		}

}
