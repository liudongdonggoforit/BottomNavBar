package com.ldd.bottomnavbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View[] mBottomSelects;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        iniEvents();
    }

    private void iniEvents() {
        for ( int i = 0;i < mBottomSelects.length; i++){
            final int temp = i;
            mBottomSelects[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selected(temp);
                }
            });
        }
    }

    private void selected(int position) {
        for (int i=0;i < mBottomSelects.length ; i++){
            if (i==position){
                mBottomSelects[i].setSelected(true);
            }else {
                mBottomSelects[i].setSelected(false);
            }
        }
    }

    private void initView() {
        mBottomSelects = new View[]{findViewById(R.id.main_bottom_home),findViewById(R.id.main_bottom_shopping),findViewById(R.id.main_bottom_sort),findViewById(R.id.main_bottom_mine)};
        mBottomSelects[0].setSelected(true);
    }
}
