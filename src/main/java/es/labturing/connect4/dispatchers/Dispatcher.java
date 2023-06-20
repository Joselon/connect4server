package es.labturing.connect4.dispatchers;

import es.labturing.connect4.controllers.core.AcceptorController;

public abstract class Dispatcher {

    protected AcceptorController acceptorController;
	
	//protected TCPIP tcpip;
	
	public Dispatcher (AcceptorController acceptorController) {
		this.acceptorController = acceptorController;
	}

	public abstract void dispatch();
	
	/*public void associate(TCPIP tcpip) {
		this.tcpip = tcpip;
	}*/
    
}
