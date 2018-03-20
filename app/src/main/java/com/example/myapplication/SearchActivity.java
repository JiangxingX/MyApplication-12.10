package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置页面切换效果
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        Transition fade= TransitionInflater.from(this).inflateTransition(R.transition.fade);
        getWindow().setExitTransition(fade);
        getWindow().setEnterTransition(fade);
        getWindow().setReenterTransition(fade);

        setContentView(R.layout.activity_food_search);
        tv_back=(TextView) findViewById(R.id.food_search_return_tv);
        tv_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch ((view.getId())){
            case R.id.food_search_return_tv:
                this.finish();
                break;
        }
    }
}
