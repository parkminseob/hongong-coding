package com.practiceExample.javaProject.Handler;

import com.practiceExample.javaProject.domain.Board;
import com.practiceExample.javaProject.util.Prompt;

public class BoardHandler {

  BoardList boardList = new BoardList();
  
  public void add() {
    Board board = new Board();
    System.out.println("[새 게시글 등록]");
    board.no = Prompt.promptInt("번호? ");
    board.title = Prompt.promptString("제목? ");
    board.content = Prompt.promptString("내용? ");
    board.writer = Prompt.promptString("작성자? ");
    board.registeredDate = new java.sql.Date(System.currentTimeMillis());
    board.viewCount = 0;
    
    boardList.add(board);
    System.out.println("게시글 등록을 완료했습니다.");
  }
  public void list() {
    System.out.println("[게시글 목록]");
    Board[] boards = boardList.toArray();
    for(Board b : boards) {
      System.out.printf("%d, %s, %s, %s, %d\n",
          b.no, b.title, b.writer, b.registeredDate, b.viewCount);
    }
  }
}
