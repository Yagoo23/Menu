package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends SoloMenus {

    private TextView tvHello;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHello=findViewById(R.id.tvHello);
        img=findViewById(R.id.img);
        /* asociar el menú contextual a la vista */
        registerForContextMenu(tvHello);
        registerForContextMenu(img);
    }
    /* CREACIÓN DEL MENÚ DE OPCIONES */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_opciones,menu);
        return true;
    }

    /* CREACIÓN DEL MENÚ CONTEXTUAL */

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //MenuInflater menuInflater=getMenuInflater();
        if (v.getId() == R.id.tvHello) {
            getMenuInflater().inflate(R.menu.menu_contextual,menu);
        }else if(v.getId()==R.id.img){
            getMenuInflater().inflate(R.menu.menu_contextual_img,menu);
        }
    }

    /* LISTENER DEL MENÚ DE OPCIONES */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.opc1:
                Toast.makeText(MainActivity.this, "Pulsada opción 1.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opc2:
                Toast.makeText(MainActivity.this, "Pulsada opción 2.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opc3:
                Toast.makeText(MainActivity.this, "Pulsada opción 3.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opc4:
                Toast.makeText(MainActivity.this, "Pulsada opción 4.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subopc2_1:
                Toast.makeText(MainActivity.this, "Pulsada subopción A.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subopc2_2:
                Toast.makeText(MainActivity.this, "Pulsada subopción B.", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);//false
        }
    }
    /* LISTENER DEL MENÚ CONCEPTUAL */

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ctx1:
                Toast.makeText(MainActivity.this, "Contextual: Pulsada opción 1,", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ctx2:
                Toast.makeText(MainActivity.this, "Contextual: Pulsada opción 2.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ctx3:
                Toast.makeText(MainActivity.this, "Contextual: Pulsada opción 3.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ctxA:
                Toast.makeText(MainActivity.this, "Pulsada opción A.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ctxB:
                Toast.makeText(MainActivity.this, "Pulsada opción B.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ctxC:
                Toast.makeText(MainActivity.this, "Pulsada opción C.", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onClickbtn(View view) {
        Intent i=new Intent(this,Activity2.class);
        startActivity(i);
    }
}