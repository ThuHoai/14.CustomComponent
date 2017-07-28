package com.example.hoaiktt.customcomponent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hoaiktt on 7/28/2017.
 */

public class ColoredView extends View {
    private Paint mCanvasPaint;

    public ColoredView(Context context) {
        super(context);
    }

    public ColoredView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setUpDrawing();
    }

    private void setUpDrawing() {
        mCanvasPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mCanvasPaint.setColor(Color.RED);
        mCanvasPaint.setStrokeWidth(2);
        mCanvasPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    public void setColor(String currColor){
        mCanvasPaint.setColor(Color.parseColor(currColor));
        invalidate();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawingShape(canvas, 800, 800);
    }

    public void drawingShape(Canvas canvasDraw, float x, float y) {
        float left = (getWidth() - x) / 2;
        float top = (getHeight() - y) / 2;
        canvasDraw.drawRect(left, top, left + x, top + y, mCanvasPaint);
    }

}
