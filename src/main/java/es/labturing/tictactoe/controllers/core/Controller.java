package es.labturing.tictactoe.controllers.core;

import es.labturing.tictactoe.models.Session;
import es.labturing.tictactoe.types.StateValue;

public abstract class Controller {
    
	protected Session session;

	protected Controller(Session session) {
		this.session = session;
	}

	public StateValue getValueState() {
		return this.session.getValueState();
	}
}