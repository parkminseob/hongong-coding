package com.practiceExample.javaProject.Handler;

import com.practiceExample.javaProject.domain.Project;
import com.practiceExample.javaProject.util.Prompt;

public class ProjectHandler {

  ProjectList projectList = new ProjectList();
  public MemberHandler memberHandler;

  public ProjectHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }
  
  public void list() {
    System.out.println("[프로젝트 목록]");
    Project[] projects = projectList.toArray();
    for(Project p : projects) {
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n",
          p.no, p.title, p.startDate, p.endDate, p.owner, p.member);
    }
  }

  public void add() {
    Project project = new Project();
    System.out.println("[프로젝트 등록]");
    project.no = Prompt.promptInt("번호? ");
    project.title = Prompt.promptString("프로젝트명? ");
    project.content = Prompt.promptString("내용? ");
    project.startDate = Prompt.promptDate("시작일? ");
    project.endDate = Prompt.promptDate("종료일? ");
    
    while (true) {
      String name = Prompt.promptString("만든이?(취소: 빈 문자열)");
      if(name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if(memberHandler.findByName(name) != null) {
        project.owner = name;
        break;
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }

    StringBuilder members = new StringBuilder();
    while(true) {
      String name = Prompt.promptString("팀원?(완료: 빈 문자열)");
      if(name.length() == 0) {
        System.out.println("팀원 등록을 완료했습니다.");
        break;
      } else if(memberHandler.findByName(name) != null) {
        if(members.length()>0) {
          members.append(",");
        }
        members.append(name);
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    project.member = members.toString();
    System.out.println("[프로젝트 등록을 완료했습니다.]");
    projectList.add(project);
  }
}
