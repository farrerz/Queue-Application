/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.application;

/**
 *
 * @author farre_000
 */
public class Passanger {
    private int passangerID;
    private Station startStation;
    private Station destinationStation;
    
    public void Passanger(int ID, Station start, Station destination){
        passangerID = ID;
        startStation = start;
        destinationStation = destination;
    }
}
