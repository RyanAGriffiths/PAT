/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ryang
 */
public class Attendance {

    private Player[] arr = new Player[150];
    private int size = 0;

    public Attendance() {
        
        try {
            
            Scanner sc = new Scanner(new File("data\\attendenceData.txt"));
            
            while (sc.hasNext()) {
                String line = sc.nextLine();
                Scanner lsc = new Scanner(line).useDelimiter("#");

                System.out.println(line);

                int age = lsc.nextInt();
                String name = lsc.next();
                String position = lsc.next();

                Player p = new Player(age, name, position);
                arr[size] = p;
                size++;
                lsc.close();
            }
            sc.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Player file not found");
        }
    }
    
    public void movePlayer(int index) {
        
        Player p = arr[index];
        int age = p.getAge();
        String name = p.getName();
        String position = p.getPosition();
        
        PlayerArray a = new PlayerArray();
        a.addPlayer(age, name, position);
        
        Attendance r = new Attendance();
        r.deletePlayer(name);
    }

    public int binarySearch(String name) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle].getName().equals(name)) {
                return middle;
            } else if (name.compareTo(arr[middle].getName()) > 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index) {
        size++;
        for (int i = size - 1; i > index - 1; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public void printToFile() {

        try {

            PrintWriter pw = new PrintWriter(new FileWriter("data\\playerData.txt"));
            String output = "";
            for (int i = 0; i < size; i++) {
                output += arr[i].getAge() + "#" + arr[i].getName() + "#" + arr[i].getPosition() + "\n";
            }
            pw.println(output);
            pw.close();
        } catch (IOException ex) {
            System.out.println("could not print to Player file");
        }
    }

    public void sortAlphabetically() {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {
            for (int i = 0; i < currentIndex; i++) {
                if (arr[i].getName().compareTo(arr[i + 1].getName()) > 0) {

                    Player temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public void addPlayer(int age, String name, String position) {
        this.shiftRight(size - 1);
        arr[size - 1] = new Player(age, name, position);
        this.sortAlphabetically();
        this.printToFile();
    }

    public void deletePlayer(String name) {
        int index = binarySearch(name);
        if (index > 0) {
            shiftLeft(index);
        } else {
            System.out.println("This player does not exist");
        }
    }

    public String[] getPlayers() {
        String[] players = new String[150];
        for (int i = 0; i < size; i++) {
            players[i] = arr[i].getName();
        }
        return players;
    }
}
