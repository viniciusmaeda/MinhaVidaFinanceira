package com.maeda.minhavidafinanceira;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        // atribui um título para a páginga (activity)
        setTitle(R.string.principal_activity_sobre);
    }
}
