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

public class EnterCodeActivity extends Activity {

    private Button verify_but;
    private EditText code1_txt, code2_txt, code3_txt, code4_txt;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entercode);

        verify_but = (Button) findViewById(R.id.verify_but);
        code1_txt = (EditText) findViewById(R.id.code1_txt);
        code2_txt = (EditText) findViewById(R.id.code2_txt);
        code3_txt = (EditText) findViewById(R.id.code3_txt);
        code4_txt = (EditText) findViewById(R.id.code4_txt);

        //code1_txt.setText("5");
        //code2_txt.setText("5");
        //code3_txt.setText("5");
        //code4_txt.setText("5");

        verify_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( code1_txt.getText().toString().length() != 0 && code2_txt.getText().toString().length() != 0 &&
                        code3_txt.getText().toString().length() != 0 && code4_txt.getText().toString().length() != 0 ) {
                    startActivity(new Intent(EnterCodeActivity.this, EnterNameActivity.class));
                }
            }
        });
        code1_txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //here is your code
                Toast.makeText(EnterCodeActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
                if ( s.toString().length() == 0 ) {
                    verify_but.setBackgroundResource(R.mipmap.grey_but_bg);
                    verify_but.setTextColor(getResources().getColor(R.color.grey_color));
                }
                else {
                    verify_but.setBackgroundResource(R.mipmap.blue_but_bg);
                    verify_but.setTextColor(Color.WHITE);
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
