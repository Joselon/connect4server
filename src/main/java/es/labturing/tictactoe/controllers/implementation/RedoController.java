package es.labturing.tictactoe.controllers.implementation;

import es.labturing.tictactoe.controllers.core.Controller;
import es.labturing.tictactoe.models.Session;
import es.labturing.tictactoe.models.SessionImplementation;

public class RedoController extends Controller {

	private SessionImplementation sessionImplementation;

    public RedoController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void redo() {
		this.sessionImplementation.redo();
	}

	public boolean redoable() {
		return this.sessionImplementation.redoable();
	}
    
}