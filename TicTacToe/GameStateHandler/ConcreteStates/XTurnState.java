package TicTacToe.GameStateHandler.ConcreteStates;

import CommonEnum.Symbol;
import GameStateHandler.Context.GameContext;
import GameStateHandler.GameState;
import Utility.Player;
public class XTurnState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        if (hasWon) {
            context.setState(player.getSymbol() == Symbol.X ? new XWonState() : new OWonState());
        } else {
            context.setState(new OTurnState());
        }
    }

    @Override
    public boolean isGameOver() {
        return false; // Game is not over during X's turn
    }
}
