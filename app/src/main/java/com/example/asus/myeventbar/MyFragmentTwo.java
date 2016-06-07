package com.example.asus.myeventbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/6/7.
 */
public class MyFragmentTwo extends Fragment {
    private ListView mListView;
    private List<String> mList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_list_fragment,null);
        mListView=(ListView)view.findViewById(R.id.list_item);
        mList=new ArrayList<>();
        for (int i = 0; i <13 ; i++) {
            String str="测试"+i;
            mList.add(str);
        }
        ArrayAdapter adapter=new ArrayAdapter(getContext(),R.layout.support_simple_spinner_dropdown_item,mList);
        mListView.setAdapter(adapter);
        return view;
    }
}
