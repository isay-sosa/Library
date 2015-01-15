package com.iszandro.library;

/**
 * Created by Isay Sosa on 1/15/15.
 */
public class Book {
    private String mTitle;
    private String mAuthor;
    private int mCover;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public int getCover() {
        return mCover;
    }

    public void setCover(int cover) {
        mCover = cover;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
