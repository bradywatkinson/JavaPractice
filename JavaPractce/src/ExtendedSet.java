
public abstract class ExtendedSet<T> implements AbstractSet<T> {

	private T[] mySet;
	private int maxCapacity;
	private int size;
	
	public ExtendedSet (int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.mySet = (T[]) new Object[maxCapacity];
		this.size = 0;
	}
	
	// return true if the object is added
	// false if the set is full, or the object already exists
	public boolean add (T e) {
		if (size == maxCapacity) {
			return false;
		} else {
			for (int i=0;i<maxCapacity; ++i) {
				if (mySet[i].equals(e)) {
					return false;
				}
			}
			mySet[size] = e;
			size++;
			return true;
		}
	}
}
