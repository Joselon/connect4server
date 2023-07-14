package com.labturing.connect4server.models;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void givenIncompleteBoardWhenInMainDiagonalThenIsWinnerReturnsFalse(){
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
}
