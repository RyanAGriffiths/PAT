package backend;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Player {
    
    private int age;
    private String name;
    private String position;

    public Player(int age, String name, String position) {
        this.age = age;
        this.name = name;
        this.position = position;
        
        try
        {
            PrintWriter pw = new PrintWriter(new FileWriter("data\\studentData.txt", true));
            pw.println(age + "#" + name + "#" + position);
            pw.close();
            
        } catch (IOException ex)
        {
            System.out.println("IOException thrown in print writer");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }  
}
