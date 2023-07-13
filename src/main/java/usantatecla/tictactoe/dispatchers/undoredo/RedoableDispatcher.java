package usantatecla.tictactoe.dispatchers.undoredo;

import usantatecla.tictactoe.controllers.core.PlayController;
import usantatecla.tictactoe.dispatchers.Dispatcher;

public class RedoableDispatcher extends Dispatcher {

	public RedoableDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).redoable());
	}

}
