package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.PlayController;

public class ChangeTurnDispatcher extends Dispatcher {

    public ChangeTurnDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		((PlayController)this.acceptorController).changeTurn();
	}
    
}