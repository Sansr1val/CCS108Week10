
public class Subject {
	
	private int subjectID;
	private String subjectName;
	private int noOfUnits;
	
	//getters
	public int getSubjectID() {
		return subjectID;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getNoOfUnits() {
		return noOfUnits;
	}
	
	//setters
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}
	
	public Subject() {}
	
	public Subject(int subjectID, String subjectName, int noOfUnits) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.noOfUnits = noOfUnits;
	}
	
	public void Display() {
		System.out.println(this.subjectID);
		System.out.println(this.subjectName);
		System.out.println(this.noOfUnits);
	}
	
	
}
