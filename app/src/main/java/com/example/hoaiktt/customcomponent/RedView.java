package com.example.hoaiktt.customcomponent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class RedView extends View {
    private Paint mDrawing;
    private Canvas canvasDraw;
    private  int w = 500, h = 500;

    public RedView(Context context) {
        super(context);
    }

    public RedView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setUpDrawing();
    }

    private  void setUpDrawing(){
        mDrawing = new Paint(Paint.ANTI_ALIAS_FLAG);
        mDrawing.setColor(Color.RED);
        mDrawing.setStrokeWidth(2);
        mDrawing.setStrokeCap(Paint.Cap.ROUND);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
       drawingShape(canvas,(float) w, (float) h);
    }

    public void drawingShape(Canvas canvasDraw, float x, float y){
        float left = (getWidth()-x)/2;
        float top = (getHeight()-y)/2;
        canvasDraw.drawRect(left, top, left+x, top+y,mDrawing);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            if(x>=(getWidth()-w)/2 && y>=(getHeight()-h)/2 && x<=(getWidth()-w)/2 +w  && y<=(getHeight()-h)/2+h) {
                mDrawing.setColor(Color.YELLOW);
                invalidate();
            }
            return true;
        }
        return super.onTouchEvent(event);
    }
}
