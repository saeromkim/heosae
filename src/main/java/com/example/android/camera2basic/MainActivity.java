package com.example.android.camera2basic;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // onCreate

    public void mClick(View v)  {

        switch (v.getId())  {
            // 카페스타그램
            case R.id.btn_cafe:
                Intent intent = new Intent(this, CameraActivity.class);
                intent.putExtra("count", 1);
                startActivity(intent);
                break;
            // 책스타그램
            case R.id.btn_book:
                Intent intent3 = new Intent(this, CameraActivity.class);
                intent3.putExtra("count", 2);
                startActivity(intent3);
                break;
            // 음식스타그램
            case R.id.btn_food:
                Intent intent2 = new Intent(this, CameraActivity.class);
                intent2.putExtra("count", 3);
                startActivity(intent2);
                break;

            case R.id.btn_notice:
                intent = new Intent(this, Community.class);
                startActivity(intent);
                break;
        }

    } // end mClick

}
