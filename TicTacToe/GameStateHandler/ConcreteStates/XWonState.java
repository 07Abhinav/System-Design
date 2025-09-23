package TicTacToe.GameStateHandler.ConcreteStates;

import GameStateHandler.Context.GameContext;
import GameStateHandler.GameState;
import Utility.Player;
public class XWonState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
    
    }
    @Override
    public boolean isGameOver() {
        return true; // X has won, so the game is over
    }
}