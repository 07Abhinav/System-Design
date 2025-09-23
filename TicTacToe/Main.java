package TicTacToe;


import Controller.GameController.TicTacToeGame;
import PlayerStrategies.ConcreteStrategies.HumanPlayerOStrategy;
import PlayerStrategies.PlayerStrategy;
public class Main {
    publlic static void main(String[] args) {
        // Initialize the game context and start the game
        Player playerxStrategy = new PlayerXStrategy("Player X");
        Player playeroStrategy = new PlayerOStrategy("Player O");
        TicTacToeContext context = new TicTacToeContext(playerxStrategy, playeroStrategy,3,3);
        game.play();
    }
}
