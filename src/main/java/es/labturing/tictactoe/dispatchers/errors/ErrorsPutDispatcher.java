package es.labturing.tictactoe.dispatchers.errors;

import es.labturing.tictactoe.controllers.core.PlayController;
import es.labturing.tictactoe.dispatchers.Dispatcher;
import es.labturing.tictactoe.models.Coordinate;

public class ErrorsPutDispatcher extends Dispatcher {

	public ErrorsPutDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		int row = this.tcpip.receiveInt();
		int column = this.tcpip.receiveInt();
		this.tcpip.send(
				((PlayController) this.acceptorController).getPutCoordinateError(new Coordinate(row, column)));
	}
}