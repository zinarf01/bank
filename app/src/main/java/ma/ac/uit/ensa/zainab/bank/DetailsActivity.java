package ma.ac.uit.ensa.zainab.bank;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;


public class DetailsActivity extends AppCompatActivity {
    @BindView(R.id.butt)
    Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind (this);
        Bundle extras= getIntent().getExtras();
        String type = new String(((Bundle) extras).getString("type"));
        String price = new String(((Bundle) extras).getString("price"));
        String date = new String(((Bundle) extras).getString("date"));
        TextView t = (TextView) findViewById(R.id.t);
        TextView p = (TextView) findViewById(R.id.p);
        TextView d = (TextView) findViewById(R.id.d);
        t.setText(type);
        p.setText(price);
        d.setText(date);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Receiveer myrec = new Receiveer();
        IntentFilter filter = new IntentFilter("action_a");
        registerReceiver(myrec, filter);
    }

    @OnClick(R.id.butt)
        public void onListOperationClick(){
            /*Intent emaill = new Intent(android.content.Intent.ACTION_SEND);
            String[] recip = new String[]{"zaineb.rifi@gmail.com", "zainab.rifi@uit.ac.ma"};
            emaill.putExtra(Intent.EXTRA_EMAIL, recip);
            emaill.putExtra(Intent.EXTRA_SUBJECT, "subjects");
            emaill.putExtra(Intent.EXTRA_TEXT, "messages");
            emaill.setType("text/plain");
            startActivity(Intent.createChooser(emaill, "send mail..."));*/
        Intent monint = new Intent("action_a");
        monint.setAction("action_a");
        monint.putExtra("extra_key", "extra_value");
        sendBroadcast(monint);
        }

    @OnClick(R.id.tel)
    public void onListOperationClicked(){
        Uri tel = Uri.parse("tel:212613511908");
        Intent call = new Intent(Intent.ACTION_DIAL, tel);
        startActivity(call);
    }
}

