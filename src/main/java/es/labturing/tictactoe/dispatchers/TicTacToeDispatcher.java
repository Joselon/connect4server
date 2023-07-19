package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.PlayController;

public class TicTacToeDispatcher extends Dispatcher {

    public TicTacToeDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).isTicTacToe());
	}
    
}