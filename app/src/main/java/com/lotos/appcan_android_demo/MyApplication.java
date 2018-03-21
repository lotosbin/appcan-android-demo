package com.lotos.appcan_android_demo;

import org.zywx.wbpalmstar.engine.AppCan;
import org.zywx.wbpalmstar.widgetone.WidgetOneApplication;

/**
 * Created by liubinbin on 21/03/2018.
 */

public class MyApplication extends WidgetOneApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        AppCan.getInstance().setWidgetSdk(true);
    }
}
