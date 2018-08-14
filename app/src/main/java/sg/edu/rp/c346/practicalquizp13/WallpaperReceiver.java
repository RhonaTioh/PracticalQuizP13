package sg.edu.rp.c346.practicalquizp13;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 17010318 on 14/8/2018.
 */

public class WallpaperReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        String strOption = prefs.getString("option", "");
        Toast.makeText(context, strOption, Toast.LENGTH_LONG).show();
    }
}

