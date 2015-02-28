import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class CollectionUtilsTest {
	@Test
	public void map_should_iterate_throught_the_list_and_gives_the_result_list() {
		ListMapper<Integer> callbackObj = new mapCallback();
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3); 
		List<Integer> resultList = CollectionUtils.<Integer>map(myList,callbackObj);
		assertEquals(resultList.get(0),(Integer)1);
		assertEquals(resultList.get(1),(Integer)1);
		assertEquals(resultList.get(2),(Integer)1);
	}
}

class mapCallback implements ListMapper<Integer>{
	public Integer callback(Integer item) {
		return (Integer)1;
	}
}

