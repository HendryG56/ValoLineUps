package hendryg56.com.valolineups;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MapAdapter extends RecyclerView.Adapter<MapAdapter.MapViewHolder> {

    Context cntx;
    private ArrayList<Map> maps;
    private String heroname;
    private String mapname;

    public MapAdapter(Context cntx) {
        this.cntx = cntx;
    }

    public void setMaps(ArrayList<Map> maps) {
        this.maps = maps;
    }

    public void setHeroname(String heroname) {
        this.heroname = heroname;
    }

    @NonNull
    @Override
    public MapAdapter.MapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(cntx).inflate(R.layout.map_recycle_view, parent, false);
        return new MapViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MapAdapter.MapViewHolder holder, int position) {

        holder.mapname.setText(maps.get(position).getMapName());
        holder.mapimage.setImageResource(maps.get(position).getMapImage());
        holder.mapcard.setBackgroundColor(Color.TRANSPARENT);
        holder.mapcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapname = maps.get(position).getMapName();
                Intent intent = new Intent(cntx, StrategyActivity.class);
                intent.putExtra("Hero_HMap_Name", heroname);
                intent.putExtra("HMap_Name", mapname);
                cntx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return maps.size();
    }

    public class MapViewHolder extends RecyclerView.ViewHolder{
        ImageView mapimage;
        TextView mapname;
        CardView mapcard;

        public MapViewHolder(@NonNull View itemView) {
            super(itemView);
            mapimage = itemView.findViewById(R.id.mapimage);
            mapname = itemView.findViewById(R.id.mapname);
            mapcard = itemView.findViewById(R.id.mapcard);
        }
    }
}
