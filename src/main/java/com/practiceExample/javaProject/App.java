package com.practiceExample.javaProject;

import com.practiceExample.javaProject.Handler.BoardHandler;
import com.practiceExample.javaProject.Handler.MemberHandler;
import com.practiceExample.javaProject.Handler.ProjectHandler;
import com.practiceExample.javaProject.Handler.TaskHandler;
import com.practiceExample.javaProject.util.Prompt;

public class App {
  
  public static void main(String[] args) {

    MemberHandler memberHandler = new MemberHandler();
    TaskHandler taskHandler = new TaskHandler(memberHandler);
    ProjectHandler projectHandler = new ProjectHandler(memberHandler);

    BoardHandler boardHandler = new BoardHandler();
    BoardHandler boardHandler2 = new BoardHandler();
    
    loop:
      while(true) {
        String command = Prompt.promptString("명령> ");

        switch (command) {
          case "/member/add" : memberHandler.add(); break;
          case "/member/list" : memberHandler.list(); break;
          case "/project/add" : projectHandler.add(); break;
          case "/project/list": projectHandler.list(); break;
          case "/task/add": taskHandler.add(); break;
          case "/task/list": taskHandler.list(); break;

          case "/board/add": boardHandler.add(); break;
          case "/board/list": boardHandler.list(); break;
          case "/board2/add": boardHandler2.add(); break;
          case "/board2/list": boardHandler2.list(); break;
          case "quit":
          case "exit": System.out.println("안녕!"); break loop;
          default : System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println();
      }
  Prompt.promptClose();
  }
}
