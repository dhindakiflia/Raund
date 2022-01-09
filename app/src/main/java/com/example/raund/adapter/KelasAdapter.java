package com.example.raund.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raund.R;
import com.example.raund.model.TravelList;

import java.util.ArrayList;


public class KelasAdapter extends RecyclerView.Adapter<KelasAdapter.KelasViewHolder> {

    ArrayList<TravelList> listdata = new ArrayList<>();

    public class KelasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView namaTravel, namaMobil, jamDeparture, kapasitas, travelFee, deliveryFee;
        CardView cvTravelList;
        public KelasViewHolder(@NonNull View itemView){
            super(itemView);
            namaTravel = itemView.findViewById(R.id.nama_travel);
            namaMobil = itemView.findViewById(R.id.namaTravelDelivery);
            jamDeparture = itemView.findViewById(R.id.jam_departure);
            kapasitas = itemView.findViewById(R.id.available);
            travelFee = itemView.findViewById(R.id.harga_travel);
            deliveryFee = itemView.findViewById(R.id.harga_delivery);
            cvTravelList = itemView.findViewById(R.id.cvTravelList);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            if (listener != null) {
                listener.onClick(view, listdata.get(getAdapterPosition()));
            }
        }
    }

    public void setListdata(ArrayList<TravelList> listdata) {
        this.listdata = listdata;
        notifyDataSetChanged();

    }

    //Click Listener
    OnKelasAdapterClickListener listener = null;
    public interface OnKelasAdapterClickListener{
        void onClick(View view, TravelList travelList);
    }
    public void setListener(OnKelasAdapterClickListener listener) {
        this.listener = listener;
    }


    @NonNull
    @Override
    public KelasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_card_travel_list, parent, false );
        return new KelasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KelasViewHolder holder, int position) {
        TravelList travelList = listdata.get(position);

        holder.namaTravel.setText(travelList.nama_travel);
        holder.namaMobil.setText(travelList.nama_mobil);
        holder.jamDeparture.setText(travelList.jam_departure);
        holder.kapasitas.setText(Integer.toString(travelList.available));
        holder.travelFee.setText(Integer.toString(travelList.harga_travel));
        holder.deliveryFee.setText(Integer.toString(travelList.harga_delivery));
    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }


}