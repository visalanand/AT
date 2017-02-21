package maze;

public class MazeRunner {

	
	
	public static void main(String args[]) {
		char[][] m = { 
{ '*', ' ', '*', '*', '*', '*', '*', '*', '*' }, 
{ '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
{ '*', ' ', '*', '*', '*', '*', '*', ' ', '*' }, 
{ '*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*' },
{ '*', ' ', '*', '.', '*', '*', '*', ' ', '*' }, 
{ '*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*' },
{ '*', '*', '*', ' ', '*', ' ', '*', ' ', '*' }, 
{ '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
{ '*', '*', '*', '*', '*', '*', '*', '*', '*' } };

		Maze maze = new Maze(m, 4, 3);
		if (maze.findExit())
			System.out.println("There is an exit at (" 
					+ maze.getIExit() + ", " 
					+ maze.getJExit() + ")");
		else
			System.out.println("No exit was found");

		System.out.println();
		System.out.println();
		maze.display();
		System.out.println("Steps:" + maze.getSteps());

	}

	
	
}
