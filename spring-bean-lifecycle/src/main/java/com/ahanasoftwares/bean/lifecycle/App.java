package com.ahanasoftwares.bean.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahanasoftwares.bean.lifecycle.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  AnnotationConfigApplicationContext context =       new AnnotationConfigApplicationContext();
          // Scan beans
          context.scan("com.ahanasoftwares");
          context.refresh();
          System.out.println("-------------------------------------------------");
          Book book = context.getBean(Book.class);
          book.setBookName("Mahabharat");
          book.setBookName("Ramayan");
          System.out.println("<#--#> 1111 -->" +book.hashCode());
          System.out.println("<@--@> 2222 -->" +context.getBean(Book.class).hashCode());
          
          context.close();

    }
}
