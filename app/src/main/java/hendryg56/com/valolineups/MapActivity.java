package hendryg56.com.valolineups;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity {

    ImageView btnAscent;
    ImageView btnBind;
    ImageView btnSplit;
    Intent pindah;
    RecyclerView Map_View;
    String hero_name;
    ArrayList<Map> maps = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        btnAscent = (ImageView)findViewById(R.id.btn_ascent);

        btnAscent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(MapActivity.this, TypeActivity.class);
                startActivity(pindah);
                finish();
            }
        });

        btnBind = (ImageView)findViewById(R.id.btn_bind);

        btnBind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(MapActivity.this, TypeActivity.class);
                startActivity(pindah);
                finish();
            }
        });

        btnSplit = (ImageView)findViewById(R.id.btn_split);

        btnSplit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(MapActivity.this, TypeActivity.class);
                startActivity(pindah);
                finish();
            }
        });



        Map ascent = new Map("Ascent");
        maps.add(ascent);
        Map bind = new Map("Bind");
        maps.add(bind);
        Map icebox = new Map("Icebox");
        maps.add(icebox);

        Intent intent = getIntent();
        hero_name = intent.getStringExtra("Hero Name");

        MapAdapter mapAdapter = new MapAdapter(this);
        mapAdapter.setHeroname(hero_name);
        mapAdapter.setMaps(maps);

        Map_View.setAdapter(mapAdapter);
        Map_View.setLayoutManager(new LinearLayoutManager(this));

        Toast.makeText(this, hero_name, Toast.LENGTH_SHORT).show();
    }
}