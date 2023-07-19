package es.labturing.tictactoe.dispatchers.errors;

import es.labturing.tictactoe.controllers.core.PlayController;
import es.labturing.tictactoe.dispatchers.Dispatcher;
import es.labturing.tictactoe.models.Coordinate;

public class ErrorsMoveTargetDispatcher extends Dispatcher {

	public ErrorsMoveTargetDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		int originRow = this.tcpip.receiveInt();
		int originColumn = this.tcpip.receiveInt();
		int targetRow = this.tcpip.receiveInt();
		int targetColumn = this.tcpip.receiveInt();
		this.tcpip.send(((PlayController) this.acceptorController).getMoveTargetCoordinateError(
				new Coordinate(originRow, originColumn), new Coordinate(targetRow, targetColumn)));
	}
}