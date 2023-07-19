package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.PlayController;
import es.labturing.tictactoe.models.Coordinate;

public class EmptyTokenDispatcher extends Dispatcher {
    
    public EmptyTokenDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
        int row = this.tcpip.receiveInt();
        int column = this.tcpip.receiveInt();
		this.tcpip.send(((PlayController)this.acceptorController).isEmptyToken(new Coordinate(row, column)));
    }
}