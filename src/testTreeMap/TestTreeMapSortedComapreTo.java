package testTreeMap;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeMapSortedComapreTo {

	public static void main(String[] args) {
		
		Map<Test2, String> test = new TreeMap<>(new myCompare2());
		
		test.put(new Test2("jalapeno"), "koza");
		test.put(new Test2("asdf"), "value");
		//test.put("asdf", "value 123");
		test.put(new Test2("csdf"), "value");
		
		
		Set<Test2> keys = test.keySet(); 
		
		//Set<Test2> keys = new TreeSet<>(); 
		
			
			for(Test2 key: keys) {
				System.out.println(key + " " + test.get(key));
			}
	}
}

class myCompare2 implements Comparator<Test2> {

	public int compare(Test2 o, Test2 o1) {

		int porownanie = o.getWord().compareTo(o1.getWord());

		return porownanie;

	}
}


class Test2{

	private String word;

	public Test2(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "Test [word=" + word + "]";
	}


}
