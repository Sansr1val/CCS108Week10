import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Subject> listSubjects = new ArrayList<Subject>();
		
		while(true) {
			try {
				System.out.println("[1] Add New Subject");
				System.out.println("[2] Search Subject");
				System.out.println("[3] Modify the details of the Subject");
				System.out.println("[4] Remove a Subject");
				System.out.println("[5] Display Subject");
				
				System.out.println("\nEnter your Command: ");
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
					System.out.print("Enter the ID of the subject you're looking for: ");
					int id = Integer.parseInt(br.readLine());
					for(int i = 0; i<listSubjects.size();i++) {
						if(listSubjects.get(i).getSubjectId() == id) {
							System.out.println("Subject found!");
							listSubjects.get(i).Display();
							break;
						}else {
							System.out.println("Subject not found.");
						}
					}
					break;
				case 3:
					break;
				case 4:
					System.out.println("Enter the Subjects ID: ");
					id = Integer.parseInt(br.readLine());
					for (int index = 0; index < listSubjects.size(); index++) {
						if (listSubjects.get(index).getSubjectId() == id) {

							listSubjects.remove(index);
						}
					}
					break;
				case 5:
					System.out.println("Subject Details: \n");
					for(int i = 0; i<listSubjects.size();i++) {
						listSubjects.get(i).Display();
					}
					break;
				}
				
			} catch (Exception e) {
				System.out.println("Invalid Input.\n");
			}
		}
	}
}
