package es.labturing.tictactoe.controllers.implementation;

import es.labturing.tictactoe.controllers.core.Controller;
import es.labturing.tictactoe.models.Coordinate;
import es.labturing.tictactoe.models.Session;
import es.labturing.tictactoe.models.SessionImplementation;
import es.labturing.tictactoe.types.Error;
import es.labturing.tictactoe.types.PlayerType;

public class MovementController extends Controller {

	private SessionImplementation sessionImplementation;
    
    public MovementController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public PlayerType getTypeOfTokenPlayerFromTurn() {
		return this.sessionImplementation.getTypeOfTokenPlayerFromTurn();
	}

	public Error getPutCoordinateError(Coordinate coordinate) {
		return this.sessionImplementation.getPutCoordinateError(coordinate);
	}

	public Error getMoveOriginCoordinateError(Coordinate coordinate) {
		return this.sessionImplementation.getMoveOriginCoordinateError(coordinate);
	}

	public Error getMoveTargetCoordinateError(Coordinate originCoordinate, Coordinate targetCoordinate) {
		return this.sessionImplementation.getMoveTargetCoordinateError(originCoordinate, targetCoordinate);
	}

	public boolean isCoordinateValid(Coordinate coordinate) {
		return coordinate.isValid();
	}

	public Coordinate generateRandomCoordinate() {
		Coordinate coordinateRandom = new Coordinate();
		coordinateRandom.random();
		return coordinateRandom;
	}

	public boolean isBoardComplete() {
		return this.sessionImplementation.isBoardComplete();
	}

	public void putTokenPlayerFromTurn(Coordinate coordinate) {
		this.sessionImplementation.putTokenPlayerFromTurn(coordinate);
	}

	public void moveTokenPlayerFromTurn(Coordinate[] coordinates) {
		this.sessionImplementation.moveTokenPlayerFromTurn(coordinates);
	}

	public void changeTurn() {
		this.sessionImplementation.changeTurn();
	}

	public char getTokenChar(Coordinate coordinate) {
		return this.sessionImplementation.getToken(coordinate).getChar();
	}

	public boolean isEmptyToken(Coordinate coordinate) {
		return this.sessionImplementation.getToken(coordinate) == null;
	}

	public int getCoordinateDimension() {
		return Coordinate.DIMENSION;
	}

	public int getValueFromTurn() {
		return this.sessionImplementation.getValueFromTurn();
	}

	public void continueState() {
		this.sessionImplementation.next();
	}

	public boolean isTicTacToe() {
		return this.sessionImplementation.isTicTacToe();
	}
}