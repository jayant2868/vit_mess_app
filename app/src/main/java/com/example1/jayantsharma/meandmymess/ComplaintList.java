package com.example1.jayantsharma.meandmymess;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ComplaintList extends ArrayAdapter<Complaints> {

    public Activity context;
    private List<Complaints>  complaintsList;

    public ComplaintList(Activity context, List<Complaints> complaintsList)
    {
        super(context,R.layout.list_layout,complaintsList);
        this.context= context;
        this.complaintsList = complaintsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater =  context.getLayoutInflater();

        View ListViewItem = inflater.inflate(R.layout.list_layout,null,true);
        TextView text1= (TextView) ListViewItem.findViewById(R.id.textView5);

        Complaints complaints= complaintsList.get(position);
         text1.setText(complaints.getRating());

         return  ListViewItem;
    }
}
