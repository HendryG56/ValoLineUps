package hendryg56.com.valolineups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class PlayVideoActivity extends YouTubeBaseActivity {

    YouTubePlayerView ytvideo;
    String lineups_name;
    String videopath;
    String api_key = "AIzaSyA0NP8gMBCqQ7oTEChkq9WuXC5fGlk0tHg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

        ytvideo = findViewById(R.id.lineups_video_view);

        Intent intent = getIntent();
        lineups_name = intent.getStringExtra("LineUpsName");

        ytvideo.initialize(api_key, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if(lineups_name.equals("Sova A Main")){
                    youTubePlayer.loadVideo("k8l4oOo38uY");
                    youTubePlayer.play();
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(PlayVideoActivity.this, "Video Fail to Play", Toast.LENGTH_SHORT).show();
            }
        });


    }
}