package hendryg56.com.valolineups;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class LineUpsActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView lineups_view;
    String lineups_hero_name;
    String lineups_map_name;
    String lineups_strategy_name;
    String lineups_site_name;
    ArrayList<LineUps> lineUps = new ArrayList<>();

    ImageButton home_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_ups);

        home_button = findViewById(R.id.home_button);
        home_button.setOnClickListener(this);

        Intent intent = getIntent();
        lineups_hero_name = intent.getStringExtra("Hero_Name_Go_LineUps");
        lineups_map_name = intent.getStringExtra("Map_Name_Go__LineUps");
        lineups_strategy_name = intent.getStringExtra("Strategy_Go_LineUps");
        lineups_site_name = intent.getStringExtra("Site_Go_LineUps");

        Toast.makeText(this, lineups_hero_name + " " + lineups_map_name + " " + lineups_strategy_name + " " + lineups_site_name, Toast.LENGTH_SHORT).show();

        if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Sova A Main");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Sova Boiler Scan");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Sova Lion Scan");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Sova B Main");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Sova B Shop");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Sova B Market");
            lineUps.add(lineUps_sova_3);
        }

        lineups_view = findViewById(R.id.lineups_rv_view);

        LineUpsAdapter lineUpsAdapter = new LineUpsAdapter(this);
        lineUpsAdapter.setLineUps(lineUps);

        lineups_view.setAdapter(lineUpsAdapter);
        lineups_view.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.home_button) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Clear stack sebelum MainActivity
            startActivity(intent);
        }
    }
}