package com.company;
import java.util.*;

class practice{
  private int i;

  private String name;
    public int getI() {
        return i;
    }
    public void setI(int o) {
        i=o;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name == "Suleman"){
        this.name = name;
    }
        else
        {
            System.out.println("You are not authorized");
        }

    }
}

public class Main {


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        practice x = new practice();

        String name = s.next();
        x.setName(name);

        System.out.println(x.getName());

    }

}