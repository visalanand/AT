package grid;

public class Chess {

	int[][] knightArray;
	public int count;
	boolean done;
	public int [] Xvals = {2,2,-2,-2,1,-1,1,-1};
	public int[] Yvals = {1,-1,1,-1,-2,-2,2,2};

	public Chess(int [][] _knightArray) {
		knightArray = _knightArray;
		count = 0;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int[][] getArray() {
		return knightArray;
	}

	public void setknightArray(int[][] knightArray) {
		this.knightArray = knightArray;
	}

	public boolean isNotValid(int x, int y,int[][] tempArray){
		if ((x < 0 || x > tempArray.length -  1 || y < 0 || y > tempArray[0].length - 1) )
			return true;
	
		return (tempArray[x][y] != 0);
			
	}


	public boolean recursiveKnight(int x, int y, int stackCount,int [][] tempArray) {
		if ( stackCount == tempArray.length * tempArray[0].length)
			return true;
		count += 1;
		if (!isNotValid(x,y,tempArray)){
			

			tempArray[x][y] =  stackCount++;
		
		
			
			for (int a = 0; a < Xvals.length;a++ ) {
				// return possible array
				
				if (recursiveKnight(x+(Xvals[a]),y+(Yvals[a]),stackCount, tempArray)){
					 return true;
					} 
					else{
						
						
					}
		}
	}
//			
			knightArray = tempArray;
		
			return false;

	}
	
	
	
	
	
	
	public boolean recursiveQueen(int x , int y, String [] queenArray){
		
		
		if (y == queenArray.length ){
			
			return true;
			
		}
		
		
		for ( int i = 0; x< queenArray[0].length();i++)
		{
			
		}
		
		
		
		
	}

		
		
		
	
	
	
	public String toString() {
		String temp = "";

		for (int a = 0; a < knightArray.length; a++) {
			for (int b = 0; b < knightArray[0].length; b++) {
				temp += knightArray[a][b] + "\t";
			}
			temp += "\n";
		}
		return temp;
	}

}

// __________████████_____██████
// _________█░░░░░░░░██_██░░░░░░█
// ________█░░░░░░░░░░░█░░░░░░░░░█
// _______█░░░░░░░███░░░█░░░░░░░░░█
// _______█░░░░███░░░███░█░░░████░█
// ______█░░░██░░░░░░░░███░██░░░░██
// _____█░░░░░░░░░░░░░░░░░█░░░░░░░░███
// ____█░░░░░░░░░░░░░██████░░░░░████░░█
// ____█░░░░░░░░░█████░░░████░░██░░██░░█
// ___██░░░░░░░███░░░░░░░░░░█░░░░░░░░███
// __█░░░░░░░░░░░░░░█████████░░█████████
// -█░░░░░░░░░░█████_████___████_█████___█
// _█░░░░░░░░░░█______█_███__█_____███_█___█
// █░░░░░░░░░░░░█___████_████____██_██████
// ░░░░░░░░░░░░░█████████░░░████████░░░█
// ░░░░░░░░░░░░░░░░█░░░░░█░░░░░░░░░░░░█
// ░░░░░░░░░░░░░░░░░░░░██░░░░█░░░░░░██
// ░░░░░░░░░░░░░░░░░░██░░░░░░░███████
// ░░░░░░░░░░░░░░░░██░░░░░░░░░░█░░░░░█
// ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█
// ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█
// ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█
// ░░░░░░░░░░░█████████░░░░░░░░░░░░░░██
// ░░░░░░░░░░█▒▒▒▒▒▒▒▒███████████████▒▒█
// ░░░░░░░░░█▒▒███████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█
// ░░░░░░░░░█▒▒▒▒▒▒▒▒▒█████████████████
// ░░░░░░░░░░████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█
// ░░░░░░░░░░░░░░░░░░██████████████████
// ░░░░░░░░░░░░░░░░░░░░░░░░░ ░░░░░░█
// ██░░░░░░░░░░░░░░░░░░░░░░░░░░░██
// ▓██░░░░░░░░░░░░░░░░░░░░░░░░██
// ▓▓▓███░░░░░░░░░░░░░░░░░░░░█
// ▓▓▓▓▓▓███░░░░░░░░░░░░░░░██
// ▓▓▓▓▓▓▓▓▓███████████████▓▓█
// ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██
// ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█
// ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█