package es.labturing.tictactoe.controllers.core;

import es.labturing.tictactoe.models.Session;

public abstract class AcceptorController extends Controller {
    
    protected AcceptorController(Session session) {
		super(session);
	}

	public abstract void accept(ControllersVisitor controllersVisitor);
}