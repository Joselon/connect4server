package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.PlayController;

public class ValueTurnDispatcher extends Dispatcher {

    public ValueTurnDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController) this.acceptorController).getValueFromTurn());
	}
    
}