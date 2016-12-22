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

    public final static String KEY_27 = "27";
    public final static String KEY_55 = "55";
    public final static String KEY_109 = "109";
    public final static String KEY_219 = "219";
    public final static String KEY_438 = "438";
    public final static String KEY_875 = "875";
    public final static String KEY_2k = "2k";
    public final static String KEY_4k = "4k";
    public final static String KEY_7k = "7k";
    public final static String KEY_14k = "14k";



    public static Map<String , Float> getCloseStyleValue(){
        close.put(KEY_27 , 50f);
        close.put(KEY_55 , 50f);
        close.put(KEY_109 , 50f);
        close.put(KEY_219 , 50f);
        close.put(KEY_438 , 50f);
        close.put(KEY_875 , 50f);
        close.put(KEY_2k , 50f);
        close.put(KEY_4k , 50f);
        close.put(KEY_7k , 50f);
        close.put(KEY_14k , 50f);
        return close;
    }


    public static Map<String , Float> getCustomStyleValue(){
        custom.put(KEY_27 , 10f);
        custom.put(KEY_55 , 44f);
        custom.put(KEY_109 , 20f);
        custom.put(KEY_219 , 80f);
        custom.put(KEY_438 , 45f);
        custom.put(KEY_875 , 26f);
        custom.put(KEY_2k , 60f);
        custom.put(KEY_4k , 22f);
        custom.put(KEY_7k , 62f);
        custom.put(KEY_14k , 80f);
        return custom;
    }


    public static Map<String , Float> getPupoStyleValue(){
        pupo.put(KEY_27 , 80f);
        pupo.put(KEY_55 , 64f);
        pupo.put(KEY_109 , 10f);
        pupo.put(KEY_219 , 6f);
        pupo.put(KEY_438 , 45f);
        pupo.put(KEY_875 , 88f);
        pupo.put(KEY_2k , 88f);
        pupo.put(KEY_4k , 25f);
        pupo.put(KEY_7k , 65f);
        pupo.put(KEY_14k , 7f);
        return pupo;
    }


    public static Map<String , Float> getDanceStyleValue(){
        dance.put(KEY_27 , 45f);
        dance.put(KEY_55 , 50f);
        dance.put(KEY_109 , 22f);
        dance.put(KEY_219 , 77f);
        dance.put(KEY_438 , 3f);
        dance.put(KEY_875 , 75f);
        dance.put(KEY_2k , 21f);
        dance.put(KEY_4k , 55f);
        dance.put(KEY_7k , 62f);
        dance.put(KEY_14k , 25f);
        return dance;
    }


    public static Map<String , Float> getLayerStyleValue(){
        layer.put(KEY_27 , 70f);
        layer.put(KEY_55 , 50f);
        layer.put(KEY_109 , 50f);
        layer.put(KEY_219 , 60f);
        layer.put(KEY_438 , 3f);
        layer.put(KEY_875 , 90f);
        layer.put(KEY_2k , 36f);
        layer.put(KEY_4k , 90f);
        layer.put(KEY_7k , 77f);
        layer.put(KEY_14k , 20f);
        return layer;
    }


    public static Map<String , Float> getBlueStyleValue(){
        blue.put(KEY_27 , 20f);
        blue.put(KEY_55 , 53f);
        blue.put(KEY_109 , 52f);
        blue.put(KEY_219 , 30f);
        blue.put(KEY_438 , 52f);
        blue.put(KEY_875 , 2f);
        blue.put(KEY_2k , 66f);
        blue.put(KEY_4k , 10f);
        blue.put(KEY_7k , 52f);
        blue.put(KEY_14k , 44f);
        return blue;
    }

    public static Map<String , Float> getSirStyleValue(){
        sir.put(KEY_27 , 20f);
        sir.put(KEY_55 , 22f);
        sir.put(KEY_109 , 30f);
        sir.put(KEY_219 , 60f);
        sir.put(KEY_438 , 22f);
        sir.put(KEY_875 , 21f);
        sir.put(KEY_2k , 88f);
        sir.put(KEY_4k , 90f);
        sir.put(KEY_7k , 25f);
        sir.put(KEY_14k , 7f);
        return sir;
    }


    public static Map<String , Float> getSlowStyleValue(){
        slow.put(KEY_27 , 10f);
        slow.put(KEY_55 , 50f);
        slow.put(KEY_109 , 80f);
        slow.put(KEY_219 , 40f);
        slow.put(KEY_438 , 3f);
        slow.put(KEY_875 , 5f);
        slow.put(KEY_2k , 66f);
        slow.put(KEY_4k , 50f);
        slow.put(KEY_7k , 3f);
        slow.put(KEY_14k , 7f);
        return slow;
    }


    public static Map<String , Float> getElemusicStyleValue(){
        elemusic.put(KEY_27 , 50f);
        elemusic.put(KEY_55 , 50f);
        elemusic.put(KEY_109 , 80f);
        elemusic.put(KEY_219 , 50f);
        elemusic.put(KEY_438 , 3f);
        elemusic.put(KEY_875 , 5f);
        elemusic.put(KEY_2k , 56f);
        elemusic.put(KEY_4k , 90f);
        elemusic.put(KEY_7k , 3f);
        elemusic.put(KEY_14k , 70f);
        return elemusic;
    }



    public static Map<String , Float> getRockStyleValue(){
        rock.put(KEY_27 , 20f);
        rock.put(KEY_55 , 90f);
        rock.put(KEY_109 , 80f);
        rock.put(KEY_219 , 20f);
        rock.put(KEY_438 , 30f);
        rock.put(KEY_875 , 50f);
        rock.put(KEY_2k , 26f);
        rock.put(KEY_4k , 20f);
        rock.put(KEY_7k , 30f);
        rock.put(KEY_14k , 70f);
        return rock;
    }


    public static Map<String , Float> getContriyStyleValue(){
        contriy.put(KEY_27 , 20f);
        contriy.put(KEY_55 , 50f);
        contriy.put(KEY_109 , 80f);
        contriy.put(KEY_219 , 60f);
        contriy.put(KEY_438 , 3f);
        contriy.put(KEY_875 , 5f);
        contriy.put(KEY_2k , 66f);
        contriy.put(KEY_4k , 90f);
        contriy.put(KEY_7k , 3f);
        contriy.put(KEY_14k , 7f);
        return contriy;
    }





}
