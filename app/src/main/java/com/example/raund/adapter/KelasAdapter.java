package com.example.raund.adapter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.raund.R;
import com.example.raund.model.TravelList;
import com.bumptech.glide.request.RequestOptions;


import java.util.ArrayList;


public class KelasAdapter extends RecyclerView.Adapter<KelasAdapter.KelasViewHolder> {

    ArrayList<TravelList> listdata = new ArrayList<>();

    public class KelasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView namaTravel, namaMobil, jam_departure, kapasitas, travel_fee;
        ImageView gambar_travel;
        CardView cvTravelList;
        public KelasViewHolder(@NonNull View itemView){
            super(itemView);
            namaTravel = itemView.findViewById(R.id.nama_travel);
            namaMobil = itemView.findViewById(R.id.nama_mobil);
            jam_departure = itemView.findViewById(R.id.tanggal_travel);
            kapasitas = itemView.findViewById(R.id.available);
            travel_fee = itemView.findViewById(R.id.harga_travel);
            cvTravelList = itemView.findViewById(R.id.cvTravelList);
            gambar_travel =(ImageView) itemView.findViewById(R.id.gambar_travel);



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

        String file_name = travelList.gambar;
        String url = "http://raund.herokuapp.com/assets/" + file_name;

//        String load = url+file_name;
//        String img_path = travelList.gambar;
        String imageId = "imageId";
//        int resID = holder.itemView.getResources().getIdentifier(url , "drawable", "com.example.raund.adapter");

//        int resID = getContext().getIdentifier(url, "drawable", "package.name");


//        int imageResource = holder.itemView.getResources().getIdentifier(resourceId, null, "com.example.raund.adapter");
//        Drawable drawable = ContextCompat.getDrawable(ContextCompat., imageResource);
//        gambar_travel.setImageDrawable(drawable);

//        int resID = holder.itemView.getResources().getIdentifier(url, "drawable", "package.name");
//        int imageResource = holder.getResources().getIdentifier(resourceId, null, getPackageName());
//        int imageResource = view.getIdentifier(resourceId, null, getPackageName());



//        Bitmap bmp = BitmapFactory.decodeFile(img_path);
        String imgName = travelList.gambar; // specify here your image name fetched from db
        String uri = "drawable/" + imgName;
        holder.namaTravel.setText(travelList.nama_travel);
        holder.namaMobil.setText(travelList.nama_mobil);
        holder.jam_departure.setText(travelList.tanggal_travel);
        holder.kapasitas.setText(Integer.toString(travelList.available));
        holder.travel_fee.setText(Integer.toString(travelList.harga_travel));
        Glide.with(holder.itemView.getContext())
                .load(url)
                .into(holder.gambar_travel);


    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }


}