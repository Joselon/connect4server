package es.labturing.tictactoe.dispatchers.errors;

import es.labturing.tictactoe.controllers.core.PlayController;
import es.labturing.tictactoe.dispatchers.Dispatcher;
import es.labturing.tictactoe.models.Coordinate;

public class ErrorsMoveOriginDispatcher extends Dispatcher {

	public ErrorsMoveOriginDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		int row = this.tcpip.receiveInt();
		int column = this.tcpip.receiveInt();
		this.tcpip.send(
				((PlayController) this.acceptorController).getMoveOriginCoordinateError(new Coordinate(row, column)));
	}
}