/*
 * Program: Player_Manager Class for ProDraftList Program
 * File: Player_Manager.java
 * Summary: Loads all NFL player information for ProDraftList Program
 * Author: Vincent Christaldi
 * Date: 12/22/2017
*/
package playermanager;


import java.util.Arrays;
import java.util.ArrayList;

public class PlayerManager 
{ 
    
    
    public static void main(String[] args)
    {
        
        //create array list of player objects
        ArrayList<NFL_Player> Players = new ArrayList<>();
        //call create players method
        createPlayers(Players);
        
        //quick test to show that all things are working
        for(int index = 0; index < Players.size();++index)
        {
            String name = (Players.get(index).getName());
            int age = (Players.get(index).getAge());
            String position = (Players.get(index).getPosition());
            System.out.println(name);
            System.out.println("Age: " +age + "\tPosition: " + position);
        }
    }
    public static ArrayList createPlayers(ArrayList Players)
    {
        //**************Create player objects****************
        //offensive players
        Offensive_Player Bell = new Offensive_Player("Le'Veon Bell","Running Back","6'1",25,225,2013,283,-1,1105,3.9,-1,-1,7);
        Offensive_Player Darkwa = new Offensive_Player("Orleans Darkwa","Running Back","5'11",25,219,2014,236,-1,580,4.3,-1,-1,3);
        Offensive_Player Brady = new Offensive_Player("Tom Brady","Quarterback","6'4",40,225,2000,-1,-1,3865,-1,6,105.2,27);
        Offensive_Player Brown = new Offensive_Player("Antonio Brown","Wide Receiver","5'10",29,181,2010,-1,99,1105,15.2,-1,-1,9);
        Offensive_Player Hunt = new Offensive_Player("Kareem Hunt","Running Back","5'10",22,216,2017,218,-1,1046,4.8,-1,-1,5);
        //defensive players
        Defensive_Player Schobert = new Defensive_Player("Joe Schobert","Middle Linebacker","6'1",24,245,2016,122,3,2.5,1);
        Defensive_Player Jones = new Defensive_Player("Chandler Jones","Outside Linebacker","6'5",27,265,2012,49,2,14.0,0);
        Defensive_Player Collins = new Defensive_Player("Landon Collins","Strong Safety","6.0",23,218,2015,102,1,0.0,2);
        Defensive_Player Slay = new Defensive_Player("Darius Slay","Corner Back","6'0",26,190,2013,47,0,0.0,5);
        Defensive_Player Gipson = new Defensive_Player("Tashaun Gipson","Full Safety","5'11",27,212,2012,51,0,0.0,4);
        
        //add players to list
        Players.add(Bell);
        Players.add(Darkwa);
        Players.add(Brady);
        Players.add(Brown);
        Players.add(Hunt);
        Players.add(Schobert);
        Players.add(Jones);
        Players.add(Collins);
        Players.add(Slay);
        Players.add(Gipson);
        
        return Players;
    }
}