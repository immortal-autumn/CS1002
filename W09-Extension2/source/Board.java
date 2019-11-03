import java.util.Random;

public class Board {

    // The following five constants were defined in the starter code (kt54)
	Random random = new Random();
	
	private static final int  DEFAULT_SIZE = 7;
    private static final char FREE    = '.';
    private static final char INVALID = ' ';
    private static final char FOX     = '*';
    private static final char GOOSE   = 'o';

    private int boardsize;
    public char[][] board;
    
    
    // Default constructor was provided by the starter code. Extend as needed (kt54) 
    public Board() {
        this.boardsize = DEFAULT_SIZE;

        board = new char[boardsize][boardsize];

        // Clear all playable fields
        for(int x=0; x<boardsize; x++){
            for(int y=0; y<boardsize; y++){
                board[x][y] = FREE;
            }
        }
        
        // Put a single fox in the middle
        board[boardsize/2][boardsize-2] = FOX;
        //put goose on the top
        for(int i=0;i<boardsize;i++){
        	for(int j=0;j<4;j++){
        		board[i][j] = GOOSE;
        	}
        }
        for(int i=2;i<5;i++){
        	board[i][3] = FREE;
        }
        //delete invalid area
        int boardsizeC = boardsize - 1;
        for(int x=0;x<2;x++){
        	for(int y=0;y<2;y++){
        		board[x][y] = INVALID;
        		board[boardsizeC-x][boardsizeC-y] = INVALID;
        		board[boardsizeC-x][y] = INVALID;
        		board[x][boardsizeC-y] = INVALID;
        	}
        }
        for(int i=0;i<boardsize;i++){
        	for(int j=0;j<boardsize;j++){
        		if(board[i][j] == FREE){
        			int randNUM1 = random.nextInt(boardsizeC);
        			int randNUM2 = random.nextInt(boardsizeC);
        			if(board[randNUM1][randNUM2] != FREE){
        				board[i][j] = board[randNUM1][randNUM2];
        				board[randNUM1][randNUM2] = FREE;
        			}
        		}
        	}
        }
        
    }
        // Prints the board. This method was provided with the starter code. Better not modify to ensure
    // output consistent with the autochecker (kt54)
    public void printBoard() {

        for(int y=0;y<boardsize;y++) {
            for(int x=0;x<boardsize;x++) {
                System.out.print(" ");
                switch(board[x][y]) {
                    case FREE: 
                        System.out.print(".");
                        break;
                    case FOX:
                        System.out.print("*");
                        break;
                    case GOOSE:
                        System.out.print("o");
                        break;
                    default:
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public int amount(){
    	//get the rest of goose
    	int amount = 0;
        for(int i=0;i<boardsize;i++){
        	for(int j=0;j<boardsize;j++){
        		if(board[i][j] == GOOSE){
        			amount = amount + 1;
        		}
        	}
        }
		return amount;
    }
    public int size(){
        int size = boardsize;
        return size;
    }

}
