package com.soar.music.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaofei on 2016/12/20.
 */
public class LineView extends View {

    // 对应 bar 设置 均衡器的key
    private String[] keys = new String[]{"27" , "55", "109", "219", "438", "875", "2k", "4k", "7k", "14k"};


    private Map<String , Float> floatsY = new HashMap<>();
    private Map<String , Float> floatsX = new HashMap<>();

    private Path path = new Path();

    private Paint paint = new Paint();
    private float screenWidErevy = 0;


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
                floatsY = floatList;
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
        path.quadTo(floatsX.get("27")- screenWidErevy/2 , floatsY.get("27")+getHeight()/2, floatsX.get("27") , floatsY.get("27")+ (floatsY.get("55") - floatsY.get("27"))/2+getHeight()/2);
        path.quadTo(floatsX.get("55")- screenWidErevy/2 , floatsY.get("55")+getHeight()/2, floatsX.get("55") , floatsY.get("55")+ (floatsY.get("109") - floatsY.get("55"))/2+getHeight()/2);
        path.quadTo(floatsX.get("109")- screenWidErevy/2 , floatsY.get("109")+getHeight()/2, floatsX.get("109") , floatsY.get("109")+ (floatsY.get("219") - floatsY.get("109"))/2+getHeight()/2);
        path.quadTo(floatsX.get("219")- screenWidErevy/2 , floatsY.get("219")+getHeight()/2, floatsX.get("219") , floatsY.get("219")+ (floatsY.get("438") - floatsY.get("219"))/2+getHeight()/2);
        path.quadTo(floatsX.get("438")- screenWidErevy/2 , floatsY.get("438")+getHeight()/2, floatsX.get("438") , floatsY.get("438")+ (floatsY.get("875") - floatsY.get("438"))/2+getHeight()/2);
        path.quadTo(floatsX.get("875")- screenWidErevy/2 , floatsY.get("875")+getHeight()/2, floatsX.get("875") , floatsY.get("875")+ (floatsY.get("2k") - floatsY.get("875"))/2+getHeight()/2);
        path.quadTo(floatsX.get("2k")- screenWidErevy/2 , floatsY.get("2k")+getHeight()/2, floatsX.get("2k") , floatsY.get("2k")+ (floatsY.get("4k") - floatsY.get("2k"))/2+getHeight()/2);
        path.quadTo(floatsX.get("4k")- screenWidErevy/2 , floatsY.get("4k")+getHeight()/2, floatsX.get("4k") , floatsY.get("4k")+ (floatsY.get("7k") - floatsY.get("4k"))/2+getHeight()/2);
        path.quadTo(floatsX.get("7k")- screenWidErevy/2 , floatsY.get("7k")+getHeight()/2, floatsX.get("7k") , floatsY.get("7k")+ (floatsY.get("14k") - floatsY.get("7k"))/2+getHeight()/2);
        path.quadTo(floatsX.get("14k")- screenWidErevy/2 , floatsY.get("14k")+getHeight()/2, floatsX.get("14k") , floatsY.get("14k")+ (getHeight()/2 - floatsY.get("14k"))/2+getHeight()/2);
        canvas.drawPath(path , paint);
    }
}
