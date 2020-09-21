<<<<<<< HEAD:src/main/java/com/test/MemberService.java
package com.test;
=======
package com.practiceExample.test;
>>>>>>> 725119f5485893d367380e0b2e3a66dfc123f360:src/main/java/com/practiceExample/test/MemberService.java

public class MemberService {
 boolean login(String id, String password) {
   if(id.equals("hong") && password.equals("12345")) {
     return true;
   }else {
   return false;
   }
 }
 void logout(String id) {
   System.out.println("로그아웃 되었습니다.");
 }

}
