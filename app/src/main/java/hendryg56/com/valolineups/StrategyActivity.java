package hendryg56.com.valolineups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class StrategyActivity extends AppCompatActivity {

    String strategy_hero_name;
    String strategy_map_name;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);

        imageButton = findViewById(R.id.imgBtnHome);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { imgBtn(); }
        });

        Intent intent = getIntent();
        strategy_hero_name = intent.getStringExtra("Hero_HMap_Name");
        strategy_map_name = intent.getStringExtra("HMap_Name");

//        Toast.makeText(this, strategy_hero_name + " " + strategy_map_name, Toast.LENGTH_SHORT).show();
    }

    public void attacking(View view) {
        Intent intent = new Intent(this, SiteActivity.class);
        intent.putExtra("Hero_Name_Go", strategy_hero_name);
        intent.putExtra("Map_Name_Go", strategy_map_name);
        intent.putExtra("Strategy_Go", "Attacking");
        startActivity(intent);
    }

    public void defending(View view) {
        Intent intent = new Intent(this, SiteActivity.class);
        intent.putExtra("Hero_Name_Go", strategy_hero_name);
        intent.putExtra("Map_Name_Go", strategy_map_name);
        intent.putExtra("Strategy_Go", "Defending");
        startActivity(intent);

    }
    public void imgBtn() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}