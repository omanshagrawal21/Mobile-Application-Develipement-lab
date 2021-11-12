package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    MediaPlayer safari, wavin_flag, senorita, believer ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    MediaPlayer mediaplayer = new MediaPlayer();
    mediaplayer.setWakeMode(getApplicationContext(),
//            PowerManager.PARTIAL_WAKE_LOCK);
    safari = MediaPlayer.create(this, R.raw.safari);
    wavin_flag = MediaPlayer.create(this, R.raw.wavin_flag);
    senorita = MediaPlayer.create(this, R.raw.senorita);
    believer = MediaPlayer.create(this, R.raw.believer);
    Button pause = (Button) findViewById(R.id.pause);
    pause.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            safari.pause();
            wavin_flag.pause();
            senorita.pause();
            believer.pause();
        } });
    Button Believer = (Button) findViewById(R.id.believer);
    Believer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            believer.start();
            believer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    Toast.makeText(MainActivity.this, "The Song is Over", Toast.LENGTH_SHORT).show();
                } });
        } });
    Button Wavin_flag = (Button) findViewById(R.id.wavin_flag);
    Wavin_flag.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            wavin_flag.start();
            wavin_flag.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    Toast.makeText(MainActivity.this, "The Song is Over", Toast.LENGTH_SHORT).show();
                } });
        } });
    Button Safari = (Button) findViewById(R.id.safari);
    Safari.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            safari.start();
            safari.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    Toast.makeText(MainActivity.this, "The Song is Over", Toast.LENGTH_SHORT).show();
                } });
        } });
    Button Senorita = (Button) findViewById(R.id.senorita);
    Senorita.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            senorita.start();
            senorita.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override

                public void onCompletion(MediaPlayer mp) {
                    Toast.makeText(MainActivity.this, "The Song is Over", Toast.LENGTH_SHORT).show();
                } });
        } });
} }