package usantatecla.tictactoe.connect4server;

import usantatecla.tictactoe.controllers.implementation.LogicImplementation;
import usantatecla.tictactoe.dispatchers.BoardCompleteDispatcher;
import usantatecla.tictactoe.dispatchers.ChangeTurnDispatcher;
import usantatecla.tictactoe.dispatchers.ContinueStateDispatcher;
import usantatecla.tictactoe.dispatchers.CoordinateValidDispatcher;
import usantatecla.tictactoe.dispatchers.CreatePlayersDispatcher;
import usantatecla.tictactoe.dispatchers.DimensionDispatcher;
import usantatecla.tictactoe.dispatchers.DispatcherPrototype;
import usantatecla.tictactoe.dispatchers.EmptyTokenDispatcher;
import usantatecla.tictactoe.dispatchers.FrameType;
import usantatecla.tictactoe.dispatchers.MoveTokenDispatcher;
import usantatecla.tictactoe.dispatchers.PlayerTypeDispatcher;
import usantatecla.tictactoe.dispatchers.PutTokenDispatcher;
import usantatecla.tictactoe.dispatchers.RandomCoordinateDispatcher;
import usantatecla.tictactoe.dispatchers.ResumeDispatcher;
import usantatecla.tictactoe.dispatchers.StartDispatcher;
import usantatecla.tictactoe.dispatchers.StateDispatcher;
import usantatecla.tictactoe.dispatchers.TicTacToeDispatcher;
import usantatecla.tictactoe.dispatchers.TokenCharDispatcher;
import usantatecla.tictactoe.dispatchers.ValueTurnDispatcher;
import usantatecla.tictactoe.dispatchers.errors.ErrorsMoveOriginDispatcher;
import usantatecla.tictactoe.dispatchers.errors.ErrorsMoveTargetDispatcher;
import usantatecla.tictactoe.dispatchers.errors.ErrorsPutDispatcher;
import usantatecla.tictactoe.dispatchers.undoredo.RedoDispatcher;
import usantatecla.tictactoe.dispatchers.undoredo.RedoableDispatcher;
import usantatecla.tictactoe.dispatchers.undoredo.UndoDispatcher;
import usantatecla.tictactoe.dispatchers.undoredo.UndoableDispatcher;

public class LogicImplementationServer extends LogicImplementation {

	public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
		dispatcherPrototype.add(FrameType.CREATE_PLAYERS, new CreatePlayersDispatcher(this.startControllerImplementation));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.PLAYER_TYPE, new PlayerTypeDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.COORDINATE_VALID, new CoordinateValidDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.BOARD_COMPLETE, new BoardCompleteDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.CHANGE_TURN, new ChangeTurnDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.TOKEN_CHAR, new TokenCharDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.EMPTY_TOKEN, new EmptyTokenDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.DIMENSION, new DimensionDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.TICTACTOE, new TicTacToeDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.RANDOM_COORDINATE, new RandomCoordinateDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.ERRORS_PUT, new ErrorsPutDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.ERRORS_MOVE_ORIGIN, new ErrorsMoveOriginDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.ERRORS_MOVE_TARGET, new ErrorsMoveTargetDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.PUT_TOKEN, new PutTokenDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.MOVE_TOKEN, new MoveTokenDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.VALUE_TURN, new ValueTurnDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.CONTINUE_STATE, new ContinueStateDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
	}

}
