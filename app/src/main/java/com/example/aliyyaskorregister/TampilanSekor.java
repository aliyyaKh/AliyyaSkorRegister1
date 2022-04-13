package com.example.aliyyaskorregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TampilanSekor extends AppCompatActivity {
    int skorA = 0;
    int skorB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_sekor);

        TextView namaTimA = findViewById(R.id.texttim1);
        TextView namaTimB = findViewById(R.id.texttim2);

        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        namaTimA.setText("Team" + " " + namaA);
        namaTimB.setText("Team" + " " + namaB);
    }

    public void Tambah(View view) {
        if (view.getId() == R.id.button1) {
            skorA = skorA + 1;
        } else if (view.getId() == R.id.button2) {
            skorA = skorA + 2;
        } else if (view.getId() == R.id.button3) {
            skorA = skorA + 3;
        } else if (view.getId() == R.id.button5) {
            skorB = skorB + 1;
        } else if (view.getId() == R.id.button6) {
            skorB = skorB + 2;
        } else if (view.getId() == R.id.button7) {
            skorB = skorB + 3;
        }

        TextView skorTimA = findViewById(R.id.papansekor1);
        TextView skorTimB = findViewById(R.id.papansekor2);

        skorTimA.setText(String.valueOf(skorA));
        skorTimB.setText(String.valueOf(skorB));
    }
}