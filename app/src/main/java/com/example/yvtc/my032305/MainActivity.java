package com.example.yvtc.my032305;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);

        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { //常暗
        super.onCreateContextMenu(menu, v, menuInfo);

        if(v.getId()==R.id.textView){
            menu.add("A");
            menu.add("B");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {   //選擇選項
        switch(item.getItemId()){
            case R.id.meanuadd:
                break;
            case R.id.menusetting:
                break;
            case R.id.menuabout:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
