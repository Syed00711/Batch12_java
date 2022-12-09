package com.microcare.corejava;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.
public class CheckedException {
    public static void main(String[] args) {
        String filename = "checked.txt";

        try {
        	printFileNoConsole(filename);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Review the name of the file you want to print!" + e.getCause());
            e.printStackTrace();
        } catch (IOException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "An unexpected error has occurred! Please contact support! " + e.getCause());
        } finally {
            System.out.println("arrived finally!");
        }

        System.out.println("Despite the exception or not, the program continues...");
    }

    public static void printFileNoConsole(String filename) throws IOException {
        File file = new File(filename);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}