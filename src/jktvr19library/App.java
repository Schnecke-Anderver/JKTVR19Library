/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19library;

import java.util.Scanner;
import newpackage.Book;

/**
 *
 * @author pupil
 */
 public class App {
     private Scanner scanner = new Scanner(System.in);// поле подсвечено земеным
     private Readers[] = new Reader[10]; 
     
     
     public void run(){
         System.out.println("-------Библиотека-------");
         System.out.println("============================================");
         boolean repeat = true;
         
         do{         
            System.out.println("Задачи");
            System.out.println("1.Добавить книгу");
            System.out.println("2.Посмотреть список книг");
            System.out.println("3.Добавить читателя");
            System.out.println("4.Список читателей");
            System.out.println("5.Выдать книгу");
            System.out.println("6.Забрать книгу");
            System.out.println("7. Закрыть библиотеку");
            System.out.println("Выберите задачу");
            System.out.println("============================================");
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("----Библиотека закрывается----");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("----Добавить книгу----");
                    Book book = new Book("Война и мир","Лев толстой", 2010); //вызываем конструктор
                   // book.
                    break;
                case "2":
                    System.out.println("----Посмотреть список книг----");
                    
                    break;
                case "3":
                    System.out.println("----Добавить читателя----");
                    Reader reader = new Reader("Иван","Иванов", 51012073132); //дописать и разобраться
                    readers[0]=
                    Reader reader1 = new Reader("Petr", "Petrov", 51208124536);
                    break;
                case "4":
                    System.out.println("----Выдать книгу----");
                    for (Reader r : readers){
                        if(r[i] != null){
                            System.out.println(i+1+". ");
                        }
                        }
                    }
                    break;
                case "5":
                    System.out.println("----Забрать книгу----");
                    break;

                default:
                    throw new AssertionError();
                }
            } while(repeat);  // не успела дописать
                 
    }
    
}
