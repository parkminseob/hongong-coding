package com.practiceExample.javaProject.handler;

import com.practiceExample.javaProject.domain.Board;
import com.practiceExample.javaProject.util.Prompt;

public class BoardHandler {
  
  BoardList boardList = new BoardList();
  
  public void add() {
    System.out.println("[새 게시글]");
    Board board = new Board();
    
    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.viewCount = 0;
    board.registeredDate = new java.sql.Date(System.currentTimeMillis());
    
    System.out.println("[게시글 등록을 완료했습니다.]");
    boardList.add(board);
  }
  
  public void list() {
    System.out.println("[게시글 목록]");
    Board[] boards = boardList.toArray();
    for(Board b : boards) {
      System.out.printf("%d, %s, %s, %s, %s, %d",
          b.no, b.title, b.content, b.writer, b.registeredDate, b.viewCount);
    }
  }
  
  
}
