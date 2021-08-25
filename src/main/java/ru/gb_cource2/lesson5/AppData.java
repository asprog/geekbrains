package ru.gb_cource2.lesson5;

import java.util.Arrays;
import java.util.List;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(List<String> lines) {
      data = new int[lines.size()-1][3];
     for(int i = 0; i < lines.size(); i++){
       if(i == 0) setHeader(lines.get(i));
       else addData(lines.get(i),i);
     }
    }

    private void setHeader(String headerLine) {
        header = headerLine.split(";");

    }
    private void addData(String headerLine,int row) {
        String[] items = headerLine.split(";");
        for(int i = 0; i < items.length; i++) {
            data[row-1][i] = Integer.parseInt(items[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder matrix = new StringBuilder(String.format("header: %s" ,Arrays.toString(header)))
                .append("\n");
        matrix.append("data:\n");
        for(int i = 0; i < data.length;i++){
            matrix
                    .append(Arrays.toString(data[i]))
                    .append("\n");
        }
        return matrix.toString();
    }
}
