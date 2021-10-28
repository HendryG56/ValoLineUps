package hendryg56.com.valolineups;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LineUpsAdapter extends RecyclerView.Adapter<LineUpsAdapter.LineUpsViewHolder> {

    Context cntx;
    private ArrayList<LineUps> lineUps;
    private String lineups_name;

    public LineUpsAdapter(Context cntx) {
        this.cntx = cntx;
    }

    public void setLineUps(ArrayList<LineUps> lineUps) {
        this.lineUps = lineUps;
    }

    @NonNull
    @Override
    public LineUpsAdapter.LineUpsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(cntx).inflate(R.layout.lineups_recycle_view, parent, false);
        return new LineUpsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LineUpsAdapter.LineUpsViewHolder holder, int position) {
        holder.lineupsname.setText(lineUps.get(position).getLineupsname());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lineups_name = lineUps.get(position).getLineupsname();
                Intent intent = new Intent(cntx, PlayVideoActivity.class);
                intent.putExtra("LineUpsName", lineups_name);
                cntx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lineUps.size();
    }

    public class LineUpsViewHolder extends RecyclerView.ViewHolder{
        TextView lineupsname;
        public LineUpsViewHolder(@NonNull View itemView) {
            super(itemView);
            lineupsname = itemView.findViewById(R.id.lineupname);
        }
    }
}
