package com.example.demo.shild_book.OOP.Finall;

/**
 * public может быть только один и имя должно совпадать с именем файла
 */
//  public final class OneClass - от final нельзя наследоваться!
public class OneClass {
    // Это константное значение
    public final int varInt = 1;

    // Константа
    private static final int VAR_INT = 2;
}


//  public class TwoClass extends OneClass - Так нельзя!
final class TwoClass extends OneClass {

}
