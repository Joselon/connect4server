package es.labturing;

import es.labturing.tictactoe.dispatchers.DispatcherPrototype;

public class App 
{

    private DispatcherPrototype dispatcherPrototype;

	private LogicImplementationServer logic;

	private App() {
		this.dispatcherPrototype = new DispatcherPrototype();
		this.logic = new LogicImplementationServer();
		this.logic.createDispatchers(this.dispatcherPrototype);
	}

	private void serve() {
		this.dispatcherPrototype.serve();
	}
    public static void main( String[] args )
    {
        new App().serve();
    }
}
