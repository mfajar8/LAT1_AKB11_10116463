package mfajar8.wordpress.com;

/*
 * NIM   : 10116463
 * NAMA  : Mochamad Fajar Ismatulloh
 * KELAS : AKB-11
 * TGL   : 04/04/2019
 * */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Code extends AppCompatActivity {
    Button btnKeBio;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__code);
        btnKeBio = (Button) findViewById(R.id.masuk);
        btnKeBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_Code.this, Biodata.class);
                startActivity(i);
            }
        });
    }
}
