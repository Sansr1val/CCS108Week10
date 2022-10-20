
public class Subject {
	static private int ID =0;
	private int subjectId;;
	private String subjectName;
	private int noOfUnits;
	
	/*
	 * Ths static int ID will be increased on each creation of a subject.
	 * That id will be assigned on the created subject.
	 */
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
	//displays the informations of the subject.
	public void Display() {
		System.out.println("Subject ID: "+this.subjectId);
		System.out.println("Subject Name: "+this.subjectName);
		System.out.println("Number of Units: "+this.noOfUnits);
	}
	

}
