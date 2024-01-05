/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamecongklak.Class;

import static java.lang.Math.abs;
import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class Congklak {
    private LocalDateTime startTime;
    private PlayerOne player1;
    private PlayerTwo player2;
    private String player_turn;

    public Congklak(PlayerOne player1, PlayerTwo player2, String player_turn) {
        this.player1 = player1;
        this.player2 = player2;
        this.player_turn = player_turn;
        this.startTime = LocalDateTime.now();
    }

    public void moveBeans(int pickedHoles, String playerName){
        Player player;
        Player opponent;
        if (playerName == player1.getName()){
            player = player1;
            opponent = player2;
        }else if (playerName == player2.getName()){
            player = player2;
            opponent = player1;
        }else{
            return;
        }
        int beans = player.getHole(pickedHoles);
        player.setHole(pickedHoles, 0);
        int i = pickedHoles + 1;
        while (true){
            System.out.println(i);
            if (i == 15){
                i = 0;
            }
            if (i < 7){
                player.addBean(i);
                System.out.println(player.getHole(i)+" "+opponent.getHole(i));
            }else if (i == 7){
                player.addHouse(1);
            }else{
                opponent.addBean(i - 8);
                System.out.println(player.getHole(i-8)+" "+opponent.getHole(i-8));
            }
            beans--;
            if (beans == 0){
                break;
            }
            i++;
        }
        
        if (i < 7 && player.getHole(i) == 1 && opponent.getHole(abs(i - 6)) != 0){
            int fill = 0;
            fill += player.getHole(i);
            player.setHole(i, 0);
            fill += opponent.getHole(abs(i - 6));
            opponent.setHole(abs(i - 6), 0);
            player.addHouse(fill);
        }
        if (i != 7){
            player_turn = opponent.getName();
            player.setTurn(false);
            opponent.setTurn(true);
        }
    }
    
    public boolean checkEmptyPlayer1(){
        int[] player1holes = player1.getHoles();
        for (int i = 0; i < player1holes.length; i++){
            if (player1holes[i] != 0){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkEmptyPlayer2(){
        int[] player2holes = player2.getHoles();
        for (int i = 0; i < player2holes.length; i++){
            if (player2holes[i] != 0){
                return false;
            }
        }
        return true;
    }
    
    public void checkEmpty(){
        boolean emptyPlayer1 = checkEmptyPlayer1();
        boolean emptyPlayer2 = checkEmptyPlayer2();
        if (emptyPlayer1 || emptyPlayer2){
            int beans = 0;
            if (emptyPlayer1){
                for (int i = 0; i < player1.getHoles().length; i++){
                    beans += player1.getHole(i);
                    player1.setHole(i, 0);
                }
                player1.addHouse(beans);
            }else if (emptyPlayer2){
                for (int i = 0;i < player2.getHoles().length; i++){
                    beans += player2.getHole(i);
                    player2.setHole(i, 0);
                }
                player2.addHouse(beans);
            }
        }
    }
    
    public boolean checkEnd(){
        return (player1.getHouse() >= (7*7) || player2.getHouse() >= (7*7));
    }
    
    public GameResult GenerateResult(){
        if (player1.getHouse() > player2.getHouse()){
            return new GameResult(startTime,LocalDateTime.now(),player1.getName(),player2.getName(),player1.getHouse(),player2.getHouse());
        }else if (player2.getHouse() < player2.getHouse()){
            return new GameResult(startTime,LocalDateTime.now(),player2.getName(),player1.getName(),player2.getHouse(),player1.getHouse());
        }else
            return null;
    }
    
    public String getPlayer_turn() {
        return player_turn;
    }

    public void setPlayer_turn(String player_turn) {
        this.player_turn = player_turn;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(PlayerOne player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(PlayerTwo player2) {
        this.player2 = player2;
    }
    
    
}
