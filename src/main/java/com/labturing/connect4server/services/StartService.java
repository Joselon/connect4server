package com.labturing.connect4server.services;

import org.springframework.stereotype.Service;

import com.labturing.connect4server.models.Board;
import com.labturing.connect4server.types.Color;

// import main.es.labturing.connect4.daos.SessionDAO;
// import main.es.labturing.connect4.models.Session;
// import main.es.labturing.connect4.types.PlayerType;
// import main.es.labturing.connect4.types.StageValue;


//public class StartService extends Controller implements AcceptorController {
@Service    
public class StartService {

    ///////for test controllers only////////
    /////////////////
    private Board board;
    public StartService(){
        this.board = new Board();
    }

    public Color[][] getBoard(){
        return this.board.getColors();
    }
    /////////////////
    /////////////////

    //private SessionDAO sessionDAO;

    // public StartService(Session session, SessionDAO sessionDAO) {
    //     super(session);
    //     this.sessionDAO = sessionDAO; 
    // }

    // public void start(){
    //     this.sessionDAO.associate(this.session);
    // }

    // public void resetGameRegistry() {
    //     this.session.resetRegistry();
    // }

    // public void addPlayer(PlayerType playerType) {
    //     this.session.addPlayer(playerType);
    // }

    // public void resetPlayers() {
    //     this.session.resetPlayers();
    // }

    // public void resetPlayersIndex() {
    //     this.session.resetPlayersIndex();
    // }

    // public int getNumberPlayers() {
    //     return this.session.getNumberPlayers();
    // }

    // public String[] getGamesNames(){
    //     return this.sessionDAO.getGamesNames();
    // }

    // public void load(String name) {
    //     this.sessionDAO.associate(this.session);
    //     this.sessionDAO.load(name);
    //     this.session.resetRegistry();
    //     this.session.setStageValue(StageValue.INITIAL);
    // }

    // public void accept(ControllersVisitor controllersVisitor) {
    //     controllersVisitor.visit(this);
    // }
}
