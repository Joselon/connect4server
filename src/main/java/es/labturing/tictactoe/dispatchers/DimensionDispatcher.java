package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.PlayController;

public class DimensionDispatcher extends Dispatcher {
    
    public DimensionDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).getCoordinateDimension());
	}
}