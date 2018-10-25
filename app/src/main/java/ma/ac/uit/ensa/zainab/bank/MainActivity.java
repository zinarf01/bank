package ma.ac.uit.ensa.zainab.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText login;
    EditText password;
    Button sign_in;
    TextView alert;

    private void validate ( String log , String pass ){
        if ((log.equals("zainab")) && (pass.equals("zainab"))){
            Intent intent= new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        } else {
            alert.setText("erreur");

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = (EditText) findViewById(R.id.password);
        sign_in = (Button) findViewById(R.id.sign_in);
        login = (EditText) findViewById(R.id.login);
        Intent monint = new Intent("action_a");
        monint.setAction("actionn");
        monint.putExtra("extra_key", "extra_value");
        sendBroadcast(monint);
        TextWatcher test = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String loginInput = login.getText().toString().trim();
                String passwordInput = password.getText().toString().trim();
                sign_in.setEnabled(!loginInput.isEmpty() && !passwordInput.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        };
        login.addTextChangedListener(test);
        password.addTextChangedListener(test);
        sign_in.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                validate(login.getText().toString().trim(),password.getText().toString().trim());
            }
        });
    }
}