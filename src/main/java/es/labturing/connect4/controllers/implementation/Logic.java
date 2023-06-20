package es.labturing.connect4.controllers.implementation;


public class Logic extends es.labturing.connect4.controllers.core.Logic{
    
    protected StartController startController;

	protected PlayController playController;

	protected ResumeController resumeController;

	public Logic() {
		this.session = new Session();
		this.startController = new StartController(this.session);
		this.playController = new PlayController(this.session);
		this.resumeController = new ResumeController(this.session);
		this.acceptorControllers.put(StateValue.INITIAL, this.startController);
		this.acceptorControllers.put(StateValue.IN_GAME, this.playController);
		this.acceptorControllers.put(StateValue.RESUME, this.resumeController);
		this.acceptorControllers.put(StateValue.EXIT, null);
	}
}
