package ru.gb_cource2.lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkWithFile {
    public static void main(String[] args) {
      WorkWithFile workWithFile = new WorkWithFile();
      workWithFile.writeFile();
      System.out.print(new AppData(workWithFile.readFile()));
    }
    void writeFile(){
        File file = new File("file.csv");
        FileOutputStream fos = null;
        BufferedWriter bw = null;
        try {
            fos = new FileOutputStream(file);
            bw = new BufferedWriter(new OutputStreamWriter(fos));
            try {
              bw.write("Value 1;Value 2;Value 3\n");
              bw.write("100;200;123\n");
              bw.write("300;400;500");
            } catch (IOException e) {
             e.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            ex.toString();
        }finally {
            try {
                bw.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    List<String> readFile(){
        List<String> lines = new ArrayList<>();
        Scanner input = null;
        try {
            input = new Scanner(new File("file.csv"));
            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
        } catch (Exception ex) {
          ex.toString();
        }finally {
         input.close();
        }
        return lines;
    }
}
