package assignment4;

public class StringObjects {
	private int id;
	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getSname() {
		return sname;
	}

//	public void setSname(String sname) {
//		this.sname = sname;
//	}

	public String getScity() {
		return scity;
	}

//	public void setScity(String scity) {
//		this.scity = scity;
//	}

	private String sname;
	private String scity;
	
	public StringObjects(int id, String sname, String scity) {
		super();
		this.id = id;
		this.sname = sname;
		this.scity = scity;
	}	
}
