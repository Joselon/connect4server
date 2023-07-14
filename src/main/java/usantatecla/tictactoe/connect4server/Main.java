package usantatecla.tictactoe.connect4server;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import usantatecla.tictactoe.dispatchers.DispatcherPrototype;

@Component
public class Main implements ApplicationRunner {

	private DispatcherPrototype dispatcherPrototype;

	private LogicImplementationServer logic;

	private Main() {
		this.dispatcherPrototype = new DispatcherPrototype();
		this.logic = new LogicImplementationServer();
		this.logic.createDispatchers(this.dispatcherPrototype);
	}

	private void serve() {
		this.dispatcherPrototype.serve();
	}

	public void run(ApplicationArguments args) throws Exception {
		new Main().serve();
	}

}
