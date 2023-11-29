/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dp_project_1;

/**
 *
 * @author HP
 */
public class FictionBookFactory implements BookFactory {
    @Override
    public Book createBook(int bookid, String title, String author, double price) {
        return new FictionBook(bookid, title, author, price);
    }
}
