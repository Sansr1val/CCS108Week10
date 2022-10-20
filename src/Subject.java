
public class Subject {
	
	static private int subjectId = 1;;
	private String subjectName;
	private int noOfUnits;
	
	public Subject( String subjectName, int noOfUnits) {
		this.subjectId++;
		this.subjectName = subjectName;
		this.noOfUnits = noOfUnits;
	}

	public static int getSubjectId() {
		return subjectId;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}
	
	public String Display() {
		String details = "Subject ID; "+ this.subjectId+ "\nSubject Name: "+this.subjectName+
				"\bNumber of Units: "+this.noOfUnits;
		return details;
	}
	

}
