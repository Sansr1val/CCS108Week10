
public class Subject {
	static private int ID =0;
	private int subjectId;;
	private String subjectName;
	private int noOfUnits;
	
	public Subject( String subjectName, int noOfUnits) {
		Subject.ID++;
		this.subjectId = ID;
		this.subjectName = subjectName;
		this.noOfUnits = noOfUnits;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}
	
	public void Display() {
		System.out.println("Subject ID: "+this.subjectId);
		System.out.println("Subject Name: "+this.subjectName);
		System.out.println("Number of Units: "+this.noOfUnits);
	}
	

}
