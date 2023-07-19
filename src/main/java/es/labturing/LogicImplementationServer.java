package es.labturing;

import es.labturing.tictactoe.controllers.implementation.LogicImplementation;
import es.labturing.tictactoe.dispatchers.BoardCompleteDispatcher;
import es.labturing.tictactoe.dispatchers.ChangeTurnDispatcher;
import es.labturing.tictactoe.dispatchers.ContinueStateDispatcher;
import es.labturing.tictactoe.dispatchers.CoordinateValidDispatcher;
import es.labturing.tictactoe.dispatchers.CreatePlayersDispatcher;
import es.labturing.tictactoe.dispatchers.DimensionDispatcher;
import es.labturing.tictactoe.dispatchers.DispatcherPrototype;
import es.labturing.tictactoe.dispatchers.EmptyTokenDispatcher;
import es.labturing.tictactoe.dispatchers.FrameType;
import es.labturing.tictactoe.dispatchers.MoveTokenDispatcher;
import es.labturing.tictactoe.dispatchers.PlayerTypeDispatcher;
import es.labturing.tictactoe.dispatchers.PutTokenDispatcher;
import es.labturing.tictactoe.dispatchers.RandomCoordinateDispatcher;
import es.labturing.tictactoe.dispatchers.ResumeDispatcher;
import es.labturing.tictactoe.dispatchers.StartDispatcher;
import es.labturing.tictactoe.dispatchers.StateDispatcher;
import es.labturing.tictactoe.dispatchers.TicTacToeDispatcher;
import es.labturing.tictactoe.dispatchers.TokenCharDispatcher;
import es.labturing.tictactoe.dispatchers.ValueTurnDispatcher;
import es.labturing.tictactoe.dispatchers.errors.ErrorsMoveOriginDispatcher;
import es.labturing.tictactoe.dispatchers.errors.ErrorsMoveTargetDispatcher;
import es.labturing.tictactoe.dispatchers.errors.ErrorsPutDispatcher;
import es.labturing.tictactoe.dispatchers.undoredo.RedoDispatcher;
import es.labturing.tictactoe.dispatchers.undoredo.RedoableDispatcher;
import es.labturing.tictactoe.dispatchers.undoredo.UndoDispatcher;
import es.labturing.tictactoe.dispatchers.undoredo.UndoableDispatcher;

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
