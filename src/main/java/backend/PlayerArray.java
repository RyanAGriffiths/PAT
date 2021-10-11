package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayerArray
{
    //global variables
    private Player[] plArr = new Player[150];
    private int size = 0;

    public PlayerArray()
    {

        try
        {
            Scanner sc = new Scanner(new File("data\\playerData.txt"));
            while (sc.hasNext())
            {
                String line = sc.nextLine();
                Scanner lsc = new Scanner(line).useDelimiter("#");

                int age = lsc.nextInt();
                String name = lsc.next();
                String position = lsc.next();

                Player p = new Player(age, name, position);
                plArr[size] = p;
                size++;
                lsc.close();
            }
            sc.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("Player file not found");
        }
    }
    //searches for the player using the name
    public int binarySearch(String input)
    {
        int start = 0;
        int end = size - 1;
        Scanner sc = new Scanner(input);
        String name = sc.next();

        while (start <= end)
        {
            int middle = (start + end) / 2;
            if (plArr[middle].getName().equals(name))
            {
                return middle;

            } else if (name.compareTo(plArr[middle].getName()) > 0)
            {
                start = middle + 1;
            } else
            {
                end = middle - 1;
            }
        }
        return -1;
    }

    public void shiftLeft(int index)
    {
        for (int i = index; i < size; i++)
        {
            plArr[i] = plArr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index)
    {
        size++;
        for (int i = size - 1; i > index; i--)
        {
            plArr[i] = plArr[i - 1];
        }
    }
    //print elements of array to playerData.txt file
    public void printToFile()
    {

        try
        {

            PrintWriter pw = new PrintWriter(new FileWriter("data\\playerData.txt"));
            String output = "";
            for (int i = 0; i < size; i++)
            {
                output += plArr[i].getAge() + "#" + plArr[i].getName() + "#" + plArr[i].getPosition() + "\n";
            }
            pw.println(output);
            pw.close();
        } catch (IOException ex)
        {
            System.out.println("could not print to Player file");
        }
    }
    //sort the array alphabetically using the name.
    public void sortAlphabetically()
    {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--)
        {
            for (int i = 0; i < currentIndex; i++)
            {
                if (plArr[i].getName().compareTo(plArr[i + 1].getName()) > 0)
                {

                    Player temp = plArr[i + 1];
                    plArr[i + 1] = plArr[i];
                    plArr[i] = temp;
                }
            }
        }
        this.printToFile();
    }
    //sort the array numerically ascending using the age.
    public void sortbyAge()
    {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--)
        {
            for (int i = 0; i < currentIndex; i++)
            {
                if (plArr[i].getAge() > plArr[i + 1].getAge())
                {

                    Player temp = plArr[i + 1];
                    plArr[i + 1] = plArr[i];
                    plArr[i] = temp;
                }
            }
        }
        this.printToFile();
    }
    //add a the new player to the array using the parameters and update the text file using the printToFile() function.
    public void addPlayer(int age, String name, String position)
    {
        this.shiftRight(size - 1);
        plArr[size - 1] = new Player(age, name, position);
        this.sortAlphabetically();
        this.printToFile();
    }
    //delete a player by searching for it's index and shiftLeft() on that index in the array. Update the text file using printToFIle()
    public void deletePlayer(String name)
    {
        //this.sortAlphabetically();
        int index = binarySearch(name);
        if (index >= 0)
        {
            shiftLeft(index);
            printToFile();
        } else
        {
            System.out.println("This player does not exist");
        }
    }
    //return the players as an array 
    public String[] getPlayers()
    {
        String[] players = new String[150];
        for (int i = 0; i < size; i++)
        {
            players[i] = plArr[i].getName();
        }
        return players;
    }
    //return the players as an array
    public static String[] getPlayerAsArray()
    {
        try
        {
            Scanner sc = new Scanner(new File("data\\playerData.txt"));
            int numPractice = getNumPlayers();
            String[] outputArr = new String[numPractice];
            int currentIndex = 0;

            while (sc.hasNext())
            {
                String line = sc.nextLine();
                Scanner lsc = new Scanner(line).useDelimiter("#");
                int age = lsc.nextInt();
                String name = lsc.next();
                String position = lsc.next();

                outputArr[currentIndex] = name + "  -  " + age + "  -  " + position;
                currentIndex++;
            }
            sc.close();
            return outputArr;

        } catch (FileNotFoundException ex)
        {
            System.out.println("Player file not found");
            return null;
        }
    }
    //count the number of players in the array
    private static int getNumPlayers()
    {
        try
        {
            Scanner sc = new Scanner(new File("data\\playerData.txt"));
            int count = 0;
            while (sc.hasNext())
            {
                sc.nextLine();
                count++;
            }
            sc.close();
            return count;

        } catch (FileNotFoundException ex)
        {
            System.out.println("Player file not found");
            return -1;
        }
    }
    //validate the age by checking if it is an integer, if not return false
    public boolean checkAge(String age)
    {
        boolean bool;
        int a = 0;
        char c = age.charAt(0);
        try{
            
        a = Integer.parseInt(age);
            System.out.println("age " + a);
        }catch(NumberFormatException e){
            bool = false;
        }
        if(Character.isDigit(c))
        {
            bool = true;
        }else
        {
            bool = false;
            System.out.println("in else statement");
        }
        return bool;
    }
}
