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
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class Biodata extends AppCompatActivity {

    EditText isiNama, isiUmur;
    Button btnNext;

    private String KEY_NAME = "kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        isiNama = (EditText) findViewById(R.id.isinama);
        isiUmur = (EditText) findViewById(R.id.isiumur);
        btnNext = (Button) findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String nama = isiNama.getText().toString();
                String umur = isiUmur.getText().toString();

                boolean isEmpty = false;

                if ((TextUtils.isEmpty(nama)) || (TextUtils.isEmpty(umur))){
                    isEmpty = true;
                    isiNama.setError("Isi data dahulu");
                } else {
                    Intent next = new Intent(Biodata.this, Say_hai.class);
                    next.putExtra(KEY_NAME, nama);
                    startActivity(next);
                }
            }
        });
    }
}
