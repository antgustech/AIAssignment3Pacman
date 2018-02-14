package pacman.controllers.Assignment3.Controller;

import pacman.controllers.Assignment3.NeuralNetwork.Handler;
import pacman.controllers.Controller;
import pacman.game.Constants;
import pacman.game.Game;

public class MLNeuralNetwork extends Controller<Constants.MOVE> {

    @Override
    public Constants.MOVE getMove(Game game, long timeDue) {
        Handler handler = new Handler();
        handler.startLearning();
        return null;
    }
}
