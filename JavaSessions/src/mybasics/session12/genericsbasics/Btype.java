package mybasics.session12.genericsbasics;

public class Btype {

	//bounded- strictly u should be subclass of number
	public <V extends Number> void inspect(V v)
	{
		System.out.println(v);
	}
	//generics-can be anything
	public <T> void inspect1(T variable)
	{
		
	}
	
	public int calculate(int searchfor, int [] searcharray)
	{
		int count=0;
		for (int i : searcharray) {
			if(searchfor==i)
			{
				count++;
			}
		}
		return count;
		
	}
	
	public int calculate1(String searchforstring, String [] searcharray)
	{
		int count=0;
		for (String i : searcharray) {
			if(searchforstring==i)
			{
				count++;
			}
		}
		return count;
		
	}
	
	//this in generic type
	public <T>int calculate2(T searchforstring, T[] searcharray)
	{
		int count=0;
		for (T i : searcharray) {
			if(searchforstring==i)
			{
				count++;
			}
		}
		return count;
		
	}	
	
	
}
