package com.practiceExample.javaProject.handler;

import com.practiceExample.javaProject.domain.Task;
import com.practiceExample.javaProject.util.Prompt;

public class TaskHandler {

  MemberHandler memberHandler;
  TaskList taskList = new TaskList();
  
  public TaskHandler(MemberHandler memberHandler) {
   this.memberHandler = memberHandler;
  }

  //다른 패키지에서 이 메서드를 사용할 수 있도록 public 으로 사용 범위를 공개한다.
  public void add() {
    System.out.println("[작업 등록]");

    Task task = new Task();
    task.no = Prompt.inputInt("번호? ");
    task.content = Prompt.inputString("내용? ");
    task.deadline = Prompt.inputDate("마감일? ");
    task.status = Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");

    while(true) {
      String name = Prompt.inputString("담당자?(취소: 빈문자열)");
      if(name.length() == 0) {
        System.out.println("등록을 취소합니다.");
        return;
      } else if(memberHandler.findByName(name) != null) {
        task.owner = name;
        break;
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }

    System.out.println("[작업 등록을 완료했습니다.]");
    taskList.add(task);
  }

  public void list() {
    System.out.println("[작업 목록]");
    Task[] t = taskList.toArray();
    for (Task task : t) {
      String stateLabel = null;
      switch (task.status) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      System.out.printf("%d, %s, %s, %s, %s\n",
          task.no, 
          task.content, 
          task.deadline, 
          stateLabel, 
          task.owner);
    }
  }
}
