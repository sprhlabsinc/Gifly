package info.gifly;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CreateStoryActivity extends Activity {

    private Button back_but, done_but, friend_but, takephone_but, mic_but, like_but, plustag_but, media_play_but;
    private TextView username_txt, likecount_txt, duration_txt;
    private SeekBar player_seekbar;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createstory);

        back_but = (Button) findViewById(R.id.back_but);
        done_but = (Button) findViewById(R.id.done_but);
        friend_but = (Button) findViewById(R.id.friend_but);
        takephone_but = (Button) findViewById(R.id.takephoto_but);
        mic_but = (Button) findViewById(R.id.mic_but);
        like_but = (Button) findViewById(R.id.like_but);
        plustag_but = (Button) findViewById(R.id.plustag_but);
        media_play_but = (Button) findViewById(R.id.media_play_but);

        player_seekbar = (SeekBar) findViewById(R.id.player_seekbar);

        username_txt = (TextView) findViewById(R.id.username_txt);
        likecount_txt = (TextView) findViewById(R.id.likecount_txt);
        duration_txt = (TextView) findViewById(R.id.duration_txt);

        back_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        done_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateStoryActivity.this, "done button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        friend_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateStoryActivity.this, "friend button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        takephone_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateStoryActivity.this, "take photo button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        mic_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateStoryActivity.this, "mic button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        like_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateStoryActivity.this, "like button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        plustag_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateStoryActivity.this, "+Tag button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        media_play_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateStoryActivity.this, "play button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        player_seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                progressChanged = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
