package hr.goodapp.loaderexample.loader;


import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

/**
 * Created by goransi on 12.2.2016..
 */
public class LoaderMain extends AsyncTaskLoader<Void> {

    public LoaderMain(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {

        forceLoad();
    }

    @Override
    public Void loadInBackground() {

        return null;
    }


    @Override
    protected void onReset() {
        Log.d(LoaderMain.class.getSimpleName(), "called onReset()");
    }
}
