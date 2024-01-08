/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamecongklak.Class;

/**
 *
 * @author user
 */
public class PlayerTwo extends Player{
    
    public PlayerTwo(String name, int[] holes, int house, boolean turn) {
        super(name, holes, house, turn);
    }

    @Override
    public int takeBean(int i, int bean) {
        setHole(i,getHole(i)-bean);
        return bean;
    }
    
    @Override
    public void addBean(int i) {
        setHole(i,getHole(i)+1);
    }
}
