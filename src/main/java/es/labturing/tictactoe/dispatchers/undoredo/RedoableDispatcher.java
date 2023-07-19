package es.labturing.tictactoe.dispatchers.undoredo;

import es.labturing.tictactoe.controllers.core.PlayController;
import es.labturing.tictactoe.dispatchers.Dispatcher;

public class RedoableDispatcher extends Dispatcher {

	public RedoableDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).redoable());
	}

}
