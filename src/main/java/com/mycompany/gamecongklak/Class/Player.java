/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamecongklak.Class;

/**
 *
 * @author user
 */
public abstract class Player implements HoleInterface {
    private String name;
    private int[] holes;
    private int house;
    private boolean turn;
    
    public Player(String name, int[] holes, int house, boolean turn) {
        this.name = name;
        this.holes = holes;
        this.house = house;
        this.turn = turn;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getHole(int i){
        return getHoles()[i];
    }
    
    public void setHole(int i, int hole){
        this.holes[i] = hole;
    }
    
    public int[] getHoles() {
        return holes;
    }

    public void setHoles(int[] holes) {
        this.holes = holes;
    }

    public int getHouse() {
        return house;
    }

    public void addHouse(int house) {
        this.house += house;
    }
    
    
}
