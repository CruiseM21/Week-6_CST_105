/*
 * Program: Pro Draft List Program
 * File: Offensive_Player.java
 * Summary: Extension of Player class for offensive players
 * Author: Vincent Christaldi
 * Date: 12/22/2017
*/
package playermanager;


public class Offensive_Player extends NFL_Player        
{
    //Offensive player stats variables
    private int total_Carries;
    private int receptions;
    private int total_Yards;
    private double average_Yards;    
    private int interceptions;
    private double runs_To_Goal;
    private int touchdowns;
    
    
    //full - arg constructor
    public Offensive_Player(String name, String position, String height, int age, int weight, int year, int tot_carries, int receps,int tot_Yards, double avg_Yards, int intcpts, double RTG, int TDS)    
    {
        super(name,position,height,age,weight,year);
        this.total_Carries = tot_carries;
        this.receptions = receps;
        this.total_Yards = tot_Yards;
        this.average_Yards = avg_Yards;
        this.interceptions = intcpts;
        this.runs_To_Goal = RTG;
        this.touchdowns = TDS;
       
    }
    //empty constructor
    public Offensive_Player(){}
    
    public void setCarries(int tot_carries)
    {
        this.total_Carries = tot_carries;
    }
    public void setReceptions(int receps)
    {
        this.receptions = receps;
    }
    public void setTotal_Yards(int tot_Yards)
    {
        this.total_Yards = tot_Yards;
    }
    public void setAvg_Yards(double avg_Yards)
    {
        this.average_Yards = avg_Yards;
    }
    public void setInterceptions(int intcpts)
    {
        this.interceptions = intcpts;
    }
    public void setRunsToGoal(double RTG)
    {
        this.runs_To_Goal = RTG;
    }
    public void setTouchdowns(int TDS)
    {
        this.touchdowns = TDS;
    }
    
    public int getCarries()
    {
        return total_Carries;
    }
    public int getReceptions()
    {
        return receptions;
    }
    public int getTotal_Yards()
    {
        return total_Yards;
    }
    public double getAvg_Yards()
    {
        return average_Yards;
    }
    public int getInterceptions()
    {
        return interceptions;        
    }
    public double getRunsToGoal()
    {
        return runs_To_Goal;
    }
    public int getTouchdowns()
    {
        return touchdowns;
    }

}

