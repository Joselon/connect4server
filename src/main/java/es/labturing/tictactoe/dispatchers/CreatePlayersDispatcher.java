package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.StartController;

public class CreatePlayersDispatcher extends Dispatcher {

    public CreatePlayersDispatcher(StartController startController) {
		super(startController);
	}

	@Override
	public void dispatch() {
        int numberOfUsers = this.tcpip.receiveInt();
		((StartController)this.acceptorController).createPlayers(numberOfUsers);
	}
    
}