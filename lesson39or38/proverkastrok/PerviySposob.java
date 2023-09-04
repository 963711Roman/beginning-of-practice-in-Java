package com.Lyambda.lesson39or38.proverkastrok;
//первіряю строку на пробіли
public class PerviySposob {
    //прописав конструктор
    public PerviySposob(String s) {
    }
    public   String check;
    public  boolean checkForEmptiness() {
       check = "fjfgh";
        char[] chars = check.toCharArray();
        //int spaceCount = 0;
        int a = 0;
        for (char ch : chars) {
            if (ch == ' ') {
                a++;
            }
        }
        if (a == chars.length) {
            System.out.println("в строке есть пробел");
            return true; // Возвращает true если все знаки это пробел
        } else
            System.out.println("строка не имет пробелов");
        return false;
    }
}
/*

еще вариант проверить надо

		System.out.println(Strings.isNullOrEmpty(""));  	// true
		System.out.println(Strings.isNullOrEmpty(null));	// true
		System.out.println(Strings.isNullOrEmpty("Java"));  // false

		System.out.println(StringUtils.isEmpty(""));		// true
		System.out.println(StringUtils.isEmpty(null));  	// true
		System.out.println(StringUtils.isEmpty("Java"));	// false

		System.out.println(StringUtils.isBlank(" "));		// true
 */

