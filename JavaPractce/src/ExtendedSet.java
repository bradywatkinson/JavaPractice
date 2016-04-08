import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class ExtendedSet<T> extends AbstractSet<T> {

	private T[] mySet;
	private int maxCapacity;
	private int size;

	public ExtendedSet (int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.mySet = (T[]) new Object[maxCapacity];
		this.size = 0;
	}


	public ExtendedSet<T> union (ExtendedSet<T> o) {

		ExtendedSet<T> newSet = new ExtendedSet<T>(this.maxCapacity);

		for (int i=0;i<this.size;++i) {
			newSet.add(this.mySet[i]);
		}

		for (int i=0;i<o.size();++i) {
			newSet.add(o.mySet[i]);
		}

		return newSet;
	}

	public ExtendedSet<T> intersection (ExtendedSet<T> o) {

		ExtendedSet<T> newSet = new ExtendedSet<T>(this.maxCapacity);

		for (int i=0;i<this.size;++i) {
			if (o.contains(this.mySet[i]) == true) {
				newSet.add(mySet[i]);
			}
		}

		for (int i=0;i<o.size();++i) {
			if (this.contains(o.mySet[i]) == true) {
				newSet.add(o.mySet[i]);
			}
		}

		return newSet;
	}
	
	public ExtendedSet<T> symetricDifference (ExtendedSet<T> o) {
		
		ExtendedSet<T> newSet = new ExtendedSet<T>(this.maxCapacity);
		
		for (int i=0;i<this.size;++i) {
			if (o.contains(this.mySet[i]) == false) {
				newSet.add(mySet[i]);
			}
		}

		for (int i=0;i<o.size();++i) {
			if (this.contains(o.mySet[i]) == false) {
				newSet.add(o.mySet[i]);
			}
		}
		
		
		return newSet;
	}

	// return true if the object is added
	// false if the set is full, or the object already exists
	public boolean add (T e) {
		if (size == maxCapacity) {
			return false;
		} else {
			for (int i=0;i<size; ++i) {
				if (mySet[i].equals(e)) {
					return false;
				}
			}
			mySet[size] = e;
			size++;
			return true;
		}
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public Iterator<T> iterator() {
		return (Iterator<T>) new myIterator<T>();
	}

	class myIterator<T> implements Iterator<T> {
		int pos = 0;

		public boolean hasNext() {
			if (pos < size) return true;
			return false;
		}

		public T next() {

			if(this.hasNext()) {
				T tmp = (T) mySet[pos];
				pos++;
				return tmp;
			}
			throw new NoSuchElementException();

		}
	}
}
