package es.labturing.tictactoe.controllers.implementation;

import es.labturing.tictactoe.controllers.core.StartController;
import es.labturing.tictactoe.models.Session;
import es.labturing.tictactoe.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

	SessionImplementation sessionImplementation;

	public StartControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void createPlayers(int numberOfUsers) {
		this.sessionImplementation.createPlayers(numberOfUsers);
	}

	@Override
	public void start() {
		this.sessionImplementation.next();		
	}

}
