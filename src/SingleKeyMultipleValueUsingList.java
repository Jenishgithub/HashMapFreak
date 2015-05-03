import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleKeyMultipleValueUsingList {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		// create list to store values
		List<String> valueSetOne = new ArrayList<String>();
		valueSetOne.add("Apple");
		valueSetOne.add("Asshole");
		valueSetOne.add("Asscream");

		// create list two to store vlaues
		List<String> valueSetTwo = new ArrayList<String>();
		valueSetTwo.add("banana");
		valueSetTwo.add("Buttlick");
		valueSetTwo.add("Bricks");

		// create list three to store values
		List<String> valueSetThree = new ArrayList<String>();
		valueSetThree.add("Cat");
		valueSetThree.add("Camera");
		valueSetThree.add("Crystal");

		// put key value pair in the map
		map.put("A", valueSetOne);
		map.put("B", valueSetTwo);
		map.put("C", valueSetThree);

		// now for showing and iterating
		for (Map.Entry<String, List<String>> tempEntry : map.entrySet()) {
			String key = tempEntry.getKey();
			List<String> val = tempEntry.getValue();
			System.out.println("key:  " + key);
			System.out.println("values:  " + val);
		}

	}

}
