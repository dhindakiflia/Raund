package com.example.raund.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raund.R;
import com.example.raund.model.OnGoing;

import java.util.ArrayList;

public class OnGoingAdapterRecyclerView extends RecyclerView.Adapter<OnGoingAdapterRecyclerView.KelasViewHolder2>  {

    ArrayList<OnGoing> listdata = new ArrayList<>();

    public class KelasViewHolder2 extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView nama_travel_og, destinationDelivery_og, fromDelivery_og, tgl_departure_og, tgl_arrival_og, jam_datang_og, jam_pergi_og, harga_og;
    Button BtnReschedule;
    public KelasViewHolder2(@NonNull View itemView) {
        super(itemView);
        nama_travel_og = itemView.findViewById(R.id.nama_travel_og);
        fromDelivery_og = itemView.findViewById(R.id.fromDelivery_og);
        destinationDelivery_og = itemView.findViewById(R.id.destinationDelivery_og);
        tgl_departure_og = itemView.findViewById(R.id.tgl_departure_og);
        tgl_arrival_og = itemView.findViewById(R.id.tgl_arrival_og);
        jam_datang_og = itemView.findViewById(R.id.jam_datang_og);
        jam_pergi_og = itemView.findViewById(R.id.jam_pergi_og);
        harga_og = itemView.findViewById(R.id.harga_og);
        BtnReschedule = itemView.findViewById(R.id.BtnReschedule);
        itemView.setOnClickListener(this);

    }
        @Override
        public void onClick(View view) {
            if (listener != null){
                listener.onClick(view, listdata.get(getAdapterPosition()));
            }
        }

    }

    public void setListdata(ArrayList<OnGoing> listdata) {

        this.listdata = listdata;
    }
    //Click Listener
    OnGoingAdapterRecyclerView.OnGoingClickListener listener = null;
    public interface OnGoingClickListener {
        void onClick(View view, OnGoing onGoing);
    }
    public void setListener(OnGoingAdapterRecyclerView.OnGoingClickListener listener) {
        this.listener = listener;
    }


    @NonNull
    @Override

    public OnGoingAdapterRecyclerView.KelasViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_ongoing,parent,false);
        return new OnGoingAdapterRecyclerView.KelasViewHolder2(view);

    }

    @Override
    public void onBindViewHolder(@NonNull KelasViewHolder2 holder, int position) {
        OnGoing ongoing = listdata.get(position);

        holder.nama_travel_og.setText(ongoing.nama_travel_og);
        holder.fromDelivery_og.setText(ongoing.fromDelivery_og);
        holder.destinationDelivery_og.setText(ongoing.destinationDelivery_og);
        holder.tgl_departure_og.setText(ongoing.tgl_departure_og);
        holder.tgl_arrival_og.setText(ongoing.tgl_arrival_og);
        holder.jam_datang_og.setText(ongoing.jam_datang_og);
        holder.jam_pergi_og.setText(ongoing.jam_pergi_og);
        holder.harga_og.setText(ongoing.harga_og);

    }

    @Override
    public int getItemCount(){

        return listdata.size();
    }
}










