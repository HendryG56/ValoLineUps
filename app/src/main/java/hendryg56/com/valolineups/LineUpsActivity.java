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

//        Toast.makeText(this, lineups_hero_name + " " + lineups_map_name + " " + lineups_strategy_name + " " + lineups_site_name, Toast.LENGTH_SHORT).show();

        if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Heaven Garden S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Information Arrow S");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Long Control S");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Close Corner S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Easy Information S");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Spawn & Stair S");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Heaven Rafters S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Long Retake S");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Under Rafters S");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Back Site S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Main Arrow S");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Main Wallbang S");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Front Site S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Operator Peek S");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Shower Control S");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Hookah Info S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Long Control BAS");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Main Teleport S");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Long Shower S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Short Control BAS");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Site Rush S");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Lobby Short S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Long Control BBS");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Short Control BBS");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Main Scan S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Site Scan SAS");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Stair S");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Heaven Scan S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Heaven Walk S");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Site Scan SBS");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Main Site SAS");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Short Board S");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Short Pole S");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Sova")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Lobby Link S");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Lobby SBS");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Main Site SBS");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Back Generator K");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Double Boxes K");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Front Generator K");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Back Logs K");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Stair K");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Triple Box AK");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Double Box K");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Front Gen K");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Wine K");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Back Site K");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Corner K");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Triple Box BK");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Tank Plant K");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Triple Box BAK");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("U Hall K");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Back Site BBK");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Box Plant BBK");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Hallway Control K");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Short Corner BAK");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Site Corner BAK");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Triple Box BAKD");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Link Rush K");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Long Corner K");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Plant Stopper K");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Safe Site SK");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Site Corner SK");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("TV POST SK");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Heaven to Site K");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Main to Site K");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Site New Plant K");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Heaven Corner Left K");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Heaven Corner Right K");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Heaven To TV K");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Killjoy")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Alley to Site K");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Main Stopper K");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Under H to S K");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Catwalk FGen BR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Double Boxes BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Front Generator BR");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Tall Box BR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Triple Box BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Triple Box Main BR");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Back Gen BR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Double Box BRD");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Front Generator BRD");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Ascent")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Back Site BRD");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Corner BRD");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Triple Box BRD");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Generator Short BR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Triple Box Short BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Triple Box BRB");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Box Long BR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Box Short BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Box Teleport BR");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Plant Stopper BR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Short Corner BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Triple Box BBRD");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Bind")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Link BR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Long Stop BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Short Stop BR");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Heaven ABR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Site Planted BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Stair BR");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Attacking")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Alley BR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Back Site BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Heaven BBR");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("A Site"))){
            LineUps lineUps_sova_1 = new LineUps("Lobby Corner BR");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Main Stair BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("TV Post BR");
            lineUps.add(lineUps_sova_3);
        }
        else if((lineups_hero_name.equals("Brimstone")) && (lineups_map_name.equals("Split")) && (lineups_strategy_name.equals("Defending")) && (lineups_site_name.equals("B Site"))){
            LineUps lineUps_sova_1 = new LineUps("Back Site BRS");
            lineUps.add(lineUps_sova_1);
            LineUps lineUps_sova_2 = new LineUps("Main Plant BR");
            lineUps.add(lineUps_sova_2);
            LineUps lineUps_sova_3 = new LineUps("Under Heaven BR");
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