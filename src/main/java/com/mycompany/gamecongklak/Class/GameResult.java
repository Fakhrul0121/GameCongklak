/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamecongklak.Class;

import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class GameResult {
    private LocalDateTime StartTime;
    private LocalDateTime EndTime;
    private String WinnerName;
    private String LoserName;
    private int WinnerScore;
    private int LoserScore;

    public GameResult(LocalDateTime StartTime, LocalDateTime EndTime, String WinnerName, String LoserName, int WinnerScore, int LoserScore) {
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.WinnerName = WinnerName;
        this.LoserName = LoserName;
        this.WinnerScore = WinnerScore;
        this.LoserScore = LoserScore;
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
    
    
    
    public String getWinnerName() {
        return WinnerName;
    }

    public void setWinnerName(String WinnerName) {
        this.WinnerName = WinnerName;
    }

    public String getLoserName() {
        return LoserName;
    }

    public void setLoserName(String LoserName) {
        this.LoserName = LoserName;
    }

    public int getWinnerScore() {
        return WinnerScore;
    }

    public void setWinnerScore(int WinnerScore) {
        this.WinnerScore = WinnerScore;
    }

    public int getLoserScore() {
        return LoserScore;
    }

    public void setLoserScore(int LoserScore) {
        this.LoserScore = LoserScore;
    }
    
    
}
