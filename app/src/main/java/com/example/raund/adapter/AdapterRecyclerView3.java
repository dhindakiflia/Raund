package com.example.raund.adapter;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        //import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.example.raund.R;
        import com.example.raund.itemhome;

        import java.util.ArrayList;

public class AdapterRecyclerView3 extends RecyclerView.Adapter<AdapterRecyclerView3.ViewHolder> {

    private ArrayList<itemhome> dataItem;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageIcon;

        ViewHolder(View v) {
            super(v);
            imageIcon = v.findViewById(R.id.image);
        }
    }

    AdapterRecyclerView3(ArrayList<itemhome> data) {
        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterRecyclerView3.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_home, parent, false);
        //myonClickListener
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ImageView imageIcon = holder.imageIcon;
        imageIcon.setImageResource(dataItem.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }
}
