package es.labturing.tictactoe.dispatchers.undoredo;

import es.labturing.tictactoe.controllers.core.PlayController;
import es.labturing.tictactoe.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {

	public RedoDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		((PlayController)this.acceptorController).redo();
	}

}
