package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final MediaPlayer mediaPlayer = new MediaPlayer();
        setContentView(R.layout.activity_main);
        final Button button_start= (Button)findViewById(R.id.button_start_pause);
        button_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                start();
            }
            public  void start(){
                try {
                    setContentView(R.layout.pause_main);
                    mediaPlayer.setDataSource("ljr_yq.mp3");
                    mediaPlayer.prepare();//让mediaplayer进入准备状态
                   // mediaPlayer.start();
                    if (!mediaPlayer.isPlaying()) {
                        mediaPlayer.start();//开始播放
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            public void pause(){}
        });
    }
}
