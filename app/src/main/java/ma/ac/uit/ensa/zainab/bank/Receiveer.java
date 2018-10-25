package ma.ac.uit.ensa.zainab.bank;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Receiveer extends BroadcastReceiver {
    @Override
    public void onReceive (Context context, Intent intent ){
        Bundle extra = intent.getExtras();

        if (extra != null){
            String val = extra.getString("extra");
            Toast.makeText(context, "recu"+ val , Toast.LENGTH_SHORT).show();
        }
    }
}
