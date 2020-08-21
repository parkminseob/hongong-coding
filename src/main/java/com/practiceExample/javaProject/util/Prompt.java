package com.practiceExample.javaProject.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {
  static Scanner scanner = new Scanner(System.in);
  
  
  static public String promptString(String str) {
    System.out.print(str);
    return scanner.nextLine();
  }

  static public int promptInt(String str) {
    return Integer.parseInt(promptString(str));
  }
  
  static public Date promptDate(String str) {
    return Date.valueOf(promptString(str));
  }
  
  public static void promptClose() {
    scanner.close();
  }
  
}
