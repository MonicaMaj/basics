package inheritance.basics.session6;

public class Faculty extends Person {
	private String fname;
	private String fid;
	

	public Faculty(String fname, String fid) {
		super();
		this.fname = fname;
		this.fid = fid;
	}
	
	
	
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}





	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public void changefaculty() {
			System.out.println("faculty");
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Faculty f= (Faculty)obj;
		
		return this.getFid().equals(f.getFid()) && this.getFname().equals(f.getFname());
	}

 
	

}
