package inheritance.basics.session6;

public class Castingdemo {
	
	public static void main(String[] args) {
		
		Person p=new Person();
		Student s=new Student();
		
		//Person p1=new Student();
		
		p=s;
		
		//p=(Student) s;
		
		s = (Student)p;//make no sense
		
		//Student s1=(Student) p1;
	}

}
