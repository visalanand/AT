package maps;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		Acronyms ac = new Acronyms();
		System.out.println(ac.readFile());
		
		
		System.out.println(ac.acronymTable);
	}
}