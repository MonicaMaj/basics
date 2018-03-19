package inheritance.basics.session6;

public class Main {
	public static void main(String[] args) {
		
		Person p=new Student();
		
		Student s=new Student();
		//Faculty f=new Faculty();
		p.test();
		test1(s);
	//	test1(f);
		Person s1=createstudent();
		
	}
	 
	private static Person createstudent() {
		// TODO Auto-generated method stub
		return new Student();
	}

	public static Student test1(Person p)
	{
		System.out.println("new polymorphic variable");
		if(p instanceof Student)
		((Student) p).changestudent();
		else
			((Faculty) p).changefaculty();
		return null;
		
		/*public static Person createstudent()
		{
			return new Student();
		}*/

			
		
	}
	

}
