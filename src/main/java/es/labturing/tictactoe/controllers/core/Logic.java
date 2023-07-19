package es.labturing.tictactoe.controllers.core;

import java.util.HashMap;
import java.util.Map;

import es.labturing.tictactoe.models.Session;
import es.labturing.tictactoe.types.StateValue;

public abstract class Logic {

	protected Session session;
	
	protected Map<StateValue, AcceptorController> acceptorControllers;

	protected Logic() {
		this.acceptorControllers = new HashMap<StateValue, AcceptorController>();
	}
	
	public AcceptorController getController() {
		return this.acceptorControllers.get(this.session.getValueState());
	}
    
}