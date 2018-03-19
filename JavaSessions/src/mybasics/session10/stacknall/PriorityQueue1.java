package mybasics.session10.stacknall;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		Queue<Patients> patients=new PriorityQueue<>(new Agecomparator());
		Patients p1=new Patients("patient1", 30, "1");
		Patients p2=new Patients("patient2", 70,"2");
		Patients p3=new Patients("patient3", 50,"3");
		Patients p4=new Patients("patient4", 60,"4");
		
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		patients.add(p4);
		
		while(true)
		{
			Patients p=patients.poll();
			if(p==null)
			{
				break;
				
			}
			System.out.println(p.getName());
		}
		
		
		
	}

}
