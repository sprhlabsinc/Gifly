package info.gifly;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class GiflyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
