package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.PlayController;

public class StateDispatcher extends Dispatcher {

	public StateDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(this.acceptorController.getValueState().ordinal());
	}

}
