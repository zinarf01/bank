package ma.ac.uit.ensa.zainab.bank;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {
    private ArrayList<Operation> operations;
    public MyAdapter(Context context, int ressource, ArrayList<Operation> operations){
        super(context, ressource, operations);
        this.operations = operations;
    }

    @NonNull
    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(getContext().LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.cellule, parent, false);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.cover);
        imageView.setBackgroundResource(operations.get(position).getImageID());

        TextView textView = (TextView) convertView.findViewById(R.id.title);
        textView.setText(operations.get(position).getOperation());

        TextView textView1 = (TextView) convertView.findViewById(R.id.price);
        textView1.setText(operations.get(position).getPrice());

        TextView textView2 = (TextView) convertView.findViewById(R.id.date);
        textView2.setText(operations.get(position).getDate());
        return convertView;
    }

}
