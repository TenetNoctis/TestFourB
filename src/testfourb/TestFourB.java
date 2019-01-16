/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfourb;

import java.io.*;
import java.util.*;

/**
 *
 * @author User
 */
public class TestFourB {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException
  {
    Scanner textfile = new Scanner (System.in);
    BufferedReader bf = null;
    String line = "";
    String txtSplitby = "-";
    int counter = 0;
    List<String> digit = new ArrayList<>();
    List<String> space = new ArrayList<>();
   
    String txt = "strings.txt";
    bf = new BufferedReader (new FileReader(txt));
      line=bf.readLine();
      String[] splitLine = line.split(txtSplitby);
      for (int i = 0; i < splitLine.length; i++) {
          String name = splitLine[i];
          boolean hasDigit = name.matches(".*\\d+.*");
          if (hasDigit == true) {
              digit.add(name);
          }
      }
      String lineSpace = line.replace("-"," ");
      System.out.println("Strings with numbers");
      System.out.println("------------------------------");
      System.out.println(digit);
      System.out.println("");
      System.out.println("Strings with empty space");
      System.out.println("------------------------------");
      System.out.println(lineSpace);
    }
        
}
  

  
