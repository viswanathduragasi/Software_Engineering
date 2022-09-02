	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Iterator;


public class Act00 {
		Map<String, String> classList = new HashMap<String, String>();
		
		public Act00(){
			classList.put("Bob", "A");
			classList.put("Mary", "C");
			classList.put("Sarah", "B");
			classList.put("Philip", "A");
			classList.put("Greg", "F");
		}
		
		public void printClassList() {
			Iterator<Entry<String, String>> entries = classList.entrySet().iterator();
			while(entries.hasNext()) {
				Entry<String, String> entry = entries.next();
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}
		
		public void printClassList2() {
			for(Map.Entry<String, String> entry : classList.entrySet()) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
			
			//Iterating over keys only
			for(String key : classList.keySet()) {
				System.out.println("Key = " + key);
			}
			
			//Iterating over values only
			for(String value : classList.values()) {
				System.out.println("Value = " + value);
			}
		}
		
		public static void main(String[] args) {
			Act00 myClassList = new Act00();
			myClassList.printClassList2();
		}
		
	}
