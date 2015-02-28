import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class CollectionUtilsTest {
	@Test
	public void map_should_iterate_throught_the_list_and_gives_the_result_list() {
		ListMapper<Integer> callbackObj = new Callback();
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3); 
		List<Integer> resultList = CollectionUtils.<Integer>map(myList,callbackObj);
		assertEquals(resultList.get(0),(Integer)2);
		assertEquals(resultList.get(1),(Integer)3);
		assertEquals(resultList.get(2),(Integer)4);
	}
	@Test
	public void filter_should_return_a_list_with_filtered_items_given_as_per_condition_in_callback() {
		ListFilter<Integer> callbackObj = new Callback();
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3); 
		List<Integer> resultList = CollectionUtils.<Integer>filter(myList,callbackObj);
		assertEquals(resultList.get(0),(Integer)2);
	}
}

class Callback implements ListMapper<Integer>, ListFilter<Integer> {
	public Integer callbackForMap(Integer item) {
		return (Integer)(item + 1);
	}
	public Boolean callbackForFilter(Integer item) {
		return (item % 2 == 0); 
	}
}

