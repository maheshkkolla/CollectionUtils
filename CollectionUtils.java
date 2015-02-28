import java.util.*;

interface ListMapper<T> {
	public T callback(T item);
}

public	class CollectionUtils{
	public static <E> List<E> map(List<E> myList, ListMapper<E> callbackObj) {
		List<E> resultList = new ArrayList<E>();
		for( E item: myList){
			resultList.add(callbackObj.callback(item));
		}
		return resultList;
	}

	// public static List<E> filter(List<E>, ListFilter ){

	// }
}