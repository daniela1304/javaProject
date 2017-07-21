package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by todescudaniela on 7/17/2017.
 */
public class ReadInput {
    Scanner scan = new Scanner(System.in);
    public int readInteger() {
        return scan.nextInt();
    }

    public float readFloatNumber() {
        return scan.nextFloat();
    }

    public String readString() {
        return scan.nextLine();

    }

    public List<Integer> readList() {
        List<Integer> lista= new ArrayList<Integer>() ;

        String string = scan.nextLine();

        String[] parts = string.split(",");
        for (String index:parts) {
            lista.add(Integer.parseInt(index));
        }

    return lista;

}
}
