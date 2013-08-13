import java.util.Scanner;


public class Board {
	private int[][]board=new int[10][10];
	int i,j;
	public void printBoard(){
		int rows=10;
		int columns=10;
		for(i=0; i<rows; i++){
			for(j=0; j<columns; j++){
				System.out.print(board[i][j] + " " );
			}
			System.out.println( "" );
		}
	}
	public void userFill() {
		for(int g=6; g<10; g++){
			for(int q=0;q<10;q++){
				System.out.println("Enter your pieces and where you want to put them");
				Scanner x=new Scanner(System.in);
				int y=x.nextInt()%13;
				if(y>=13){
					System.out.println("Enter a valid number\n"+ "Enter your pieces and where you want to put them ");
					break;
				}
				System.out.println(y);
				board[g][q]=y;
				printBoard();
			System.out.println( "" );
		}
		}
			
			}
	
	public void aiFill() {
		
	}
	
	public Board(){
		
		// TODO: doubly nested loops to set to 0 (safely initialize array)
	}

}
