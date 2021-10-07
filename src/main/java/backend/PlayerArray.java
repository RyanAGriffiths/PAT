package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayerArray {

    private Player[] plArr = new Player[150];
    private int size = 0;

    public PlayerArray() {

        try {
            Scanner sc = new Scanner(new File("data\\playerData.txt"));
            while (sc.hasNext()) {
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
        } catch (FileNotFoundException ex) {
            System.out.println("Player file not found");
        }
    }

    public int binarySearch(String name) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (plArr[middle].getName().equals(name)) {
                return middle;
            } else if (name.compareTo(plArr[middle].getName()) > 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            plArr[i] = plArr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index) {
        size++;
        for (int i = size - 1; i > index - 1; i--) {
            plArr[i] = plArr[i - 1];
        }
    }

    public void printToFile() {

        try {

            PrintWriter pw = new PrintWriter(new FileWriter("data\\playerData.txt"));
            String output = "";
            for (int i = 0; i < size; i++) {
                output += plArr[i].getAge() + "#" + plArr[i].getName() + "#" + plArr[i].getPosition() + "\n";
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
                if (plArr[i].getName().compareTo(plArr[i + 1].getName()) > 0) {

                    Player temp = plArr[i + 1];
                    plArr[i + 1] = plArr[i];
                    plArr[i] = temp;
                }
            }
        }
    }

    public void movePlayer(int index) {
        
        Player p = plArr[index];
        int age = p.getAge();
        String name = p.getName();
        String position = p.getPosition();
        
        Attendance a = new Attendance();
        a.addPlayer(age, name, position);
        
        PlayerArray r = new PlayerArray();
        r.deletePlayer(name);
    }

    public void addPlayer(int age, String name, String position) {
        this.shiftRight(size - 1);
        plArr[size - 1] = new Player(age, name, position);
        this.sortAlphabetically();
        this.printToFile();
    }

    public void deletePlayer(String name) {
        int index = binarySearch(name);
        if (index > 0) {
            shiftLeft(index);
            printToFile();
        } else {
            System.out.println("This player does not exist");
        }
    }

    public String[] getPlayers() {
        String[] players = new String[150];
        for (int i = 0; i < size; i++) {
            players[i] = plArr[i].getName();
        }
        return players;
    }
}
