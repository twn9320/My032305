package com.example.yvtc.my032305;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //t建立選項
        menu.add("選項一");
        menu.add("選項二");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {   //選擇選項
        Toast.makeText(MainActivity.this,item.getTitle(),Toast.LENGTH_SHORT).show();  //顯示
        return super.onOptionsItemSelected(item);
    }
}
