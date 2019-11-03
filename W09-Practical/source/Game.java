
public class Game {

    // The following five constants were defined in the starter code (kt54)
    private static String FOXPLAYS_MSG      = "Fox plays. Enter move:";
    private static String GEESEPLAY_MSG     = "Geese play. Enter move:";
    private static String ILLEGALMOVE_MSG   = "Illegal move!";
    private static String FOXWINS_MSG       = "Fox wins!";
    private static String GEESEWIN_MSG      = "Geese win!";
    private static final char FOX     = '*';
    private static final char GOOSE   = 'o';
    private static final char FREE    = '.';
    private static final char INVALID = ' ';
    
    private Board gameBoard;
    
    private int NUM = 1;	//turns
    private int turn;	//decide turn
    //initialise all
    int x1,x2,y1,y2;
    
    boolean move,eat;
    
    //get board
    //char[][] board = gameBoard.board();
    
    // Minimal constructor. Expand as needed (kt54)
    public Game() {
        gameBoard = new Board();  
    }

    // Build on this method to implement game logic.
    public void play() {

        EasyIn2 reader = new EasyIn2();

        gameBoard = new Board();

        char[][] board = gameBoard.board;
        
        //this.board = gameBoard.board();

        boolean done = false;
        
        while(!done) {
            boolean less = false;
            while (!less) {
                gameBoard.printBoard();
                //
                //get turns
                turn = NUM % 2;
                if (turn == 1) {
                    System.out.println(GEESEPLAY_MSG);
                } else {
                    System.out.println(FOXPLAYS_MSG);
                }

                //get int from reader

                x1 = reader.getInt();
                y1 = reader.getInt();
                x2 = reader.getInt();
                y2 = reader.getInt();
                if (x1 < 7 && x2 < 7 && y1 < 7 && y2 < 7) {
                    less = true;
                } else {
                    System.out.println(ILLEGALMOVE_MSG);
                }
            }
            //make move illegal initially
            move = false;
            eat = false;


            //move and eat
            if ((x1 + 1 == x2 || x1 - 1 == x2 || x1 == x2) && (y1 + 1 == y2 || y1 - 1 == y2 || y1 == y2) && (board[x2][y2] == FREE)) {
                //System.out.println("TEST 1");
                move = true;
            }
            //if areas in 2 is free and there are goose in middle -- move
            if ((x1 + 2 == x2 || x1 - 2 == x2 || x1 == x2) && (y1 + 2 == y2 || y1 - 2 == y2 || y1 == y2) && (turn == 0) && (board[x2][y2] == FREE)) {
                if (board[(x1 + x2) / 2][(y1 + y2) / 2] == GOOSE) {
                    eat = true;
                }
            }

            //choose and turn
            if (turn == 1) {

                if ((move == true) && (board[x1][y1] == GOOSE) && (board[x2][y2] == FREE)) {
                    board[x2][y2] = board[x1][y1];
                    board[x1][y1] = FREE;
                    NUM = NUM + 1;
                } else {
                    System.out.println(ILLEGALMOVE_MSG);
                }
            } else {
                if (((move == true) || (eat == true)) && (board[x1][y1] == FOX) && (board[x2][y2] == FREE)) {
                    if (move == true) {
                        board[x2][y2] = board[x1][y1];
                        board[x1][y1] = FREE;
                        NUM = NUM + 1;
                    }
                    if (eat == true) {
                        board[x2][y2] = board[x1][y1];
                        board[x1][y1] = FREE;
                        NUM = NUM + 1;
                        board[(x1 + x2) / 2][(y1 + y2) / 2] = FREE;
                    }
                } else {
                    System.out.println(ILLEGALMOVE_MSG);
                }
            }
            //set winner
            /*if((move = false)&&(eat=false)){
            	System.out.println(GEESEWIN_MSG);
            	done = true;
            }*/
            //goose winner
            //in the centre how goose win
            int size = gameBoard.size();
            boolean gooseWin = false;
            for(int x=0;x<size;x++) {
                for (int y = 0; y < size; y++) {
                    if (board[x][y] == FOX) {
                        if (x > 2 && y > 2 && (x < size - 2) && (y < size - 2)) {
                            for(int i=-1;i<2;i++){
                                for(int j=-1;j<2;j++){
                                    if (board[x + i][y + j] != FREE) {
                                    //first winner
                                        if (board[x + 2][y] != FREE && board[x - 2][y] != FREE && board[x][y + 2] != FREE &&
                                        board[x][y - 2] != FREE && board[x + 2][y + 2] != FREE && board[x - 2][y - 2] != FREE) {
                                        gooseWin = true;
                                        }
                                    }
                                }
                            }
                        }
                        else{
                            int unmove = 0;
                            int unfree = 0;
                            int[] o = {-2,0,2};
                            int[] f = {-2,0,2};
                            int[] u = {-1,0,1};
                            int[] p = {-1,0,1};
                            for(int i = 0;i<3;i++) {
                                for(int j = 0;j<3;j++) {
                                    //try catch to calculate how many  place it can move
                                    try {
                                        if (board[x + o[i]][y + f[j]] != FREE) {
                                            unfree = unfree + 1;
                                        }
                                    } catch (Exception e) {
                                        unfree = unfree + 1;
                                    }
                                    try {
                                        if (board[x + u[i]][y + p[j]] != FREE) {
                                            unmove = unmove + 1;
                                        }
                                    } catch (Exception e) {
                                        unmove = unmove + 1;
                                    }
                                }
                            }//for end
                            //there have to calculate goose itself so is 19
                            if(unfree + unmove == 18){
                                gooseWin = true;
                            }
                        }

                    }//fox finding
                } 
            }
            if(gooseWin == true){
                gameBoard.printBoard();
                System.out.println(GEESEWIN_MSG);
                done = true;
            }

            //fox winner
            int amount;
            amount = gameBoard.amount();
            if(amount == 0){
                gameBoard.printBoard();
            	System.out.println(FOXWINS_MSG);
            	done = true;
            }
            
            //save and initiallise
        }
    }
}
