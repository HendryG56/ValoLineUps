package hendryg56.com.valolineups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SiteActivity extends AppCompatActivity {

    String site_hero_name;
    String site_map_name;
    String site_strategy_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);

        Intent intent = getIntent();
        site_hero_name = intent.getStringExtra("Hero_Name_Go");
        site_map_name = intent.getStringExtra("Map_Name_Go");
        site_strategy_name = intent.getStringExtra("Strategy_Go");

        Toast.makeText(this, site_hero_name + " " + site_map_name + " " + site_strategy_name, Toast.LENGTH_SHORT).show();
    }

    public void A_Site(View view) {
        Intent intent = new Intent(this, LineUpsActivity.class);
        intent.putExtra("Hero_Name_Go_LineUps", site_hero_name);
        intent.putExtra("Map_Name_Go__LineUps", site_map_name);
        intent.putExtra("Strategy_Go_LineUps", site_strategy_name);
        intent.putExtra("Site_Go_LineUps", "A Site");
        startActivity(intent);
    }

    public void B_Site(View view) {
        Intent intent = new Intent(this, LineUpsActivity.class);
        intent.putExtra("Hero_Name_Go_LineUps", site_hero_name);
        intent.putExtra("Map_Name_Go__LineUps", site_map_name);
        intent.putExtra("Strategy_Go_LineUps", site_strategy_name);
        intent.putExtra("Site_Go_LineUps", "B Site");
        startActivity(intent);
    }
}