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

public class Welcome extends AppCompatActivity {
    Button btnStart;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnStart = (Button) findViewById(R.id.btnMulai);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Welcome.this, Login_Code.class);
                startActivity(i);
            }
        });
    }
}
