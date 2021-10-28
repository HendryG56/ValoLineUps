package hendryg56.com.valolineups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayVideoActivity extends AppCompatActivity {

    VideoView videoView;
    String lineups_name;
    String videopath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

        videoView = findViewById(R.id.lineups_video_view);

        Intent intent = getIntent();
        lineups_name = intent.getStringExtra("LineUpsName");

        if(lineups_name.equals("Sova A Main")){
            videopath =  "android.resource://" + getPackageName() + "/" + R.raw.sova_1;
        }


        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}