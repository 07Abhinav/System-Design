package TicTacToe.Utility;

import javax.swing.text.Position;

import CommonEnum.Symbol;
import GameStateHandler.Context.GameContext;


public class Board {
    private final int rows;
    private final int columns;
    private Symbol[][] board;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        board = new Symbol[rows][columns];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                board[i][j] = Symbol.EMPTY;
            }
        }
    }

    public boolean isValidMove(Position pos) {
        return pos.row >= 0 && pos.row < rows && pos.col >= 0 && pos.col < columns && board[pos.row][pos.col] == Symbol.EMPTY;
    }

    public void makeMove(Position pos, Symbol symbol) {
        board[pos.row][pos.col] = symbol;
    }

    public void checkGameState(GameContext context, Player currentPlayer) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < rows; i++) {
            if (board[i][0] != Symbol.EMPTY && 
                isWinningLine(board[i])) {
                context.next(currentPlayer, true)
                return;
            }
        }

        for (int j = 0; j < columns; j++) {
            Symbol[] column = new Symbol[rows];
            for (int i = 0; i < rows; i++) {
                column[i] = board[i][j];
            }
            if (column[0] != Symbol.EMPTY && 
                isWinningLine(column)) {
                context.next(currentPlayer, true);
                return;
            }
        }

        Symbol[] diagonal1 = new Symbol[rows,columns];
        Symbol[] diagonal2 = new Symbol[rows,columns];

        for (int i = 0; i < rows; i++) {
            diagonal1[i] = board[i][i];
            diagonal2[i] = board[i][columns - 1 - i];
        }

        if (diagonal1[0] != Symbol.EMPTY && 
            isWinningLine(diagonal1)) {
            context.next(currentPlayer, true);
            return;
        }

        if (diagonal2[0] != Symbol.EMPTY && 
            isWinningLine(diagonal2)) {
            context.next(currentPlayer, true);
            return;
        }
        
    }

    private boolean isWinningLine(Symbol[] line) {
        Symbol first = line[0];
        for (Symbol symbol : line) {
            if (symbol != first) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Symbol symbol = board[i][j];

                switch (symbol) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print("O ");
                        break;
                    case EMPTY:
                    default:
                        System.out.print(" - ");
                        break;
                }

                if (j < columns - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < rows - 1) {
                System.out.println("---".repeat(columns - 1));
            }
        }
        System.out.println();
    }
}
