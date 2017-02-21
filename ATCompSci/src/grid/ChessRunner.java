package grid;

class ChessRunner {
 
	public static void main(String[] args){
		
		int[][] a= new int[5][5];
		Chess G_Bush=new Chess(a);
		G_Bush.recursiveKnight(0,0,1,a);
		
		//			t.printStackTrace();
				
		System.out.print("Recursive method call count: ");
        System.out.printf("%,d", +G_Bush.getCount());
        System.out.println();
		System.out.println(G_Bush);
	
		
	}
	
	
}
