package com.example.aliyyaskorregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void input(View view) {
        EditText inputNamaTimA = findViewById(R.id.editTxt_1);
        EditText inputNamaTimB = findViewById(R.id.editText_2);

        String namaTimA = inputNamaTimA.getText().toString();
        Log.d(TAG, namaTimA);

        String namaTimB = inputNamaTimB.getText().toString();
        Log.d(TAG, namaTimB);

        Intent intent = new Intent(this, TampilanSekor.class);


        intent.putExtra("Tim A", namaTimA);
        intent.putExtra("Tim B", namaTimB);
        startActivity(intent);

    }

}