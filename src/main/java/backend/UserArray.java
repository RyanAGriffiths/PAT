package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserArray
{

    private User userArr[] = new User[150];
    private int size = 0;

    public UserArray()
    {
        try
        {

            Scanner sc = new Scanner(new File("data\\userData.txt"));
            while (sc.hasNext())
            {
                String line = sc.nextLine();
                Scanner lsc = new Scanner(line).useDelimiter("#");

                String email = lsc.next();
                String password = lsc.next();

                User u = new User(email, password);
                userArr[size] = u;
                size++;
                lsc.close();
            }
            sc.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("The user's data file was not found");
        }
    }
    //practice, practice array
    //matches, matches array

    public boolean checkUser(String email, String password)
    {
        for (int i = 0; i < size; i++)
        {
            if (userArr[i].getEmail().equals(email))
            {
                return userArr[i].checkPassword(password);
            }
        }
        return false;
    }

    public void shiftLeft(int index)
    {
        for (int i = index; i < size; i++)
        {
            userArr[i] = userArr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index)
    {
        size++;
        for (int i = userArr.length-1; i > index; i--)
        {
            userArr[i] = userArr[i - 1];
        }
        System.out.println("");
    }

    public void printToFile()
    {
        try
        {
            PrintWriter pw = new PrintWriter(new File("data\\userData.txt"));
            for (int i = 0; i < size; i++)
            {
                pw.println(userArr[i]);
            }
            pw.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("yea naw... (print function)");
        }
    }

    //adduser - add to array, print array to txt
    public void registerUser(String email, String password)
    {
       
        userArr[size] = new User(email, password);
        size++;
        printToFile();
    }

    public String toString()
    {
        String output = "";
        for (int i = 0; i < size; i++)
        {
            output += userArr[i] + "\n";
        }
        return output;
    }

    //deleteUser - delete from array, print array to txt
    //binarySearch
    //getUser
    //setUser
}
