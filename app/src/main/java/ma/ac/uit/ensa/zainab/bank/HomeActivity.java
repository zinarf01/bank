package ma.ac.uit.ensa.zainab.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.mylist)
    ListView listOp ;
    ArrayList<Operation> operations = new ArrayList<Operation>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind (this);

        operations.add(new Operation(R.drawable.call, "facture internet","299.00", "10/09/2018"));
        operations.add(new Operation(R.drawable.emission, "emission","5000.0",  "10/09/2018"));
        operations.add(new Operation(R.drawable.pourcentage, "paiement","2990.90",  "10/09/2018"));
        operations.add(new Operation(R.drawable.visa, "paiement par carte","200.90",  "10/09/2018"));
        operations.add(new Operation(R.drawable.dollar, "retrait especes","2990.90", "10/09/2018"));
        MyAdapter adapter;
        adapter = new MyAdapter(getApplicationContext(), R.layout.cellule, operations );
        listOp.setAdapter(adapter);
    }
    @OnItemClick(R.id.mylist)
    public void onListOperationClicked(int position){
        Intent intent= new Intent(HomeActivity.this, DetailsActivity.class);
        Operation op= operations.get(position);
        intent.putExtra("type", op.operation);
        intent.putExtra("price", op.price);
        intent.putExtra("date", op.price);
        startActivity(intent);
    }
}
