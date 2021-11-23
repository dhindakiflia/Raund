package com.example.raund.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.raund.R;
import com.example.raund.model.History;
import java.util.ArrayList;

public class AdapterRecylerView extends RecyclerView.Adapter<AdapterRecylerView.KelasViewHolder> {

    ArrayList<History> listdata = new ArrayList<>();

    public class KelasViewHolder extends RecyclerView.ViewHolder{
        TextView nama_travelh,
                destinationDelivery,
                fromDelivery,
                tgl_departure2,
                tgl_arrival2,
                jam_datang2,
                jam_pergi2,
                harga2;

        public KelasViewHolder(@NonNull View itemView) {
            super(itemView);
            nama_travelh = itemView.findViewById(R.id.nama_travelh);
            fromDelivery = itemView.findViewById(R.id.fromDelivery);
            destinationDelivery = itemView.findViewById(R.id.destinationDelivery);
            tgl_departure2 = itemView.findViewById(R.id.tgl_departure2);
            tgl_arrival2 = itemView.findViewById(R.id.tgl_arrival2);
            jam_datang2 = itemView.findViewById(R.id.jam_datang2);
            jam_pergi2 = itemView.findViewById(R.id.jam_pergi2);
            harga2 = itemView.findViewById(R.id.harga2);
    }


    }
    public void setListdata(ArrayList<History> listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override

    public  KelasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_history,parent,false);
        return new KelasViewHolder(view);

    }

    @Override
    public void onBindViewHolder(KelasViewHolder holder, int position){
        History history = listdata.get(position);
        holder.nama_travelh.setText(history.nama_travelh);
        holder.fromDelivery.setText(history.fromDelivery);
        holder.destinationDelivery.setText(history.destinationDelivery);
        holder.tgl_departure2.setText(history.tgl_departure2);
        holder.tgl_arrival2.setText(history.tgl_arrival2);
        holder.jam_datang2.setText(history.jam_datang2);
        holder.jam_pergi2.setText(history.jam_pergi2);
        holder.harga2.setText(history.harga2);

    }

    @Override
    public int getItemCount(){

    return listdata.size();
    }
}


