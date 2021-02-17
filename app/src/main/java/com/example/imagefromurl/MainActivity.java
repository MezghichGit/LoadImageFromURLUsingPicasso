package com.example.imagefromurl;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button b;
    private EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.imageView = (ImageView) findViewById(R.id.imageView2);
        this.b = (Button) findViewById(R.id.button);
        this.e = (EditText) findViewById(R.id.editTextTextPersonName);



        this.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage();
            }
        });
    }
    private void showImage() {
        String url = e.getText().toString();
        Picasso.with(MainActivity.this).load(Uri.parse(url))
                .into(imageView);
    }
}