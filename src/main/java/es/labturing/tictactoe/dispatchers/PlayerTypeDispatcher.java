package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.PlayController;

public class PlayerTypeDispatcher extends Dispatcher {

    public PlayerTypeDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).getTypeOfTokenPlayerFromTurn());
	}
    
}