package com.example.a16alfonsofa.ventanasdialogo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnBuilder,btnBuilderBtn,btnBuilderBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBuilder = (Button) findViewById(R.id.btnBuilderDialog);
        btnBuilderBtn = (Button) findViewById(R.id.btnBuilderDialogBOTON);
        btnBuilderBtn2 =(Button) findViewById(R.id.btnBuilderDialog2BOTON);

        btnBuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder ventana = new AlertDialog.Builder(MainActivity.this);
                ventana.setTitle("Warning");
                ventana.setMessage("Cuidado! hay terribles velocirraptores sueltos por el complejo, por favor no olvide no darles de comer.");
                ventana.setIcon(android.R.drawable.star_big_on);
                ventana.show();

            }
        });

        btnBuilderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder ventana2 = new AlertDialog.Builder(MainActivity.this);
                ventana2.setTitle("TE QUIERO");
                ventana2.setMessage("Se que eres una persona preciosa, así que bésame y no me sueltes nunca!.");
                ventana2.setIcon(android.R.drawable.ic_menu_myplaces);
                ventana2.setCancelable(false);
                ventana2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                ventana2.show();

            }
        });


        btnBuilderBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder ventana3 = new AlertDialog.Builder(MainActivity.this);
                ventana3.setTitle("TE ODIO");
                ventana3.setMessage("Pinche pendejo.");
                ventana3.setIcon(android.R.drawable.ic_delete);
                ventana3.setCancelable(false);
                ventana3.setPositiveButton("ACHANTA TONTO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                ventana3.setNegativeButton("PINCHE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, " Como no achantes no sales ", Toast.LENGTH_LONG).show();
                    }
                });
                ventana3.show();

            }
        });
    }
}
