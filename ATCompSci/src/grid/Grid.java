package grid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Grid {
	private String[][] grid;

	public Grid() throws FileNotFoundException {

	}

	public Grid(int rows, int cols, String[] vals) {
		grid = new String[rows][cols];
		int random = 0;
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[0].length; y++) {
				random = (int) (Math.random() * vals.length);
				grid[x][y] = vals[random];
			}
		}

	}
	
	
	public int findAdjacent(int row, int col,String val){
		if ( row < 0 || row == grid.length || col <0 || col == grid[0].length)	
			return 0;
		
		if (grid[row][col] != val)
			return  0;
		0
		
		grid[row][col] = Integer.MAX_VALUE + "";
		 
		return 1 + findAdjacent(++row,col,val)+ findAdjacent(--row,col,val) + findAdjacent(row,++col,val) + findAdjacent(row, --col, val);
		
	}
	public void restoreArray(String val){
		for (int x = 0; x< grid.length;x++){
			for (int y =0; y<grid[0].length;y++){
				if (grid[x][y].equals(Integer.MAX_VALUE+"")){
					grid[x][y] = val;
				}
			}
				
			
		}
	}
	
	
	
	



	public void setGrid(int rows, int cols, String[] vals) {

		grid = new String[rows][cols];
		int random = 0;
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[0].length; y++) {
				random = (int) (Math.random() * vals.length);
				grid[x][y] = vals[random];
			}
		}

	}

	public int findMax(String val) {
		int max = 0;
		int temp = 0;
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[0].length; y++) {
				if (val.equals(grid[x][y])) {
					temp = findAdjacent(x,y,val);
					 if ( temp > max){
						 max = temp;
					 }

				}
			}
		}

		return max;

	}

	// private int findMax(int r, int c, String search)
	// {
	// return 0;
	// }

	public String toString() {
		String n ="";
		for (String [] s : grid){
			for (String a:s){
				n = n+ a + "  ";
			}
			n= n+"\n";
		}
		return n;

	}
}