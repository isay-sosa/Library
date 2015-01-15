package com.iszandro.library;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Isay Sosa on 1/15/15.
 */
public class BookListFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private ArrayList<Book> mBooks;
    private Activity mActivity;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initComponents();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_book, container, false);
        initViewComponents(view);
        return view;
    }

    private void initViewComponents(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initComponents() {
        mActivity = getActivity();
        mBooks = Library.getInstance(mActivity).getBooks();
        mLayoutManager = new LinearLayoutManager(mActivity);
        mAdapter = new BookAdapter(mActivity, mBooks);
    }
}
