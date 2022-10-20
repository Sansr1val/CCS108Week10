import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static boolean isFound = false;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Subject> listSubjects = new ArrayList<Subject>();
		/*
		 * The main menu contain the operations.
		 * The input is checked before using the operation.
		 * When an error occurs, the user is returned to the main menu.
		 * Each operation also checks the user input, it also goes back to the main menu if an error occurs.
		 */
		while(true) {
			try {
				System.out.println("\n[1] Add New Subject");
				System.out.println("[2] Search Subject");
				System.out.println("[3] Modify the details of the Subject");
				System.out.println("[4] Remove a Subject");
				System.out.println("[5] Display Subject");
				
				System.out.print("\nEnter your Command: ");
				int command =  Integer.parseInt(br.readLine());
				
				switch(command) {
				
				case 1:
					try {
						System.out.print("Enter Subject Name: ");
						String name = br.readLine();
						System.out.print("Enter Number of Units: ");
						int units = Integer.parseInt(br.readLine());
						listSubjects.add(new Subject(name, units));
					} catch (Exception e) {
						System.out.println("Invalid Input.\n");
					}
					break;
				case 2:
					/*
					 * If the subjectId is present in the list it is going to be displayed.
					 * If not, a prompt will tell that it is not found.
					 */
					System.out.print("Enter the ID of the subject you're looking for: ");
					int id = Integer.parseInt(br.readLine());
					int i;
					
					for(i = 0; i<listSubjects.size();i++) {
						if(listSubjects.get(i).getSubjectId() == id) {
							isFound =true;
							break;
						}
					}
					
					if(isFound) {
						System.out.println("Subject found!");
						listSubjects.get(i).Display();
					}else {
						System.out.println("Subject is not found!");
					}
					isFound = false;
					break;
				case 3:
					/*
					 * Checks first if the subject exists in the list
					 * If it exists the name and number of units of the subject can be changed
					 * by the user.
					 */
					System.out.print("Enter the ID of the subject: ");
					id = Integer.parseInt(br.readLine());
					int x;
					for(x = 0; x<listSubjects.size();x++) {
						if(listSubjects.get(x).getSubjectId() == id) {
							isFound =true;
							break;
						}
					}
					
					if(isFound) {
						System.out.println("Subject found!");
						System.out.print("Enter the name of the subject: ");
						String name = br.readLine(); 
						System.out.print("Enter number of units: ");
						int units = Integer.parseInt(br.readLine());
						listSubjects.get(x).setSubjectName(name);
						listSubjects.get(x).setNoOfUnits(units);
						
					}else {
						System.out.println("Subject is not found!");
					}
					isFound = false;
					break;
				case 4:
					/*
					 * If the subjectId is present in the list it is going to be removed.
					 * If not, a prompt will tell that it is not found and no subject will be removed.
					 */
					System.out.println("Enter the Subjects ID: ");
					id = Integer.parseInt(br.readLine());
					int index;
					
					for ( index = 0; index < listSubjects.size(); index++) {
						if (listSubjects.get(index).getSubjectId() == id) {
							isFound = true;
							break;
						}
					}
					
					if(isFound) {
						System.out.println("Subject Removed: ");
						listSubjects.get(index).Display();
						listSubjects.remove(index);
					}else {
						System.out.println("Subject is not found!");
					}
					isFound = false;
					break;
				case 5://all the details of each subjects in the list will be displayed
					System.out.println("Subject Details: \n");
					for(int j = 0; j<listSubjects.size();j++) {
						listSubjects.get(j).Display();
						System.out.println("");
					}
					break;
				}
				
			} catch (Exception e) {
				System.out.println("Invalid Input.\n");
			}
		}
	}
}
