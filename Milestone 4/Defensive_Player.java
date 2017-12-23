/*
 * Program: Pro Draft List Program
 * File: Defensive_Player.java
 * Summary: Extension of Player class for defensive players
 * Author: Vincent Christaldi
 * Date: 12/22/2017
*/

package playermanager;


public class Defensive_Player extends NFL_Player
{
    
    //Defensive player stats variables
    private int tackles;
    private int forced_fumbles;
    private double average_Yards;
    private int interceptions;
    
    //empty constructor
    public Defensive_Player(){}
    
    //full _ arg constructor
    public Defensive_Player(String name, String position, String height, int age, int weight, int year,int tacks, int f_Fumbs, double avg_Yards,int intcpts)
    {
        super(name,position,height,age,weight,year);
    }
    
    public void setTackles(int tacks)
    {
        this.tackles = tacks;
    }
    public void setAvg_Yards(double avg_Yards)
    {
        this.average_Yards = avg_Yards;
    }
    public void setForced_Fumbles(int f_Fumbs)
    {
        this.forced_fumbles = f_Fumbs;
    }
    public void setInterceptions(int intcpts)
    {
        this.interceptions = intcpts;
    }
    
    public int getTackles()
    {
        return tackles;
    }
    public double getAvg_Yards()
    {
        return average_Yards;
    }
    public int getForced_Fumbles()
    {
        return forced_fumbles;
    }
    public int getInterceptions()
    {
        return interceptions;
    }
}
