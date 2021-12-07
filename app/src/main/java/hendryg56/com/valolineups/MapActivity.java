package hendryg56.com.valolineups;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity {

    RecyclerView Map_View;
    String hero_name;
    ArrayList<Map> maps = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Map_View = findViewById(R.id.map_rv_view);

        Map ascent = new Map("Ascent", R.drawable.ascent);
        maps.add(ascent);
        Map bind = new Map("Bind", R.drawable.bind);
        maps.add(bind);
        Map icebox = new Map("Split", R.drawable.split);
        maps.add(icebox);

        Intent intent = getIntent();
        hero_name = intent.getStringExtra("Hero Name");

        MapAdapter mapAdapter = new MapAdapter(this);
        mapAdapter.setHeroname(hero_name);
        mapAdapter.setMaps(maps);

        Map_View.setAdapter(mapAdapter);
        Map_View.setLayoutManager(new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false));

//        Toast.makeText(this, hero_name, Toast.LENGTH_SHORT).show();
    }
}