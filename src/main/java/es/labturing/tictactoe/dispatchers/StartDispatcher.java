package es.labturing.tictactoe.dispatchers;

import es.labturing.tictactoe.controllers.core.StartController;

public class StartDispatcher extends Dispatcher {

	public StartDispatcher(StartController startController) {
		super(startController);
	}

	@Override
	public void dispatch() {
		((StartController) this.acceptorController).start();
	}

}
