package com.example.assignment2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DEll1 on 10/15/2017.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ContactClass> contactClasses;
    private Context context;

    public MyAdapter(List<ContactClass> contactClasses, Context context) {
        this.contactClasses = contactClasses;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ContactClass contactClass = contactClasses.get(position);
        holder.textViewHead.setText(contactClass.getName());
        holder.textViewDesc.setText(contactClass.getPhone());

        Picasso.with(context).load(contactClass.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return contactClasses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewHead;
        public TextView textViewDesc;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewHead = (TextView)itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView)itemView.findViewById(R.id.phone);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
        }

    }
}
