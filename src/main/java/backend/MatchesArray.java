/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MatchesArray
{

    Matches[] mArr = new Matches[150];
    private int size = 0;

    public MatchesArray()
    {
        try
        {
            Scanner sc = new Scanner(new File("data\\matchesData.txt"));
            while (sc.hasNext())
            {
                String line = sc.nextLine();
                Scanner lsc = new Scanner(line).useDelimiter("#");

                String date = lsc.next();
                String opponent = lsc.next();
                char location = lsc.next().charAt(0);

                Matches p = new Matches(date, opponent, location);
                mArr[size] = p;
                size++;
                lsc.close();
            }
            sc.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("Matches file was not found");
        }
    }

    public int binarySearch(String date)
    {

        int start = 0;
        int end = size - 1;
        while (start <= end)
        {
            Scanner sc = new Scanner(date).useDelimiter(" ");
            int i = sc.nextInt();
            sc.close();
            int middle = (start + end) / 2;
            if ((mArr[middle].getDateInt()) == i)
            {
                return middle;
            } else if ((mArr[middle].getDateInt()) > i)
            {
                end = middle - 1;
            } else
            {
                start = middle + 1;
            }
        }
        return -1;
    }

    public void shiftLeft(int index)
    {
        for (int i = index; i < size - 1; i++)
        {
            mArr[i] = mArr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index)
    {
        size++;
        for (int i = size - 1; i > index; i--)
        {
            mArr[i] = mArr[i - 1];
        }
    }

    public void printToFile()
    {

        try
        {

            PrintWriter pw = new PrintWriter(new File("data\\matchesData.txt"));
            for (int i = 0; i < size; i++)
            {
                pw.println(mArr[i]);
            }
            pw.close();
        } catch (IOException ex)
        {
            System.out.println("Couldn't print to the file");
        }
    }

    public void sortDate()
    {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--)
        {
            for (int i = 0; i < currentIndex; i++)
            {
                if (mArr[i].getDate().compareTo(mArr[i + 1].getDate()) > 0)
                {

                    Matches temp = mArr[i + 1];
                    mArr[i + 1] = mArr[i];
                    mArr[i] = temp;
                }
            }
        }
    }

    public void addMatch(String date, String opponent, char location)
    {
        
            this.shiftRight(size - 1);
            mArr[size - 1] = new Matches(date, opponent, location);
            this.sortDate();
            this.printToFile();
        
    }

    public void deleteMatch(String date)
    {

        int index = binarySearch(date);
        if (index >= 0)
        {
            shiftLeft(index);
            printToFile();
        } else
        {
            System.out.println("This match does not exist");
        }
    }

    public String[] getMatch()
    {
        String[] players = new String[150];
        for (int i = 0; i < size; i++)
        {
            players[i] = mArr[i].getDate() + "                   " + mArr[i].getOpponent() + "                   " + mArr[i].getLocation();

        }
        return players;
    }

    public boolean checkDate(String date)
    {
        char d = date.charAt(0);
        if(Character.isDigit(d))
        {
            return true;
        }else
        {
            return false;
        }
    }

}
