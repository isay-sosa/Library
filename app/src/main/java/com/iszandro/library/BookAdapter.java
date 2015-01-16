package com.iszandro.library;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Isay Sosa on 1/15/15.
 */
public class BookAdapter extends RecyclerView.Adapter {
    private final ArrayList<Book> mBooks;
    private final Context mContext;

    private class BookHolder extends RecyclerView.ViewHolder {
        private ImageView mBookCover;
        private TextView mBookTittle;
        private TextView mBookAuthor;

        public BookHolder(View itemView) {
            super(itemView);
            initBookHolderComponents(itemView);
        }

        private void initBookHolderComponents(View itemView) {
            mBookCover = (ImageView) itemView.findViewById(R.id.book_list_item_cover);
            mBookTittle = (TextView) itemView.findViewById(R.id.book_list_item_title);
            mBookAuthor = (TextView) itemView.findViewById(R.id.book_list_item_author);
        }
    }

    public BookAdapter(Context context, ArrayList<Book> books) {
        mContext = context;
        mBooks = books;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_book,
                                                                        viewGroup, false);
        return new BookHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        BookHolder bookHolder = (BookHolder) viewHolder;
        Book book = mBooks.get(i);

        bookHolder.mBookTittle.setText(book.getTitle());
        bookHolder.mBookAuthor.setText("By " + book.getAuthor());
        bookHolder.mBookCover.setImageDrawable(mContext.getDrawable(book.getCover()));
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }
}
