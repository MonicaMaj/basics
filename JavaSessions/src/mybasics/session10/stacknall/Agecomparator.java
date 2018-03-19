package mybasics.session10.stacknall;

import java.util.Comparator;

public class Agecomparator implements Comparator<Patients>
{

	@Override
	public int compare(Patients o1, Patients o2) {
	
		return (o1.getAge()==o2.getAge()? o1.getId().compareTo(o2.getId()) : o1.getAge()>o2.getAge()  ? -1:1);
	}
}

