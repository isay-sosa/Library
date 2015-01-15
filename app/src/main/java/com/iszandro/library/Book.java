package com.iszandro.library;

/**
 * Created by Isay Sosa on 1/15/15.
 */
public class Book {
    private String mTitle;
    private String mAuthor;
    private Image mImage;

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

    public Image getImage() {
        return mImage;
    }

    public void setImage(Image image) {
        mImage = image;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
