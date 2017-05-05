package javatestpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class StageFive {
	static ArrayList <Boat> dockedBoats = new ArrayList<Boat>();
	static ArrayList<Person> people = new ArrayList<Person>();
	static ArrayList<Marina> Marina = new ArrayList<Marina>();
	
	public static void main(String[] args) {
		

		String s = fileReader("stage_5_input.txt");
		System.out.println(s);
		stringParser(s);
		for(int i =0; i< Marina.size(); i++){
			System.out.println(Marina.get(i).getLocation());
		}
	}
	
	public static String fileReader(String filePath){
		
		String fileInfo = "";
		File x = new File(filePath);
		try
		{
			Scanner sc = new Scanner(x);
			while(sc.hasNext())
			{
				fileInfo += "," + (sc.nextLine() );
			}
			sc.close();
			return fileInfo;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return( "System Alert: file not found" + "\r\n"+ "Ensure it was in the correct directory"); 
		}
		
	}

	public static void stringParser(String input){
	
			String completeFile = input;
			completeFile = completeFile.replace(",,",",@,");
			//System.out.println(completeFile);

			String delim1 = "[@]";
			String delim2 = "[|]";
			String delim3 = "[,]";
			String delim4 = "[ ]";
			//String[][] spaces = new String[7][7];

			String[] firstSplit = completeFile.split(delim1);
			for(int i = 0; i<firstSplit.length; i++){
				System.out.println(firstSplit[i]);
			}
			
			//split the marinas 
			String[] marinas = firstSplit[1].split(delim2);
			for(int i = 0; i<marinas.length-1; i++){
				String[]details = marinas[i].split(delim3);
				Marina.add(new Marina(details[1],  (Integer.parseInt(details[details.length-1])) ));
			}
			
			//split the boats
			String [] boats = firstSplit[3].split(delim2);
			for(int i = 0; i<boats.length-1; i++){
				String[]details = boats[i].split(delim3);				
				dockedBoats.add(new Boat(details[1],details[2],(Float.parseFloat(details[3]))));
			}
			
			//split the people
			String [] persons = firstSplit[5].split(delim2);
			for(int i = 0; i<persons.length-1; i++){
				System.out.println(persons[i]);
				String[]details = persons[i].split(delim3);
				System.out.println(details[1]);
				if (details[1].equals("Adele")){
					people.add(new Person(details[1],"Adele",details[2],details[3]));
				}
				else if (details.length>4){
					String[]names = details[1].split(delim4);
					System.out.println(names[1]);
					people.add(new Person(names[0],names[1],details[2],details[3],details[4]));
				}
				else{
					String[]names = details[1].split(delim4);
					people.add(new Person(names[0],names[1],details[2],details[3]));
				}
				
			}
	}
}
