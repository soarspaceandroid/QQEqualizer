package com.soar.music.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import com.soar.music.data.EqualizerStyleValues;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaofei on 2016/12/20.
 */
public class LineView extends View {

    // 对应 bar 设置 均衡器的key
    private String[] keys = new String[]{EqualizerStyleValues.KEY_27, EqualizerStyleValues.KEY_55, EqualizerStyleValues.KEY_109, EqualizerStyleValues.KEY_219, EqualizerStyleValues.KEY_438, EqualizerStyleValues.KEY_875, EqualizerStyleValues.KEY_2k, EqualizerStyleValues.KEY_4k, EqualizerStyleValues.KEY_7k, EqualizerStyleValues.KEY_14k};


    private Map<String , Float> floatsY = new HashMap<>();
    private Map<String , Float> floatsX = new HashMap<>();

    private Path path = new Path();

    private Paint paint = new Paint();
    private float screenWidErevy = 0;
    private float maxProgressBar = 100f; // 与  progress bar 中的maxprogress 对应
    private final static  float SCALEVALUE = 1.2f; //波线 波放大倍数 放大的是 波 的高度


    public LineView(Context context) {
        super(context);
    }

    public LineView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }



    private void init(){
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(6);
        paint.setStyle(Paint.Style.STROKE);
        screenWidErevy = getResources().getDisplayMetrics().widthPixels/keys.length;
        for(int x = 1 ; x  <= keys.length ; x ++){
            floatsX.put(keys[x-1] , screenWidErevy * x);
        }
    }


    public void setData(Map<String , Float> floatList){
        try {
            if (floatList.size() != keys.length) {
                throw new ViewException("EqualizerProgressBar view is not match LineView , pls check this problem");
            }else{
                for(int i = 0 ; i < keys.length ; i ++){
                    float currentValue = floatList.get(keys[i]);
                    currentValue = maxProgressBar/2 - currentValue;
                    floatsY.put(keys[i] , currentValue * SCALEVALUE);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        invalidate();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        path.reset();
        canvas.drawPath(path , paint);

        path.moveTo(0 , getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_27)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_27)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_27) , floatsY.get(EqualizerStyleValues.KEY_27)+ (floatsY.get(EqualizerStyleValues.KEY_55) - floatsY.get(EqualizerStyleValues.KEY_27))/2+getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_55)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_55)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_55) , floatsY.get(EqualizerStyleValues.KEY_55)+ (floatsY.get(EqualizerStyleValues.KEY_109) - floatsY.get(EqualizerStyleValues.KEY_55))/2+getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_109)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_109)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_109) , floatsY.get(EqualizerStyleValues.KEY_109)+ (floatsY.get(EqualizerStyleValues.KEY_219) - floatsY.get(EqualizerStyleValues.KEY_109))/2+getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_219)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_219)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_219) , floatsY.get(EqualizerStyleValues.KEY_219)+ (floatsY.get(EqualizerStyleValues.KEY_438) - floatsY.get(EqualizerStyleValues.KEY_219))/2+getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_438)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_438)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_438) , floatsY.get(EqualizerStyleValues.KEY_438)+ (floatsY.get(EqualizerStyleValues.KEY_875) - floatsY.get(EqualizerStyleValues.KEY_438))/2+getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_875)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_875)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_875) , floatsY.get(EqualizerStyleValues.KEY_875)+ (floatsY.get(EqualizerStyleValues.KEY_2k) - floatsY.get(EqualizerStyleValues.KEY_875))/2+getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_2k)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_2k)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_2k) , floatsY.get(EqualizerStyleValues.KEY_2k)+ (floatsY.get(EqualizerStyleValues.KEY_4k) - floatsY.get(EqualizerStyleValues.KEY_2k))/2+getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_4k)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_4k)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_4k) , floatsY.get(EqualizerStyleValues.KEY_4k)+ (floatsY.get(EqualizerStyleValues.KEY_7k) - floatsY.get(EqualizerStyleValues.KEY_4k))/2+getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_7k)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_7k)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_7k) , floatsY.get(EqualizerStyleValues.KEY_7k)+ (floatsY.get(EqualizerStyleValues.KEY_14k) - floatsY.get(EqualizerStyleValues.KEY_7k))/2+getHeight()/2);
        path.quadTo(floatsX.get(EqualizerStyleValues.KEY_14k)- screenWidErevy/2 , floatsY.get(EqualizerStyleValues.KEY_14k)+getHeight()/2, floatsX.get(EqualizerStyleValues.KEY_14k) , floatsY.get(EqualizerStyleValues.KEY_14k)+ (getHeight()/2 - floatsY.get(EqualizerStyleValues.KEY_14k))/2+getHeight()/4);
        canvas.drawPath(path , paint);
    }
}
