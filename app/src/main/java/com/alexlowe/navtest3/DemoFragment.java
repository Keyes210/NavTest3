package com.alexlowe.navtest3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dell on 2/10/2016.
 */
public class DemoFragment extends Fragment {
    private static final String TAB_POSITION = "tab_position";

    public DemoFragment(){

    }

    public static DemoFragment newInstance(int tabPos){
        DemoFragment fragment = new DemoFragment();
        Bundle args = new Bundle();
        args.putInt(TAB_POSITION, tabPos);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle args = getArguments();
        int tabPos = args.getInt(TAB_POSITION);

        ArrayList<String> items = new ArrayList<String>();
        for (int i = 1; i < 50; i++) {
            items.add("Tab #" + tabPos + " item #" + i);
        }

        View v =  inflater.inflate(R.layout.fragment_list, container, false);
        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter(items));

        return v;
    }
}
