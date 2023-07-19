package es.labturing.tictactoe.controllers.implementation;

import es.labturing.tictactoe.controllers.core.Controller;
import es.labturing.tictactoe.models.Session;
import es.labturing.tictactoe.models.SessionImplementation;

public class UndoController extends Controller {

	private SessionImplementation sessionImplementation;

    public UndoController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void undo() {
		this.sessionImplementation.undo();
	}

	public boolean undoable() {
		return this.sessionImplementation.undoable();
	}
    
}