package info.gifly;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class PhoneVerificationActivity extends Activity {

    private Button sendsms_but;
    private Spinner country_spinner;
    private EditText phonenumber_txt;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phoneverification);

        sendsms_but = (Button) findViewById(R.id.sendsms_but);
        country_spinner = (Spinner) findViewById(R.id.country_spinner);
        phonenumber_txt = (EditText) findViewById(R.id.phonenumber_txt);

        //phonenumber_txt.setText("32432423");

        sendsms_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( phonenumber_txt.getText().toString().length() != 0 ) {
                    startActivity(new Intent(PhoneVerificationActivity.this, EnterCodeActivity.class));
                }
            }
        });

        country_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int position, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(arg0.getContext(), arg0.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

        phonenumber_txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //here is your code
                //Toast.makeText(PhoneVerificationActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
                if ( s.toString().length() == 0 ) {
                    sendsms_but.setBackgroundResource(R.mipmap.grey_but_bg);
                    sendsms_but.setTextColor(getResources().getColor(R.color.grey_color));
                }
                else {
                    sendsms_but.setBackgroundResource(R.mipmap.blue_but_bg);
                    sendsms_but.setTextColor(Color.WHITE);
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
