package maps;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentGradesPt2 {
	
	   /**
	   Prints the options menu and returns the letter that the user types does not check for invalid selection
	      @return the next token on the input stream
	   */
	static Map <Student, String> _gradeMap = new TreeMap<Student, String>();
	static Map<Integer, Student> _idToStudentMap = new TreeMap<Integer, Student>();
	   public static String printMenuAndGetChoice()
	   {
		   System.out.println("Choose A Option");

			System.out.println("1.) Print Grades");
			System.out.println("2.) Modify Students");
			System.out.println("3.) Add Students");
			System.out.println("4.) Remove Students");
			System.out.println("5.) Quit");
			Scanner scan = new Scanner(System.in);

			String a = scan.nextLine();
			int cha = (int)a.charAt(0);
			if ((cha <47) || (cha> 58)  ){
				System.out.println("Wrong Choice Try again");
				printMenuAndGetChoice();
			}
			if (Integer.parseInt(a) == 1){
				printGrades(_gradeMap);
			}
			else if (Integer.parseInt(a) == 2){
				modifyStudent(_gradeMap, _idToStudentMap);
			}
			else if (Integer.parseInt(a) == 3){
				addStudent(_gradeMap, _idToStudentMap);
			}
			else if (Integer.parseInt(a) == 4){
				removeStudent(_gradeMap, _idToStudentMap);
			}
			else if (Integer.parseInt(a) == 5){
				System.exit(0);
			}
			else {
				System.out.println("Wrong Choice Try again");
				printMenuAndGetChoice();
			}
			return a;
	   }

	   /**
	      Prints the students and grades
	      @param gradeMap the map to print
	   */
	   public static void printGrades(Map<Student, String> gradeMap){
		   
		   Set<Student> set = gradeMap.keySet();
		   for (Student b: set){
			   System.out.println(b.firstName+ " "+ b.lastName +" Grades: "+ gradeMap.get(b));
		   }
		   printMenuAndGetChoice();
	   }

	   /**
	   Modifies an entry based on user input.  Prints an error if an invalid student is modified
	      @param gradeMap the map to modify
	      @param idToStudentMap  the map to associate student id with a student
	   */
	   public static void modifyStudent(Map<Student, String> gradeMap,
	         Map<Integer, Student> idToStudentMap){
		   System.out.println("What is the Students ID?");
		   Scanner scan = new Scanner(System.in);
		   String a = scan.nextLine();
		   System.out.println("Grade?");
		   String b = scan.nextLine();
		  Student student  = idToStudentMap.get(Integer.parseInt(a));
		  if (student == null){
			  System.out.println("No student found");
		  }
		  gradeMap.remove(student);
		  gradeMap.put(student, b);
		  printMenuAndGetChoice();
	   }
	   /**
	      Removes a student from the map based on user input
	      @param gradeMap the map to remove the student from
	      @param idToStudentMap the map to associate student id with a student
	   */
	   public static void removeStudent(Map<Student, String> gradeMap,
	         Map<Integer, Student> idToStudentMap){
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Last Name");
			String a = scan.nextLine();
			
			for (Student st: gradeMap.keySet()){
				if (st.lastName.equals( a)){
					gradeMap.remove(st);
					idToStudentMap.remove(st.getId());
				}	
				}
			
				
				_gradeMap = gradeMap;
				_idToStudentMap = idToStudentMap;
			
			printMenuAndGetChoice();
	   }
	   /**
	      Adds a student based on user input.  Prints an error if a student
	      is added that already exists in the map.
	      @param idToGradeMap the map to add the student to
	      @param idToStudentMap the map to associate student id with a student
	   */
	   public static void addStudent(Map<Student, String> idToGradeMap,
	         Map<Integer, Student> idToStudentMap){
		   Scanner scan = new Scanner(System.in);
		   System.out.println("First Name");
			String a = scan.nextLine();
			System.out.println("Last Name");
			String b = scan.nextLine();
			System.out.println("ID");
			Integer c = Integer.parseInt(scan.nextLine());
			System.out.println("Grade");
			String d = scan.nextLine();
			Student student = new Student(b,a,c);
			if (idToGradeMap.containsKey(student)){
				System.out.println("A Student already exists with these parameters");
			}
			else{
				idToGradeMap.put(student, d);
				idToStudentMap.put( student.getId(),student);
			}
			printMenuAndGetChoice();
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
printMenuAndGetChoice();
	}

}
