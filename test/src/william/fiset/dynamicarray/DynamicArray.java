package william.fiset.dynamicarray;

public class DynamicArray<T> 
{
	private T[] array;
	private int len=0;
	private int capacity=0;
	
	public DynamicArray()
	{
		this(16);
	}
	
	public DynamicArray(int capacity)
	{
		array = (T[])new Object[capacity];
		this.capacity=capacity;
	}
	
	public boolean isEmpty()
	{
		return len==0;
	}
	
	public void add(T n)
	{
		if(len+1>capacity)
		{
			capacity = capacity+16;
			T[] tempArray = (T[]) new Object[capacity];
			System.arraycopy(array, 0, tempArray, 0, len);
			array = tempArray;
		}
		array[len] = n;
		len++;
	}
	
	public void set(int index, T n)
	{
		array[index] = n;
	}
	
	public boolean remove(T n)
	{
		for (int i = 0; i < array.length; i++) {
			if(array[i]==n)
			{
				return remove(i);
			}
		}
		return false;
	}
	
	public boolean remove(int index)
	{
		boolean result = false; 
		if(index>=0 && index<len)
		{
			System.arraycopy(array, index+1, array, index, len-index-1);
			len--;
			result = true;
		}
		return result;
	}
	
	public T get(int index)
	{
		if(index>=len)
		{
			return null;
		}
		return array[index];
	}
	
	@Override
	public String toString() {
		return this.array.toString();
	}
	
	public void print()
	{
		for (int i = 0; i < len; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		DynamicArray<String> array = new DynamicArray<>();
		array.add("Subash");
		array.add("Surama");
		array.add("Sailendra");
		array.add("Swastika");
		array.add("Subrat");
		array.add("Sunanda");
		array.print();
		System.out.println(array.remove("Sailendra"));
		array.print();
	}
	
}
