package net.brothas.slashdotnotifier;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by gj on 13/05/15.'
 *
 * Hur får man den att starta direkt när man installerat den?
 */
public class BootReceiver extends BroadcastReceiver {

    AlarmReceiver alarmReceiver = new AlarmReceiver();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("SlashdotNotifier", "BootReceiver got intent: " + intent);
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {

            alarmReceiver.setAlarm(context);

        }
    }
}
