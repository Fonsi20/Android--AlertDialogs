package com.example.a16alfonsofa.ventanasdialogo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBuilder = (Button) findViewById(R.id.btnBuilderDialog);


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
    }
}
