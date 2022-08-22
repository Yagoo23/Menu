package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SoloMenus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_menus);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_opciones,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.opc1:
                Toast.makeText(SoloMenus.this, "Pulsada opción 1.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opc2:
                Toast.makeText(SoloMenus.this, "Pulsada opción 2.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opc3:
                Toast.makeText(SoloMenus.this, "Pulsada opción 3.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opc4:
                Toast.makeText(SoloMenus.this, "Pulsada opción 4.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subopc2_1:
                Toast.makeText(SoloMenus.this, "Pulsada subopción A.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subopc2_2:
                Toast.makeText(SoloMenus.this, "Pulsada subopción B.", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);//false
        }
    }
}