package telran.homework;

public class ArrayChar {
	
	public static void main(String[] args) {
		
	}
	private char[] array;
	
	public ArrayChar(char[] array) {
		this.array = array;
	}
	
	public int count(char ch) {
		
		int count = 0;
		for(char character: array) {
			if (character == ch) {
				count ++;
			}
		}
		return count;
		
	}
	
	public int compareToIgnoreCase(ArrayChar another) {
		
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while(index < length && Character.toLowerCase(this.array[index]) 
				== Character.toLowerCase(another.array[index])) {

			index++;

		}
		
		return index == length - 0 ? this.array.length - another.array.length : 
			Character.toLowerCase(this.array[index]) -
				Character.toLowerCase(another.array[index]);

	}
	
	
	
	public boolean contains(char character) {
		for (char ch : array) {
			if (ch == character) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(ArrayChar another) {
		
		if (another == null) {
			return false;
		}
		
		int index = 0;
		if (array.length == another.array.length) {
			return false;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == another.array[i]) {
				index ++;
			}
		}
		
		return index == array.length ? true : false;
	}
	
	public boolean equalsIgnoreCase(ArrayChar another) {
		return compareToIgnoreCase(another) == 0 ? true : false;
	}
}
