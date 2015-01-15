package com.iszandro.library;

import android.content.Context;
import android.net.Uri;

import java.util.ArrayList;

/**
 * Created by Isay Sosa on 1/15/15.
 */
public class Library {
    private static Library sInstance;
    private Context mAppContext;
    private ArrayList<Book> mBooks;

    public static Library getInstance(Context c) {
        if (sInstance == null) {
            sInstance = new Library(c.getApplicationContext());
        }
        return sInstance;
    }

    private Library(Context appContext) {
        mAppContext = appContext;
        initBooks();
    }

    private void initBooks() {
        mBooks = new ArrayList<>();

        Book sorcerersStone = new Book();
        sorcerersStone.setAuthor("H. K. Rowling");
        sorcerersStone.setTitle("Harry Potter and the Sorcerer's Stone");
        String sorcerersStoneImgPath = Uri.parse("android.resource://" +
                                                 mAppContext.getPackageName() + "/" +
                                                 R.drawable.sorcerers_stone)
                                          .toString();
        Image sorcerersStoneImage = new Image(sorcerersStoneImgPath);
        sorcerersStone.setImage(sorcerersStoneImage);


        Book deathlyHallows = new Book();
        deathlyHallows.setAuthor("J. K. Rowling");
        deathlyHallows.setTitle("Harry Potter and the Deathly Hallows");
        String deathlyHallowsImgPath = Uri.parse("android.resource://" +
                                                 mAppContext.getPackageName() + "/" +
                                                 R.drawable.deathly_hallows)
                                          .toString();
        Image deathlyHallowsImage = new Image(deathlyHallowsImgPath);
        deathlyHallows.setImage(deathlyHallowsImage);

        mBooks.add(sorcerersStone);
        mBooks.add(deathlyHallows);
    }

    public ArrayList<Book> getBooks() {
        return mBooks;
    }

    public void addBook(Book book) {
        mBooks.add(book);
    }

    public void deleteBook(Book book) {
        mBooks.remove(book);
    }
}