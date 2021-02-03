import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import model.Student;

public class SampleDemo {

	public static void main(String[] args) {
		Student s = new Student(1, "Krishna", "SSE");
		Student s1 = new Student(1, "Krishna", "SSE");
		System.out.println(s.hashCode()+" "+s1.hashCode());
		Set<Student> set= new HashSet<>();
		set.add(s);
		set.add(s1);
		System.out.println(set);
		Map<Student,Integer> map= new HashMap<Student, Integer>();
		map.put(s, 1);
		map.put(s1, 2);
		map.put(null, 3);//replace with 4
		map.put(null, 4);
		System.out.println(map);
		
		Student s3=s;
		s3.setSname("Raju");
		System.out.println(s+" "+s3);
		Set<Student> se= new HashSet<>();
		
		for(int i=0;i<10;i++) {
			se.add(new Student(1, "Krishna", "SSE"));
		}
		
		System.out.println(se.size());
		
	}

}
