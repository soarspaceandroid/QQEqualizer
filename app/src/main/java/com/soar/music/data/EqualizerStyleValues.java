package com.soar.music.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaofei on 2016/12/21.
 */
public class EqualizerStyleValues {

    private static final Map<String , Float> close = new HashMap<>();
    private static final Map<String , Float> custom = new HashMap<>();
    private static final Map<String , Float> pupo = new HashMap<>();
    private static final Map<String , Float> dance = new HashMap<>();
    private static final Map<String , Float> blue = new HashMap<>();
    private static final Map<String , Float> layer = new HashMap<>();
    private static final Map<String , Float> sir = new HashMap<>();
    private static final Map<String , Float> slow = new HashMap<>();
    private static final Map<String , Float> elemusic = new HashMap<>();
    private static final Map<String , Float> rock = new HashMap<>();
    private static final Map<String , Float> contriy = new HashMap<>();


    public static Map<String , Float> getCloseStyleValue(){
        close.put("27" , 0f);
        close.put("55" , 0f);
        close.put("109" , 0f);
        close.put("219" , 0f);
        close.put("438" , 0f);
        close.put("875" , 0f);
        close.put("2k" , 0f);
        close.put("4k" , 0f);
        close.put("7k" , 0f);
        close.put("14k" , 0f);
        return close;
    }


    public static Map<String , Float> getCustomStyleValue(){
        custom.put("27" , 10f);
        custom.put("55" , 44f);
        custom.put("109" , 20f);
        custom.put("219" , 80f);
        custom.put("438" , 45f);
        custom.put("875" , 26f);
        custom.put("2k" , 60f);
        custom.put("4k" , 22f);
        custom.put("7k" , 62f);
        custom.put("14k" , 80f);
        return custom;
    }


    public static Map<String , Float> getPupoStyleValue(){
        pupo.put("27" , 80f);
        pupo.put("55" , 64f);
        pupo.put("109" , 10f);
        pupo.put("219" , 6f);
        pupo.put("438" , 45f);
        pupo.put("875" , 88f);
        pupo.put("2k" , 88f);
        pupo.put("4k" , 25f);
        pupo.put("7k" , 65f);
        pupo.put("14k" , 7f);
        return pupo;
    }


    public static Map<String , Float> getDanceStyleValue(){
        dance.put("27" , 45f);
        dance.put("55" , 50f);
        dance.put("109" , 22f);
        dance.put("219" , 77f);
        dance.put("438" , 3f);
        dance.put("875" , 75f);
        dance.put("2k" , 21f);
        dance.put("4k" , 55f);
        dance.put("7k" , 62f);
        dance.put("14k" , 25f);
        return dance;
    }


    public static Map<String , Float> getLayerStyleValue(){
        layer.put("27" , 70f);
        layer.put("55" , 50f);
        layer.put("109" , 50f);
        layer.put("219" , 60f);
        layer.put("438" , 3f);
        layer.put("875" , 90f);
        layer.put("2k" , 36f);
        layer.put("4k" , 90f);
        layer.put("7k" , 77f);
        layer.put("14k" , 20f);
        return layer;
    }


    public static Map<String , Float> getBlueStyleValue(){
        blue.put("27" , 20f);
        blue.put("55" , 53f);
        blue.put("109" , 52f);
        blue.put("219" , 30f);
        blue.put("438" , 52f);
        blue.put("875" , 2f);
        blue.put("2k" , 66f);
        blue.put("4k" , 10f);
        blue.put("7k" , 52f);
        blue.put("14k" , 44f);
        return blue;
    }

    public static Map<String , Float> getSirStyleValue(){
        sir.put("27" , 20f);
        sir.put("55" , 22f);
        sir.put("109" , 30f);
        sir.put("219" , 60f);
        sir.put("438" , 22f);
        sir.put("875" , 21f);
        sir.put("2k" , 88f);
        sir.put("4k" , 90f);
        sir.put("7k" , 25f);
        sir.put("14k" , 7f);
        return sir;
    }


    public static Map<String , Float> getSlowStyleValue(){
        slow.put("27" , 10f);
        slow.put("55" , 50f);
        slow.put("109" , 80f);
        slow.put("219" , 40f);
        slow.put("438" , 3f);
        slow.put("875" , 5f);
        slow.put("2k" , 66f);
        slow.put("4k" , 50f);
        slow.put("7k" , 3f);
        slow.put("14k" , 7f);
        return slow;
    }


    public static Map<String , Float> getElemusicStyleValue(){
        elemusic.put("27" , 50f);
        elemusic.put("55" , 50f);
        elemusic.put("109" , 80f);
        elemusic.put("219" , 50f);
        elemusic.put("438" , 3f);
        elemusic.put("875" , 5f);
        elemusic.put("2k" , 56f);
        elemusic.put("4k" , 90f);
        elemusic.put("7k" , 3f);
        elemusic.put("14k" , 70f);
        return elemusic;
    }



    public static Map<String , Float> getRockStyleValue(){
        rock.put("27" , 20f);
        rock.put("55" , 90f);
        rock.put("109" , 80f);
        rock.put("219" , 20f);
        rock.put("438" , 30f);
        rock.put("875" , 50f);
        rock.put("2k" , 26f);
        rock.put("4k" , 20f);
        rock.put("7k" , 30f);
        rock.put("14k" , 70f);
        return rock;
    }


    public static Map<String , Float> getContriyStyleValue(){
        contriy.put("27" , 20f);
        contriy.put("55" , 50f);
        contriy.put("109" , 80f);
        contriy.put("219" , 60f);
        contriy.put("438" , 3f);
        contriy.put("875" , 5f);
        contriy.put("2k" , 66f);
        contriy.put("4k" , 90f);
        contriy.put("7k" , 3f);
        contriy.put("14k" , 7f);
        return contriy;
    }





}
