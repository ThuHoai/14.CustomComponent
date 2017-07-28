package com.example.hoaiktt.customcomponent;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private ColoredView mColoredView;
    private LinearLayout mPaintLayout;
    private ImageButton mCurrPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mColoredView = (ColoredView) findViewById(R.id.canvasPaint);
        mPaintLayout = (LinearLayout) findViewById(R.id.paint_color);
    }

    public void ChooseClick(View view) {
        String color = view.getTag().toString();
        mColoredView.setColor(color);
    }

}
