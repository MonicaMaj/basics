package mybasics.session12.clone;

public class MyCloneMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1=new Employee();
		e1.setName("monica");
		e1.setId("47");
		Address a1=new Address();
		a1.setCity("carbondale");
		e1.setAddress(a1);
		
		Employee e2=e1.clone();
		e2.setName("chaithu");
		e2.getAddress().setCity("irving");
	
		
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		//System.out.println(e1.getAddress());
		System.out.println(e1.getAddress().getCity());
		
		
		
		System.out.println(e2.getName());
		System.out.println(e2.getId());
		System.out.println(e2.getAddress().getCity());
		
		
		
		
		
		
		
		
		
	}

}
