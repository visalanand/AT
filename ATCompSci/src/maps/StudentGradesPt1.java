package maps;

import java.util.Map;
import java.util.Scanner;

public class StudentGradesPt1 {
	   /**
	   Prints the options menu and returns the letter that the user types does not check for invalid selection
	      @return the next token on the input stream
	   */
	   public static String printMenuAndGetChoice(){
		   System.out.println("Choose A Option");
		   
		   System.out.println("1.) Print Grades");
		   System.out.println("2.) Modify Students");
		   System.out.println("3.) Add Students");
		   System.out.println("4.) Remove Students");
		
		   Scanner scan = new Scanner (System.in);
		   
		   String a = scan.nextLine();
		   return a;
		   
		   
		   
	   }

	   /**
	      Prints the students and grades
	      @param gradeMap the map to print
	   */
	   public static void printGrades(Map<String, String> gradeMap){
		   
		   System.out.println(gradeMap.toString());
		   
		   
		   
	   }

	   /**
	   Modifies an entry based on user input.  Prints an error if an invalid student is modified
	      @param gradeMap the map to modify
	   */
	   public static void modifyStudent(Map<String, String> gradeMap){
		   Scanner scan = new Scanner (System.in);
		   
		   String a = scan.nextLine();
		   
	   }

	   /**
	      Removes a student from the map based on user input
	      @param gradeMap the map to remove the student from
	   */
	   public static void removeStudent(Map<String, String> gradeMap){
		   
	   }

	   /**
	      Adds a student based on user input.  Prints an error if a student
	      is added that already exists in the map.
	      @param gradeMap the map to add the student to
	   */
	   public static void addStudent(Map<String, String> gradeMap){
		   
	   }


}
