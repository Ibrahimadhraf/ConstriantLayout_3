package com.example.android.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Placeholder;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
 private Placeholder mPlaceHolder;
 private ConstraintLayout mLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlaceHolder=findViewById(R.id.placeholder3);
        mLayout=findViewById(R.id.layout);

    }

    public void swapView(View view){
        TransitionManager.beginDelayedTransition(mLayout);
        mPlaceHolder.setContentId(view.getId());

    }
}
