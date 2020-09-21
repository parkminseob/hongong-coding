<<<<<<< HEAD:src/main/java/com/test/ArrayCopyExample.java
package com.test;
=======
package com.practiceExample.test;
>>>>>>> 725119f5485893d367380e0b2e3a66dfc123f360:src/main/java/com/practiceExample/test/ArrayCopyExample.java

public class ArrayCopyExample {
 public static void main(String[] args) {
  String[] oldStrArray = {"java", "array", "copy"};
  String[] newStrArray = new String[5];

  System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

  for (int i = 0; i < newStrArray.length; i++) {
    System.out.print(newStrArray[i] + ", ");
  }
}
}
