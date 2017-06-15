package com.example.chulili.autosizetextview;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by chulili on 2017/4/25.
 */

public class AutoSizeTextview extends android.support.v7.widget.AppCompatTextView {
    public AutoSizeTextview(Context context) {
        super(context);
    }

    public AutoSizeTextview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoSizeTextview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
