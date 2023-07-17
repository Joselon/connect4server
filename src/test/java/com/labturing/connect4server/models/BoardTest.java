package com.labturing.connect4server.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.labturing.connect4server.types.Color;

public class BoardTest {
    
    private BoardBuilder boardBuilder;

    @BeforeEach
    public void setup(){
        this.boardBuilder = new BoardBuilder();
    }

    @Test
    public void givenBoardWhenWinnerInVerticalThenIsWinnerReturnsTrue(){
        Board board = this.boardBuilder.rows(
            "       ",
            "       ",
            "R      ",
            "R      ",
            "R      ",
            "R      "
        )
        .lastDrop(new Coordinate(2, 0))
        .build();
        board.show();
        assertTrue(board.isWinner());
    }  

    @Test
    public void givenBoardWhenWinnerInHorizontalThenIsWinnerReturnsTrue(){
        Board board = this.boardBuilder.rows(
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "RRRR   "
        )
        .lastDrop(new Coordinate(5, 0))
        .build();
        board.show();
        assertTrue(board.isWinner());
    } 

    @Test
    public void givenBoardWhenWinnerInMainDiagonalThenIsWinnerReturnsTrue(){
        Board board = this.boardBuilder.rows(
            "       ",
            "       ",
            "   R   ",
            "  R    ",
            " R     ",
            "R      "
        )
        .lastDrop(new Coordinate(5, 0))
        .build();
        board.show();
        assertTrue(board.isWinner());
    } 

    @Test
    public void givenIncompleteBoardWhenInMainDiagonalThenReturnsFalse(){
        Board board = this.boardBuilder.rows(
            "       ",
            "       ",
            "       ",
            "R      ",
            "R      ",
            "R      "
        )
        .lastDrop(new Coordinate(3, 0))
        .build();
        System.out.println("LASTDROP: " + board.getLastDrop().getRow() + ", " + board.getLastDrop().getColumn());
        System.out.println("ISWINNER: " + board.isWinner());
        board.show();
        assertFalse(board.isWinner());
    } 

    @Test
    public void givenCompleteColumnWhenCheckIfIsCompleteColumnThenGetFalse(){
        Board board = this.boardBuilder.rows(
            "R      ",
            "R      ",
            "R      ",
            "R      ",
            "R      ",
            "R      "
        )
        .build();
        assertTrue(board.isCompleteColumn(0));
    }

    @Test
    public void givenColumnWithOneDropWhenDropTokenOnItThenChangeBoardWithNewToken(){ //QUE HACER SI NO SE PUEDE DROPEAR?¿
        Board board = this.boardBuilder.rows(
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "R      "
        )
        .build();
        BoardBuilder expectBuilder = new BoardBuilder();
        Board expectedBoard = expectBuilder.rows(
            "       ",
            "       ",
            "       ",
            "       ",
            "R      ",
            "R      "
        )
        .build();
        board.dropTokenXavi(0, Color.RED);
        board.show();
        System.out.println("-----------------");
        System.out.println("-----------------");
        expectedBoard.show();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                assertEquals(expectedBoard.colors[i][j], board.colors[i][j]);

            }
        }
        //assertEquals(expectedBoard.colors, board.colors);

    }
}
