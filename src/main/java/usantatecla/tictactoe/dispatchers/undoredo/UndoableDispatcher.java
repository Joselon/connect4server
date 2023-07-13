package usantatecla.tictactoe.dispatchers.undoredo;

import usantatecla.tictactoe.controllers.core.PlayController;
import usantatecla.tictactoe.dispatchers.Dispatcher;

public class UndoableDispatcher extends Dispatcher {

	public UndoableDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).undoable());
	}

}
