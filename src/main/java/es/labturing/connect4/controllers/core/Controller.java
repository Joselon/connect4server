package es.labturing.connect4.controllers.core;

import es.labturing.connect4.models.Session;
import es.labturing.connect4.types.StageValue;

public abstract class Controller {

    protected Session session;

    Controller(Session session) {
        this.session = session;
    }

    public void nextStage() {
        this.session.nextStage();
    }

    public void setStageValue(StageValue stageValue) {
        this.session.setStageValue(stageValue);
    }

}
