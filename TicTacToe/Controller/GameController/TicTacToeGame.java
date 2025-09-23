package TicTacToe.Controller.GameController;

import Controller.BoardGames;
import GameStateHandler.ConcreteStates.OWonState;
import GameStateHandler.ConcreteStates.XWonState;
import GameStateHandler.Context.GameContext;
import GameStateHandler.GameState;
import PlayerStrategies.PlayerStrategy;
import CommonEnum.Symbol;
import Utility.Board;
import Utility.Player;
import Utility.Position;

public class TicTacToeGame {
    private TicTacToe.Utility.Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;
    private GameContext gameContext;

    public TicTacToeGame(PlayerStrategy xStrategy, PlayerStrategy oStrategy, int rows, int columns) {
        board = new Board(rows, columns);
        playerX = new Player(Symbol.X, xStrategy);
        playerO = new Player(Symbol.O, oStrategy);
        currentPlayer = playerX; // Start with Player X
        gameContext = new GameContext();
    }

    @Override
    public void play() {
        // Game loop and logic will be implemented here
        do {
            board.printBoard();

            Position move = currentPlayer.getPlayerStrategy().getMove(board);
            board.makeMove(move, currentPlayer.getSymbol());

            board.checkGameState(gameContext, currentPlayer);
        }
        while (!gameContext.isGameOver());
        announceResult();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    private void announceResult() {
        GameState state = gameContext.getCurrentState();
        board.printBoard();
        if (state instanceof XWonState) {
            System.out.println("Player X wins!");
        } else if (state instanceof OWonState) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
