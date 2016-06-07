package com.example.asus.myeventbar;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;
import de.greenrobot.event.Subscribe;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TextView mTextView;
    private List<Fragment> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        mViewPager=(ViewPager)findViewById(R.id.view_pager);
        mTextView=(TextView)findViewById(R.id.text_view);
        mList=new ArrayList<>();
        mList.add(new MyListFragment());
        mList.add(new MyFragmentTwo());
        MyFragmentAdapter adapter=new MyFragmentAdapter(getSupportFragmentManager(),mList);
        mViewPager.setAdapter(adapter);
    }
    @Subscribe
   public void onEvent(MyEventBus myEventBus){
       mTextView.setText(myEventBus.getStr());
   }
}
