package sg.edu.nus.iss;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        String[] tttBoard = new String[9];
        // player X and O
        String player = "X";

        // populating tic tac toe board with 1 to 9
        for(int i = 0; i < 9; i++){
            tttBoard[i] = String.valueOf(i+1);
        }

        TicTacToe ttt = new TicTacToe();

        // print out the initial tic tac toe board
        ttt.printBoard(tttBoard);

        System.out.println("Tic-Tac-Toe game");
        System.out.println("-------------------------");
        System.out.println("Player X will play first");

    }
}
