package es.labturing.connect4;

import es.labturing.connect4.dispatchers.DispatcherPrototype;
import es.labturing.connect4.dispatchers.FrameType;

public class Logic extends es.labturing.connect4.controllers.implementation.Logic {

public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startController));
		dispatcherPrototype.add(FrameType.CREATE_PLAYERS, new CreatePlayersDispatcher(this.startController));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.PLAYER_TYPE, new PlayerTypeDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.COORDINATE_VALID, new CoordinateValidDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.BOARD_COMPLETE, new BoardCompleteDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.CHANGE_TURN, new ChangeTurnDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.TOKEN_CHAR, new TokenCharDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.EMPTY_TOKEN, new EmptyTokenDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.DIMENSION, new DimensionDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.TICTACTOE, new TicTacToeDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.RANDOM_COORDINATE, new RandomCoordinateDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.ERRORS_PUT, new ErrorsPutDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.ERRORS_MOVE_ORIGIN, new ErrorsMoveOriginDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.ERRORS_MOVE_TARGET, new ErrorsMoveTargetDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.PUT_TOKEN, new PutTokenDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.MOVE_TOKEN, new MoveTokenDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.VALUE_TURN, new ValueTurnDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.CONTINUE_STATE, new ContinueStateDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeController));
	}
    
}
