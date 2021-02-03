import java.util.HashMap;
import java.util.Map;

public class StringCountDemo {

	public static void main(String[] args) {

		String x = "a-10,b-20,a-10,c-30,b-60"; 
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] entries = x.split(",");
		for (String entry : entries) {

			String[] keyValue = entry.split("-");
			if (map.containsKey(keyValue[0])) {
				map.put(keyValue[0], Integer.valueOf(keyValue[1]) + map.get(keyValue[0]));
			} else {
				map.put(keyValue[0], Integer.valueOf(keyValue[1]));
			}
		}
		System.out.println(map);
	}
	
	
	
}
//output is::{a=20, b=80, c=30}