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
        TextView nama_travel, nama_mobil, tanggal_travel, available, harga_travel;
        CardView cvTravelList;
        public KelasViewHolder(@NonNull View itemView){
            super(itemView);
            nama_travel = itemView.findViewById(R.id.nama_travel);
            nama_mobil = itemView.findViewById(R.id.nama_mobil);
            tanggal_travel = itemView.findViewById(R.id.tanggal_travel);
            available = itemView.findViewById(R.id.available);
            harga_travel = itemView.findViewById(R.id.harga_travel);
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

        holder.nama_travel.setText(travelList.nama_travel);
        holder.nama_mobil.setText(travelList.nama_mobil);
        holder.tanggal_travel.setText(travelList.tanggal_travel);
        holder.available.setText(travelList.available);
        holder.harga_travel.setText(travelList.harga_travel);

    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }


}
