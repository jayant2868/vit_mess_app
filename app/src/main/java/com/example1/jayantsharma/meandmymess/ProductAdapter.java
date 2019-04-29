package com.example1.jayantsharma.meandmymess;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Product> productList;


    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout_student_list, null);
        return new ProductViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        //binding the data with the view holder views
        holder.textViewTitle.setText(product.getname());
        holder.textViewDesc.setText(product.getRegno());
        holder.textViewRating.setText(product.getBlock());
        holder.textViewPrice.setText(product.getMesstype());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public void filterlist(ArrayList<Product> filteredlist) {
        productList = filteredlist;
        notifyDataSetChanged();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewTitle, textViewDesc, textViewRating, textViewPrice;


        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
        }

    }

}

