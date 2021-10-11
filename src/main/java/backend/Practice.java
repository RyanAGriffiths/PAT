/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

//contains practice's date, time and location
public class Practice
{

    private String date;
    private String time;
    private String location;

    public Practice(String date, String time, String location)
    {
        this.date = date;
        this.time = time;
        this.location = location;
    }

    public String getDate()
    {
        return date;
    }

    public int getDateInt()
    {
        char c = date.charAt(0);
        String s = Character.toString(c);
        return Integer.parseInt(s);
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String toString()
    {
        return date + "#" + time + "#" + location;
    }
}
