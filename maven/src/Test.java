import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer> ();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		Collections.swap(list, 0, 4);
		
		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i));
		}
		
		System.out.println();
		Collections.sort(list);
		
		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i));
		}
		
//		Student stu2 = new Student(1);
//		Student stu1 = stu2;
//		System.out.println(stu1);
//		stu2.setId(2);
//		System.out.println(stu1);
		
//		List<Student> list = new ArrayList<Student>();
//		list.add(new Student(1));
//		list.add(new Student(2));
//		list.add(new Student(3));
//		list.add(new Student(4));
//		
//		Student str = list.get(1);
//		str = new Student(5);
//		
////		list.remove(1);
//		
//		for (Student string : list) {
//			System.out.println(string);
//		}
//		
//		System.out.println("str:" + str);
		
//		Map<String,String> session = new HashMap<String,String> ();
//		session.put("1", "一");
//		session.put("2", "二");
//		session.put("3", "三");
//		session.put("4", "四");
//		
//		
//		Set<String> set = session.keySet();
//		
//		Object[] keys =set.toArray();
//		
//		for (Object name : keys) {
//			
//			session.remove(name);
//			System.out.println(name);
//			
//		}
//		
//		keys = null;
//		set = null;
//		
//		System.out.println(session.get("1"));
//		System.out.println(session.get("2"));
//		System.out.println(session.get("3"));
//		System.out.println(session.get("4"));
//		
//		System.out.println("set: " + set);
//		System.out.println("keys: " + keys);
		
	}

}

class Student{
	private int id;

	public Student(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "";
	}
	
}
