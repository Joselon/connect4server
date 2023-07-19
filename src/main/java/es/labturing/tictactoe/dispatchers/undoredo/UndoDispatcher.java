package es.labturing.tictactoe.dispatchers.undoredo;

import es.labturing.tictactoe.controllers.core.PlayController;
import es.labturing.tictactoe.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {

	public UndoDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		((PlayController)this.acceptorController).undo();
	}

}
