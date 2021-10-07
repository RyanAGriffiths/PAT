/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PracticeArray
{

    Practice[] pArr = new Practice[150];
    private int size = 0;

    public PracticeArray()
    {

        try
        {
            Scanner sc = new Scanner(new File("data\\practiceData.txt"));
            while (sc.hasNext())
            {
                String line = sc.nextLine();
                Scanner lsc = new Scanner(line).useDelimiter("#");

                String date = lsc.next();
                String time = lsc.next();
                String location = lsc.next();

                Practice p = new Practice(date, time, location);
                pArr[size] = p;
                size++;
                lsc.close();
            }
            sc.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("Practice file was not found");
        }
    }

    private int binarySearch(String date)
    {
        int start = 0;
        int end = size - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;
            if (pArr[middle].getDate().equals(date))
            {
                return middle;
            } else if (date.compareTo(pArr[middle].getDate()) > 0)
            {
                start = middle + 1;
            } else
            {
                end = middle - 1;
            }
        }
        return -1;
    }

    public void printToFile()
    {

        try
        {

            PrintWriter pw = new PrintWriter(new File("data\\practiceData.txt"));
            for (int i = 0; i < size; i++)
            {
                pw.println(pArr[i]);
            }
            pw.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("could not print to practice file");
        }
    }

    public void shiftLeft(int index)
    {
        for (int i = index; i < size; i++)
        {
            pArr[i] = pArr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index)
    {
        size++;
        for (int i = size - 1; i > index - 1; i--)
        {
            pArr[i] = pArr[i - 1];
        }
    }

    public void sortDate()
    {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--)
        {
            for (int i = 0; i < currentIndex; i++)
            {
                if (pArr[i].getDate().compareTo(pArr[i + 1].getDate()) > 0)
                {

                    Practice temp = pArr[i + 1];
                    pArr[i + 1] = pArr[i];
                    pArr[i] = temp;
                }
            }
        }
    }

    public void addPractice(String date, String time, String location)
    {
        this.shiftRight(size - 1);
        pArr[size - 1] = new Practice(date, time, location);
        this.sortDate();
        this.printToFile();
    }

    public void deletePractice(String date)
    {
        int index = binarySearch(date);
        if (index > 0)
        {
            shiftLeft(index);
        } else
        {
            System.out.println("This player does not exist");
        }
    }

    public String[] getPractice()
    {
        String[] players = new String[150];
        for (int i = 0; i < size - 1; i++)
        {
            players[i] = pArr[i].getDate();
        }
        return players;
    }

    public static String[] getPracticeAsArray()
    {
        try
        {
            Scanner sc = new Scanner(new File("data\\practiceData.txt"));
            int numPractice = getNumPractice();
            String[] outputArr = new String[numPractice];
            int currentIndex = 0;

            while (sc.hasNextLine())
            {
                outputArr[currentIndex] = sc.nextLine();
                currentIndex++;
            }
            sc.close();
            return outputArr;

        } catch (FileNotFoundException ex)
        {
            System.out.println("Practice file not found");
            return null;
        }
    }

    private static int getNumPractice()
    {
        try
        {
            Scanner sc = new Scanner(new File("data\\practiceData.txt"));
            int count = 0;
            while (sc.hasNextLine())
            {
                sc.nextLine();
                count++;
            }
            sc.close();
            return count;

        } catch (FileNotFoundException ex)
        {
            System.out.println("Practice file not found");
            return -1;
        }
    }
}
