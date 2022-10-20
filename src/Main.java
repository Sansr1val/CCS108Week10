import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		List<Subject> listSubject = new ArrayList<Subject>();
		
		listSubject.add(new Subject(1, "OOP",3));
		listSubject.add(new Subject(2, "DSA",3));
		listSubject.add(new Subject(3, "DS",3));
		listSubject.add(new Subject(4, "HIS",3));
			
		System.out.println("[1] Add New Subject");
		System.out.println("[2] Search Subject");
		System.out.println("[3] Modify the details of the Subject");
		System.out.println("[4] Remove a Subject");
		System.out.println("[5] Display Subject");
		
		
		
		
		
		
		
		
	

	}

}
