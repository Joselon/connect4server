package es.labturing.tictactoe.controllers.implementation;

import es.labturing.tictactoe.controllers.core.ResumeController;
import es.labturing.tictactoe.models.Session;
import es.labturing.tictactoe.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

	private SessionImplementation sessionImplementation;

	public ResumeControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void resume(boolean newGame) {
		if (newGame) {
			this.sessionImplementation.newGame();
		} else {
			this.sessionImplementation.next();
		}
	}

}
