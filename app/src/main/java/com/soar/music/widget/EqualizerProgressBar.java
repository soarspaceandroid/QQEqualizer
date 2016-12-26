package com.soar.music.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/**
 * Created by gaofei on 2016/12/20.
 */
public class EqualizerProgressBar extends View {

    private final static int ANIM_DUR = 500;

    private Paint paint = new Paint();
    private float processValue = 50 ; //  default value
    private float maxProgress = 100;

    //UI
    private int barWidth = 5 ;
    private int innerCircleRedius = 20; // 内园大小
    private int outerCircleRedius = 25; //外圆大小
    private int innerCircleWidth = 10; // 内园 paint 宽度
    private int outerCirclewidth = 15; //外圆 paint 宽度


    private OnEqualizerProgressBarListener equalizerProgressBarListener;


    public EqualizerProgressBar(Context context) {
        super(context);
    }

    public EqualizerProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EqualizerProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.GRAY);
        paint.setAntiAlias(true);

        float position  = getHeight() -  getHeight() * processValue /maxProgress ;
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(barWidth);
        canvas.drawLine((getRight() - getLeft()) / 2 ,getHeight() , (getRight() - getLeft()) / 2 , position , paint);



        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(barWidth);
        canvas.drawLine((getRight() - getLeft()) / 2 ,position  , (getRight() - getLeft()) / 2 , 0 , paint);

        //绘制外园
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(innerCircleWidth);
        canvas.drawCircle((getRight() - getLeft()) / 2, position, outerCircleRedius, paint);

        //绘制内圆
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(outerCirclewidth);
        canvas.drawCircle((getRight() - getLeft()) / 2, position, innerCircleRedius, paint);
    }


    /**
     *  set progress
     * @param process
     */
    public void setProcessValue(float process) {
        float startProgress = processValue;
        ValueAnimator animator = ValueAnimator.ofFloat(startProgress , process);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                processValue = (float)animation.getAnimatedValue();
                invalidate();
                if(equalizerProgressBarListener != null) {
                    equalizerProgressBarListener.onVlaueChanged(processValue);
                }
            }
        });
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.setDuration(ANIM_DUR);
        animator.start();

    }


    /**
     * get process value
     * @return
     */
    public float getProcessValue(){
        return processValue;
    }


    /**
     * set equalizerProgressBarListener
     * @param listener
     */
    public void setOnEqualizerProgressBarListener(OnEqualizerProgressBarListener listener){
        equalizerProgressBarListener = listener;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_MOVE:
                float positionY = (getHeight() - event.getY() - getTop())* maxProgress/getHeight() ;
                processValue = positionY;
                if(processValue < 0 || processValue > 100){
                    return true;
                }
                invalidate();
                if(equalizerProgressBarListener != null){
                    equalizerProgressBarListener.onVlaueChanged(processValue);
                }
                break;
        }

        return true;
    }



    public interface OnEqualizerProgressBarListener{
        void onVlaueChanged(float value);
    }

}
