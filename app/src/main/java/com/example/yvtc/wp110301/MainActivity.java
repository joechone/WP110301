package com.example.yvtc.wp110301;

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
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"設定");
        menu.add(0,1,1,"關於我們");
        menu.add(1,0,0,"設定1");
        menu.add(1,1,1,"關於我們1");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //if(item.getTitle().toString().equals("關於我們"))
        if(item.getItemId()==1)
        {
            Toast.makeText(MainActivity.this,"這是關於我們",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
