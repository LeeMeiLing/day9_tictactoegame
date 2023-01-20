package sg.edu.nus.iss;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        String[] tttBoard = new String[9];
        // player X and O
        String player = "X";
        String winner = "";

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

        Scanner scanner = new Scanner(System.in);

        while(winner == ""){

            // if(player.equalsIgnoreCase("O")){
            //     System.out.println("Player O's turn");
            // }else if(player.equalsIgnoreCase("X")){
            //     System.out.println("Player X's turn");
            // }

            System.out.println("Player " + player + " enter your position: ");

            //play tic-tac-toe logic here
            Integer input;
            input = scanner.nextInt();

            // only accept keyboard input 1 to 9
            if((input > 0) && (input < 10)){

            }else{
                System.out.println("Invalid input: Only number 1 to 9 is allowed.");
                continue;
            }

            // assign 'X' or 'O' toposition if its number is still in the tttboard
            if(tttBoard[input-1].equals(String.valueOf(input))){
                tttBoard[input-1] = player;
                if(player.equalsIgnoreCase("X")){
                    player = "O";
                }else{
                    player = "X";
                }
            }else{
                System.out.println("Position already taken up. Please enter another position number");
            }

            ttt.printBoard(tttBoard);
            winner = ttt.checkWinner(tttBoard);
        }

        scanner.close();
    }
}
