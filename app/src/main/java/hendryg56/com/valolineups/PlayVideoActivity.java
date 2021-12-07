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
                else if(lineups_name.equals("Tank Plant K")){
                    youTubePlayer.loadVideo("McO7_7eXao8");
                }
                else if(lineups_name.equals("Triple Box BAK")){
                    youTubePlayer.loadVideo("UsneYLA-qA4");
                }
                else if(lineups_name.equals("U Hall K")){
                    youTubePlayer.loadVideo("wt9b32BmRWs");
                }
                else if(lineups_name.equals("Back Site BBK")){
                    youTubePlayer.loadVideo("oh0MIq0hrsY");
                }
                else if(lineups_name.equals("Box Plant BBK")){
                    youTubePlayer.loadVideo("exhWYOTKBa8");
                }
                else if(lineups_name.equals("Hallway Control K")){
                    youTubePlayer.loadVideo("30Q_FJQyCSU");
                }
                else if(lineups_name.equals("Short Corner BAK")){
                    youTubePlayer.loadVideo("4NHVlPub_Ns");
                }
                else if(lineups_name.equals("Site Corner BAK")){
                    youTubePlayer.loadVideo("8ejYQfV9Pnk");
                }
                else if(lineups_name.equals("Triple Box BAKD")){
                    youTubePlayer.loadVideo("QB7iNCR7w5Y");
                }
                else if(lineups_name.equals("Link Rush K")){
                    youTubePlayer.loadVideo("8NRj9ltUgMc");
                }
                else if(lineups_name.equals("Long Corner K")){
                    youTubePlayer.loadVideo("1Woo0c5QTIU");
                }
                else if(lineups_name.equals("Plant Stopper K")){
                    youTubePlayer.loadVideo("KATyYgpd42M");
                }
                else if(lineups_name.equals("Safe Site SK")){
                    youTubePlayer.loadVideo("8hPuDoVmuAE");
                }
                else if(lineups_name.equals("Site Corner SK")){
                    youTubePlayer.loadVideo("jBvI2eFcQLo");
                }
                else if(lineups_name.equals("TV POST SK")){
                    youTubePlayer.loadVideo("IhnHmcXmd9Y");
                }
                else if(lineups_name.equals("Heaven to Site K")){
                    youTubePlayer.loadVideo("3oAjrICbHsk");
                }
                else if(lineups_name.equals("Main to Site K")){
                    youTubePlayer.loadVideo("poyVyMNfDbo");
                }
                else if(lineups_name.equals("Site New Plant K")) {
                    youTubePlayer.loadVideo("epNsUT1n3Jc");
                }
                else if(lineups_name.equals("Heaven Corner Left K")){
                    youTubePlayer.loadVideo("K47ng15Ca_k");
                }
                else if(lineups_name.equals("Heaven Corner Right K")){
                    youTubePlayer.loadVideo("OvLuRzBiMtA");
                }
                else if(lineups_name.equals("Heaven To TV K")){
                    youTubePlayer.loadVideo("WBWya-E9eao");
                }
                else if(lineups_name.equals("Alley to Site K")){
                    youTubePlayer.loadVideo("nAMibpottjQ");
                }
                else if(lineups_name.equals("Main Stopper K")){
                    youTubePlayer.loadVideo("i_zxh0PrV_Y");
                }
                else if(lineups_name.equals("Under H to S K")) {
                    youTubePlayer.loadVideo("iQjvgcDgrpE");
                }
                else if(lineups_name.equals("Catwalk FGen BR")){
                    youTubePlayer.loadVideo("byZFordUp24");
                }
                else if(lineups_name.equals("Double Boxes BR")){
                    youTubePlayer.loadVideo("cEZx09TzHHs");
                }
                else if(lineups_name.equals("Front Generator BR")){
                    youTubePlayer.loadVideo("YiRMQU9wB9s");
                }
                else if(lineups_name.equals("Tall Box BR")){
                    youTubePlayer.loadVideo("mvtpMvP1gZg");
                }
                else if(lineups_name.equals("Triple Box BR")){
                    youTubePlayer.loadVideo("Gus-_b6BtuM");
                }
                else if(lineups_name.equals("Triple Box Main BR")) {
                    youTubePlayer.loadVideo("5OmZr1Blo44");
                }
                else if(lineups_name.equals("Back Gen BR")){
                    youTubePlayer.loadVideo("Yge5VMDCpz0");
                }
                else if(lineups_name.equals("Double Box BRD")){
                    youTubePlayer.loadVideo("NMYiAh6TgtM");
                }
                else if(lineups_name.equals("Front Generator BRD")){
                    youTubePlayer.loadVideo("-unC6xk8JvM");
                }
                else if(lineups_name.equals("Back Site BRD")){
                    youTubePlayer.loadVideo("4_CriCyfPHg");
                }
                else if(lineups_name.equals("Corner BRD")){
                    youTubePlayer.loadVideo("48lXvHc6K7Y");
                }
                else if(lineups_name.equals("Triple Box BRD")) {
                    youTubePlayer.loadVideo("mcC7zjk4w7Y");
                }
                else if(lineups_name.equals("Generator Short BR")){
                    youTubePlayer.loadVideo("WwFmzbIYRbE");
                }
                else if(lineups_name.equals("Triple Box Short BR")){
                    youTubePlayer.loadVideo("dY9cJGQmTqo");
                }
                else if(lineups_name.equals("Triple Box BRB")){
                    youTubePlayer.loadVideo("n6wN7isT8VM");
                }
                else if(lineups_name.equals("Box Long BR")){
                    youTubePlayer.loadVideo("09FfIzQXGDE");
                }
                else if(lineups_name.equals("Box Short BR")){
                    youTubePlayer.loadVideo("tC8q9S7MAIw");
                }
                else if(lineups_name.equals("Box Teleport BR")) {
                    youTubePlayer.loadVideo("6P50NZpIqxE");
                }
                else if(lineups_name.equals("Plant Stopper BR")){
                    youTubePlayer.loadVideo("G0ua3cIO3GU");
                }
                else if(lineups_name.equals("Short Corner BR")){
                    youTubePlayer.loadVideo("6r5n6K2Jw0c");
                }
                else if(lineups_name.equals("Triple Box BBRD")){
                    youTubePlayer.loadVideo("IOiMDIylw2A");
                }
                else if(lineups_name.equals("Link BR")){
                    youTubePlayer.loadVideo("laP-KxxTlDI");
                }
                else if(lineups_name.equals("Long Stop BR")){
                    youTubePlayer.loadVideo("husv_nbZ7fo");
                }
                else if(lineups_name.equals("Short Stop BR")) {
                    youTubePlayer.loadVideo("-ylEMWEb3t4");
                }
                else if(lineups_name.equals("Heaven ABR")){
                    youTubePlayer.loadVideo("q4MavHgrpPE");
                }
                else if(lineups_name.equals("Site Planted BR")){
                    youTubePlayer.loadVideo("iyc_dE0tClo");
                }
                else if(lineups_name.equals("Stair BR")){
                    youTubePlayer.loadVideo("sEePD4J3T4Y");
                }
                else if(lineups_name.equals("Alley BR")){
                    youTubePlayer.loadVideo("s4tFhgiUPX4");
                }
                else if(lineups_name.equals("Back Site BR")){
                    youTubePlayer.loadVideo("7t8sBpvpQ6k");
                }
                else if(lineups_name.equals("Heaven BBR")) {
                    youTubePlayer.loadVideo("GdSUHIC4sEE");
                }
                else if(lineups_name.equals("Lobby Corner BR")){
                    youTubePlayer.loadVideo("Yyhnjsly090");
                }
                else if(lineups_name.equals("Main Stair BR")){
                    youTubePlayer.loadVideo("Cr2k8yD66HA");
                }
                else if(lineups_name.equals("TV Post BR")){
                    youTubePlayer.loadVideo("_WXfHhHmqfs");
                }
                else if(lineups_name.equals("Back Site BRS")){
                    youTubePlayer.loadVideo("0EOzTyEqKL0");
                }
                else if(lineups_name.equals("Main Plant BR")){
                    youTubePlayer.loadVideo("Z7Jgb4gPcpA");
                }
                else if(lineups_name.equals("Under Heaven BR")) {
                    youTubePlayer.loadVideo("CHEimFN869c");
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