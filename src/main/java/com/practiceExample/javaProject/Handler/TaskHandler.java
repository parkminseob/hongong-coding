package com.practiceExample.javaProject.Handler;

import java.sql.Date;
import com.practiceExample.javaProject.util.Prompt;

public class TaskHandler {

  static class Task{
    int no;
    String content;
    Date endDate;
    int status;
    String owner;
    String project;
  }

  final static int TLENGTH = 5;
  static int tsize = 0;
  static Task[] tasks = new Task[TLENGTH];

  public static void listTask() {
    System.out.println("[작업 목록]");
    for(int i = 0; i < tsize; i++) {
      Task t = tasks[i];
      String statusLable = null;
      switch(t.status) {
        case 1: statusLable = "진행중"; break;
        case 2: statusLable = "완료"; break;
        default : statusLable = "신규";
      }
      System.out.printf("%d, %s, %s, %s, %s\n",
          t.no, t.content, t.endDate, statusLable, t.owner);
    }
  }

  public static void addTask() {
    Task task = new Task();
    task.no = Prompt.promptInt("번호? ");
    task.content = Prompt.promptString("내용? ");
    task.endDate = Prompt.promptDate("완료일? ");
    task.status = Prompt.promptInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    task.owner = Prompt.promptString("담당자? ");
    tasks[tsize++] = task;
  }

}
