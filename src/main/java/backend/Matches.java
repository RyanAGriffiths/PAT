/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**

 @author Ryang
 */
public class Matches
{

    private String date;
    private String opponent;
    private char location;

    public Matches(String date, String opponent, char location)
    {
        this.date = date;
        this.opponent = opponent;
        this.location = location;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getOpponent()
    {
        return opponent;
    }

    public void setOpponent(String opponent)
    {
        this.opponent = opponent;
    }

    public char getLocation()
    {
        return location;
    }

    public void setLocation(char location)
    {
        this.location = location;
    }

    public String toString()
    {
        return opponent + "\t" + location + "\t" + date;
    }
    

}
