package com.practiceExample.javaProject.Handler;

import java.sql.Date;
import com.practiceExample.javaProject.util.Prompt;

public class ProjectHandler {

  static class Project{
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String member;
  }

  final static int LENGTH = 5;
  static int size = 0;
  static Project[] list = new Project[LENGTH];

  MemberHandler memberHandler;
  
  public static void listProject() {
    for(int i = 0; i < size; i++) {
      Project p = list[i];

      System.out.printf("%d, %s, %s, %s, %s\n", p.no, p.title, p.startDate, p.endDate, p.owner);
    }
  }

  public static void addProject() {
    Project project = new Project();
    System.out.println("[프로젝트 등록]");
    project.no = Prompt.promptInt("번호? ");
    project.title = Prompt.promptString("프로젝트명? ");
    project.content = Prompt.promptString("내용? ");
    project.startDate = Prompt.promptDate("시작일? ");
    project.endDate = Prompt.promptDate("종료일? ");
    
    
    while (true) {
      
    String name = Prompt.promptString("만든이?(취소: 빈 문자열)");
    
    
    
    System.out.println("프로젝트 등록을 취소합니다.");
    break;
    }
    project.member = Prompt.promptString("팀원? ");
    list[size++] = project;
 }
}
