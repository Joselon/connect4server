package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.PlayController;

public class ContinueStateDispatcher extends Dispatcher {

    public ContinueStateDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		((PlayController)this.acceptorController).continueState();
	}
    
}