package com.practiceExample.javaProject.Handler;

import com.practiceExample.javaProject.domain.Task;
import com.practiceExample.javaProject.util.Prompt;

public class TaskHandler {

  public MemberHandler memberHandler;
  
  TaskList taskList = new TaskList();
  public TaskHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }
  
  public void list() {
    System.out.println("[작업 목록]");
    Task[] tasks = taskList.toArray();
    for(Task t : tasks) {
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

  public void add() {
    System.out.println("[작업 등록]");
    Task task = new Task();
    task.no = Prompt.promptInt("번호? ");
    task.content = Prompt.promptString("내용? ");
    task.endDate = Prompt.promptDate("완료일? ");
    task.status = Prompt.promptInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    
    while(true) {
      String name = Prompt.promptString("담당자?(취소: 빈 문자열)");
      if(name.length() == 0) {
        System.out.println("작업 등록을 취소합니다.");
        return;
      } else if(memberHandler.findByName(name) != null) {
        task.owner = name;
        break;
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    System.out.println("작업 등록을 완료했습니다.");
    taskList.add(task);
  }

}
