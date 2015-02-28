import java.util.*;

interface ListMapper<T> {
	public T callbackForMap(T item);
}

interface ListFilter<T> {
	public Boolean callbackForFilter(T item);
}

public	class CollectionUtils{
	public static <E> List<E> map(List<E> myList, ListMapper<E> callbackObj) {
		List<E> resultList = new ArrayList<E>();
		for( E item: myList){
			resultList.add(callbackObj.callbackForMap(item));
		}
		return resultList;
	}

	public static <E> List<E> filter(List<E> myList, ListFilter<E> callbackObj){
		List<E> resultList = new ArrayList<E>();
		for( E item: myList){
			if(callbackObj.callbackForFilter(item)) resultList.add(item);
		}
		return resultList;
	}
}