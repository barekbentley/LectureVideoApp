package com.example.lecturevideoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        VideoView sampleVideoView = findViewById(R.id.videoView3);

        String VideoName = "sample";
        String VideoPath = "android.resource://" +getPackageName()+"/raw/" + VideoName;

        Uri videoUri = Uri.parse(VideoPath);
        sampleVideoView.setVideoURI(videoUri);

        MediaController controller = new MediaController(this);
        controller.setMediaPlayer(sampleVideoView);
        sampleVideoView.setMediaController(controller);

        sampleVideoView.start();
        sampleVideoView.stopPlayback();



    }

}

