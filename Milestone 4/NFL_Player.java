/*
 * Program: Pro Draft List Program
 * File: NFL_Player.java
 * Summary: Player class for main program ProDraftList
 * Author: Vincent Christaldi
 * Date: 12/22/2017
*/

package playermanager;

abstract public class NFL_Player 
{
    //Player Main information variables
    private String plyr_Name;
    private String plyr_Position;
    private String plyr_Height;
    private int plyr_Age;
    private int plyr_Weight;
    private int seasons_Played;
    private int start_Year;
    
    

    //constructor for variables(in order from above)  
    public NFL_Player(String name, String position, String height, int age, int weight, int year)
    {
        this.setName(name);
        this.setPosition(position);
        this.setHeight(height);
        this.setAge(age);
        this.setWeight(weight);
        this.setSeasons(year);
        
    }
    //default empty constructor
    public NFL_Player(){}
    
    //setter methods
    public void setName(String name)
    {
        plyr_Name = name;
    }
    public void setPosition(String position)
    {
        plyr_Position = position;
    }
    public void setHeight(String height)
    {
        plyr_Height = height;
    }
    public void setAge(int age)
    {
        plyr_Age = age;
    }
    public void setWeight(int weight)
    {
        plyr_Weight = weight;
    }
  
    public void setSeasons(int year)
    {
        //use 2018 - starting year to get seasons played
        seasons_Played = 2018-year;
    }
    
    //getter methods
    public String getName()
    {
        return plyr_Name;
    }
    public String getPosition()
    {
        return plyr_Position;
    }
    public String getHeight()
    {
        return plyr_Height;
    }
    public int getAge()
    {
        return plyr_Age;
    }
    public int getWeight()
    {
        return plyr_Weight;
    }
   
    public int getSeasons()
    {
        return seasons_Played;
    }
    
    
}
