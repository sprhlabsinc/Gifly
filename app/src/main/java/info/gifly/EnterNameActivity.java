package info.gifly;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class EnterNameActivity extends Activity {

    private Button phototake_but, done_but;
    private EditText username_txt;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entername);

        phototake_but = (Button) findViewById(R.id.phototake_but);
        done_but = (Button) findViewById(R.id.done_but);
        username_txt = (EditText) findViewById(R.id.username_txt);

        //username_txt.setText("Jessy");
        phototake_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EnterNameActivity.this, "Photo take button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        done_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( username_txt.getText().toString().length() != 0 ) {
                    startActivity(new Intent(EnterNameActivity.this, CreateStoryActivity.class));
                }
            }
        });

        username_txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //here is your code
                Toast.makeText(EnterNameActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
                if ( s.toString().length() == 0 ) {
                    done_but.setBackgroundResource(R.mipmap.grey_but_bg);
                    done_but.setTextColor(getResources().getColor(R.color.grey_color));
                }
                else {
                    done_but.setBackgroundResource(R.mipmap.blue_but_bg);
                    done_but.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub
            }
        });
    }
}
