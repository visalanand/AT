package maps;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add more test cases		
		
		Relatives rel = new Relatives();
		System.out.println(rel.readFileAndPrintRelatives());
		System.out.println(rel.getRelatives());
	}
}