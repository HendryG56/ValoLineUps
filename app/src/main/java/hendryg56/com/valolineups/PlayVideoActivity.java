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
                if(lineups_name.equals("Heaven Garden S")){
                    youTubePlayer.loadVideo("GhVPIG103Yg");
                }
                else if(lineups_name.equals("Information Arrow S")){
                    youTubePlayer.loadVideo("jWpeKhkuZFM");
                }
                else if(lineups_name.equals("Long Control S")){
                    youTubePlayer.loadVideo("3MkO2bYnEzk");
                }
                else if(lineups_name.equals("Close Corner S")){
                    youTubePlayer.loadVideo("xpVJMoJPNM0");
                }
                else if(lineups_name.equals("Easy Information S")){
                    youTubePlayer.loadVideo("Tbb3_Wwz9yg");
                }
                else if(lineups_name.equals("Spawn & Stair S")){
                    youTubePlayer.loadVideo("bjL9jIBl17k");
                }
                else if(lineups_name.equals("Heaven Rafters S")){
                    youTubePlayer.loadVideo("EU-fIiw-SIE");
                }
                else if(lineups_name.equals("Long Retake S")){
                    youTubePlayer.loadVideo("JJxhZqMc03A");
                }
                else if(lineups_name.equals("Under Rafters S")){
                    youTubePlayer.loadVideo("4XJbc7de7zQ");
                }
                else if(lineups_name.equals("Back Site S")){
                    youTubePlayer.loadVideo("6YzqUe6yoaw");
                }
                else if(lineups_name.equals("Main Arrow S")){
                    youTubePlayer.loadVideo("6Ai3rC6W3NA");
                }
                else if(lineups_name.equals("Main Wallbang S")){
                    youTubePlayer.loadVideo("3H5bgH1ZY8Q");
                }
                else if(lineups_name.equals("Front Site S")){
                    youTubePlayer.loadVideo("PxKV0D54Ik4");
                }
                else if(lineups_name.equals("Operator Peek S")){
                    youTubePlayer.loadVideo("yHS3HjY3dEY");
                }
                else if(lineups_name.equals("Shower Control S")){
                    youTubePlayer.loadVideo("4DVb22UytYU");
                }
                else if(lineups_name.equals("Hookah Info S")){
                    youTubePlayer.loadVideo("Y8vjYgNAYtk");
                }
                else if(lineups_name.equals("Long Control BAS")){
                    youTubePlayer.loadVideo("bMF712RRU8A");
                }
                else if(lineups_name.equals("Main Teleport S")){
                    youTubePlayer.loadVideo("wKapAUTzBA8");
                }
                else if(lineups_name.equals("Long Shower S")){
                    youTubePlayer.loadVideo("MZKQS8QLbVE");
                }
                else if(lineups_name.equals("Short Control BAS")){
                    youTubePlayer.loadVideo("OHN8iaFsvU0");
                }
                else if(lineups_name.equals("Site Rush S")){
                    youTubePlayer.loadVideo("Px58qHiDEdI");
                }
                else if(lineups_name.equals("Lobby Short S")){
                    youTubePlayer.loadVideo("eM_nL_RgWqU");
                }
                else if(lineups_name.equals("Long Control BBS")){
                    youTubePlayer.loadVideo("EF2cwKBwpE8");
                }
                else if(lineups_name.equals("Short Control BBS")){
                    youTubePlayer.loadVideo("-xrs5MDa6Rc");
                }
                else if(lineups_name.equals("Main Scan S")){
                    youTubePlayer.loadVideo("FF2-TlwfJRc");
                }
                else if(lineups_name.equals("Site Scan SAS")){
                    youTubePlayer.loadVideo("oI9yJ8q3kCs");
                }
                else if(lineups_name.equals("Stair S")){
                    youTubePlayer.loadVideo("VHQ_uus9ciM");
                }
                else if(lineups_name.equals("Heaven Scan S")){
                    youTubePlayer.loadVideo("qBMbZLqDzvU");
                }
                else if(lineups_name.equals("Heaven Walk S")){
                    youTubePlayer.loadVideo("YGnV9DeKqg0");
                }
                else if(lineups_name.equals("Site Scan SBS")){
                    youTubePlayer.loadVideo("MZFhIIdWC7E");
                }
                else if(lineups_name.equals("Main Site SAS")){
                    youTubePlayer.loadVideo("FF2-TlwfJRc");
                }
                else if(lineups_name.equals("Short Board S")){
                    youTubePlayer.loadVideo("oI9yJ8q3kCs");
                }
                else if(lineups_name.equals("Short Pole S")){
                    youTubePlayer.loadVideo("VHQ_uus9ciM");
                }
                else if(lineups_name.equals("Lobby Link S")){
                    youTubePlayer.loadVideo("qBMbZLqDzvU");
                }
                else if(lineups_name.equals("Lobby SBS")){
                    youTubePlayer.loadVideo("YGnV9DeKqg0");
                }
                else if(lineups_name.equals("Main Site SBS")){
                    youTubePlayer.loadVideo("MZFhIIdWC7E");
                }
                else if(lineups_name.equals("Back Generator K")){
                    youTubePlayer.loadVideo("V14Tf2fkees");
                }
                else if(lineups_name.equals("Double Boxes K")){
                    youTubePlayer.loadVideo("ekykWiKfIzI");
                }
                else if(lineups_name.equals("Front Generator K")){
                    youTubePlayer.loadVideo("LjrAtkF2FE");
                }
                else if(lineups_name.equals("Back Logs K")){
                    youTubePlayer.loadVideo("-wTlHOH52xo");
                }
                else if(lineups_name.equals("Stair K")){
                    youTubePlayer.loadVideo("i__wqJ3xQFA");
                }
                else if(lineups_name.equals("Triple Box AK")){
                    youTubePlayer.loadVideo("jV4e24RGKaE");
                }
                else if(lineups_name.equals("Double Box K")){
                    youTubePlayer.loadVideo("KWYHua3IKFY");
                }
                else if(lineups_name.equals("Front Gen K")){
                    youTubePlayer.loadVideo("rDhWHwooLP8");
                }
                else if(lineups_name.equals("Wine K")){
                    youTubePlayer.loadVideo("7o4fTpWmu6E");
                }
                else if(lineups_name.equals("Back Site K")){
                    youTubePlayer.loadVideo("twEnGE3MtG4");
                }
                else if(lineups_name.equals("Corner K")){
                    youTubePlayer.loadVideo("0ooYmZtOj1Y");
                }
                else if(lineups_name.equals("Triple Box BK")){
                    youTubePlayer.loadVideo("BnpJKloQ-ts");
                }
                youTubePlayer.setFullscreen(true);
                youTubePlayer.play();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(PlayVideoActivity.this, "Video Fail to Play", Toast.LENGTH_SHORT).show();
            }
        });


    }
}