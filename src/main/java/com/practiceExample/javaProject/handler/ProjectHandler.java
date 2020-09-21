package com.practiceExample.javaProject.handler;

import com.practiceExample.javaProject.domain.Project;
import com.practiceExample.javaProject.util.Prompt;

public class ProjectHandler {

  MemberHandler memberHandler;

  ProjectList projectList = new ProjectList();
  public ProjectHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }
  
  //다른 패키지에서 이 메서드를 사용할 수 있도록 public 으로 사용 범위를 공개한다.
  public void add() {
    System.out.println("[프로젝트 등록]");

    Project project = new Project();
    project.no = Prompt.inputInt("번호? ");
    project.title = Prompt.inputString("프로젝트명? ");
    project.content = Prompt.inputString("내용? ");
    project.startDate = Prompt.inputDate("시작일? ");
    project.endDate = Prompt.inputDate("종료일? ");

    while(true) {
      String name = Prompt.inputString("만든이?(취소: 빈문자열)");
      if(memberHandler.findByName(name) != null) {
        project.owner = name;
        break;
      } else if(name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    
    StringBuilder member = new StringBuilder();
    while(true) {
      String name = Prompt.inputString("팀원?(완료: 빈 문자열)");
      if(memberHandler.findByName(name) != null) {
        if(member.length() > 0) {
          member.append(",");
        }
          member.append(name);
      } else if(name.length() == 0) {
        System.out.println("팀원 입력을 완료합니다.");
        break;
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    project.members = member.toString();
    System.out.println("[프로젝트 등록을 완료했습니다.]");
    projectList.add(project);
  }

  public void list() {
    System.out.println("[프로젝트 목록]");
    Project[] p = projectList.toArray();
    for (Project project : p) {
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n",
          project.no, 
          project.title, 
          project.startDate, 
          project.endDate, 
          project.owner,
          project.members);
    }
  }
}
