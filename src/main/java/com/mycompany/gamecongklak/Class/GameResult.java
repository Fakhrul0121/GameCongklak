/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamecongklak.Class;

import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class GameResult {
    private LocalDateTime StartTime;
    private LocalDateTime EndTime;
    private String player1Name;
    private String player2Name;
    private int player1Score;
    private int player2Score;
    private String winner;

    public GameResult(LocalDateTime StartTime, LocalDateTime EndTime, String player1Name, String player2Name, int player1Score, int player2Score, String winner) {
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.winner = winner;
    }

    
    
    
    
    public LocalDateTime getStartTime() {
        return StartTime;
    }

    public void setStartTime(LocalDateTime StartTime) {
        this.StartTime = StartTime;
    }

    public LocalDateTime getEndTime() {
        return EndTime;
    }

    public void setEndTime(LocalDateTime EndTime) {
        this.EndTime = EndTime;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
    
    public void uploadToDatabase() throws SQLException{
        Database d = new Database();
        d.query("INSERT INTO gameresult(Player1, Player2, Player1Score, Player2Score, Winner) VALUES ('"+this.player1Name+"','"+this.player2Name+"',"+String.valueOf(this.player1Score)+", "+String.valueOf(this.player2Score)+", '"+this.winner+"')");
    }
    
    
    
    
}
