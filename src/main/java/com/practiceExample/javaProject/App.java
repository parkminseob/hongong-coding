package com.practiceExample.javaProject;

import com.practiceExample.javaProject.Handler.MemberHandler;
import com.practiceExample.javaProject.Handler.ProjectHandler;
import com.practiceExample.javaProject.Handler.TaskHandler;
import com.practiceExample.javaProject.util.Prompt;

public class App {
  
  public static void main(String[] args) {

    loop:
      while(true) {
        String command = Prompt.promptString("명령> ");

        switch (command) {
          case "/member/add" : MemberHandler.add(); break;
          case "/member/list" : MemberHandler.list(); break;
          case "/project/add" : ProjectHandler.addProject(); break;
          case "/project/list": ProjectHandler.listProject(); break;
          case "/task/add": TaskHandler.addTask(); break;
          case "/task/list": TaskHandler.listTask(); break;
          case "quit":
          case "exit": System.out.println("안녕!"); break loop;
          default : System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println();
      }
  Prompt.promptClose();
  }
}
