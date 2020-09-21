<<<<<<< HEAD:src/main/java/com/test/MemberServiceExample.java
package com.test;
=======
package com.practiceExample.test;
>>>>>>> 725119f5485893d367380e0b2e3a66dfc123f360:src/main/java/com/practiceExample/test/MemberServiceExample.java

public class MemberServiceExample {
  public static void main(String[] args) {
    MemberService memberService = new MemberService();
    boolean result = memberService.login("hong", "12345");
    if(result) {
      System.out.println("로그인 되었습니다.");
      memberService.logout("hong");
    } else {
      System.out.println("id 또는 password가 올바르지 않습니다.");
    }
  }
}
