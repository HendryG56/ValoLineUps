package hendryg56.com.valolineups;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {

    private Context cntx;
    private ArrayList<Hero> heroes;
    private String heroname;

    public HeroAdapter(Context cntx) {
        this.cntx = cntx;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    @NonNull
    @Override
    public HeroAdapter.HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(cntx).inflate(R.layout.hero_recycle_view, parent, false);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroAdapter.HeroViewHolder holder, int position) {
        holder.heroimage.setImageResource(heroes.get(position).getImgSource());
        holder.heroname.setText(heroes.get(position).getHeroname());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heroname = heroes.get(position).getHeroname();
                Intent intent = new Intent(cntx, MapActivity.class);
                intent.putExtra("Hero Name", heroname);
                cntx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public class HeroViewHolder extends RecyclerView.ViewHolder{
        ImageView heroimage;
        TextView heroname;
        public HeroViewHolder(@NonNull View itemView) {
            super(itemView);
            heroimage = itemView.findViewById(R.id.hero_image);
            heroname = itemView.findViewById(R.id.hero_name);
        }
    }
}
