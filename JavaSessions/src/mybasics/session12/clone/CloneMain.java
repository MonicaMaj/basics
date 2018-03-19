package mybasics.session12.clone;

public class CloneMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Author a1=new Author();
		a1.setName("monica");
		a1.setAge(23);
		
//		Author a2=new Author();
//		a2.setName(a1.getName());
//		a2.setAge(a1.getAge());
		
		Author a2=a1.clone();
		a2.setName("sarika");
		a2.setAge(20);
		
		System.out.println(a1.getName());
		System.out.println(a1.getAge());
		
		System.out.println(a2.getName());
		System.out.println(a2.getAge());
		
		
		
	}

}
