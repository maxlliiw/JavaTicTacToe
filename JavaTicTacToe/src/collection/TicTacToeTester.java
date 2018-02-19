package collection;

import java.util.Scanner;

public class TicTacToeTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String player = "X";
        TicTacToe game = new TicTacToe();
        
        boolean done = false;
        while(!done) {
            System.out.print(game.toString());
            System.out.print("Row for player " + player + " (-1 to exit): ");
            int row = in.nextInt();
            
            if(row < 0) done = true;
            else {
                System.out.print("Column for player " + player + ": ");
                int column = in.nextInt();
                game.set(row, column, player);
                
                if(player.equals("X")) player = "O";
                else player = "X";
            }
        }
        System.out.println("Game Over");
    }
}

