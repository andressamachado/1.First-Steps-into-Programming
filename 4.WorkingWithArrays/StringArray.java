package assignment4;

/**
 * @author: Andressa Machado - 040923007 CST8110 - Introduction to Computer
 *          Programming. Section: 302 Professor: Anissa Shaddy. Assignment #4 -
 *          Arrays. This program is a dynamic array of strings that grows as
 *          needed. This class contains the logic for a dynamic array of
 *          Strings. last updated April 18th, 2018.
 */

// This class contains the logic for a dynamic array of String
public class StringArray {

	private int capacity; // The current capacity of the array
	private int size; // The current size of the array
	private String[] stringArray; // The current String array

	// Default constructor, Constructs an empty StringArray with an initial capacity
	// of ten.
	public StringArray() {
		size = 0;
		capacity = 10;
		stringArray = new String[capacity];
	}

	// Initial constructor, Constructs an empty StringArray with the specified
	// initial capacity.
	public StringArray(int initialCapacity) {
		size = 0;
		capacity = initialCapacity;
		stringArray = new String[initialCapacity];

	}

	// Copy constructor, Constructs a StringArray that is a copy of a given
	// StringArray
	public StringArray(StringArray sa) {
		stringArray = sa.stringArray;
		capacity = sa.capacity;
		size = sa.size;
	}

	// Appends the specified string to the end of this StringArray. Increases
	// capacity if needed.
	public void add(String s) {
		if (size == capacity) {
			ensureCapacity(1);
		}

		for (int i = 0; i < capacity; i++) {
			if (stringArray[i] == null) {
				stringArray[i] = s;
				size++;
				return;
			}
		}

	}

	// Inserts the specified string at the specified position in this StringArray.
	// Increases capacity if needed.
	public void add(int index, String s) {

		if (index > capacity) {
			ensureCapacity(index - capacity);
		}
		stringArray[index] = s;
		size++;
	}

	// Returns the capacity of this StringArray.
	public int capacity() {
		return capacity;
	}

	public void clear() { // Removes all of the Strings from this StringArray.
		stringArray = new String[capacity];
		size = 0;
	}

	// Returns true if this StringArray contains the specified String.
	public boolean contains(String s) {
		boolean comparison = false;
		for (int i = 0; i < capacity; i++) {
			if (stringArray[i] != null) {

				if (stringArray[i].equalsIgnoreCase(s)) {
					comparison = true;
				}
			}
		}
		return comparison;
	}

	// To ensure that it can hold at least the number of Strings specified by the
	// minimum capacity argument.
	public void ensureCapacity(int minCapacity) {

		int available = capacity - size;

		if (available < minCapacity) {
			int extraSize = minCapacity - available;
			String temp[] = new String[capacity + extraSize];
			for (int i = 0; i < capacity; i++) {
				temp[i] = stringArray[i];
			}
			stringArray = temp;
			capacity += extraSize;
		}
	}

	// Returns the String at the specified position in this StringArray.
	public String get(int index) {

		if (index < 0 || index > capacity) {
			return null;
		}

		return stringArray[index];
	}

	// Returns the index of the first occurrence of the specified String in this
	// StringArray, or -1 if this StringArray does not contain the String.
	public int indexOf(String s) {

		for (int i = 0; i < capacity; i++) {
			if (stringArray[i] != null) {
				if (stringArray[i].equals(s)) {
					return i;
				}
			}
		}
		return -1;
	}

	// Returns true if this StringArray contains no Strings.
	public boolean isEmpty() {

		return size == 0;
	}

	// Removes the String at the specified position in this StringArray. Return the
	// String previously at the specified position
	public String remove(int index) {

		if (index < 0 || index > capacity) {
			return null;
		}

		String stringAtIndex = get(index);

		stringArray[index] = null;
		return stringAtIndex;
	}

	// Removes the first occurrence of the specified String from this StringArray,
	// if it is present. Return true if this StringArray contained the specified
	// String.
	public boolean remove(String s) {
		int i = indexOf(s);
		if (i == -1) {
			return false;
		} else {
			remove(i);
			return true;
		}
	}

	// Replaces the String at the specified position in this StringArray with the
	// specified String. Return the String previously at the specified position.
	// Increases capacity if needed.
	public String set(int index, String s) {
		String previously = get(index);
		add(index, s);
		return previously;
	}

	// Inserts the specified string at the specified position in this StringArray.
	// Increases capacity if needed.
	// Returns the number of Strings in this StringArray.
	public int size() {
		return size;
	}
}