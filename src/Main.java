import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		List<Subject> listSubjects = new ArrayList<Subject>();
		
	while(true) {
		try {
			System.out.println("[1] Add New Subject");
			System.out.println("[2] Search Subject");
			System.out.println("[3] Modify the details of the Subject");
			System.out.println("[4] Remove a Subject");
			System.out.println("[5] Display Subject");
			
			System.out.println("\nEnter your Command: ");
			int command =  Integer.parseInt(rd.readLine());
			
			switch(command) {
			
			case 1:
				try {
					System.out.print("Enter Subject Name: ");
					String name = rd.readLine();
					System.out.print("Enter Number of Units: ");
					int units = Integer.parseInt(rd.readLine());
					listSubjects.add(new Subject(name, units));
				} catch (Exception e) {
					System.out.println("Invalid Input.\n");
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
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
