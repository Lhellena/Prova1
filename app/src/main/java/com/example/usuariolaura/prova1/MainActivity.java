package com.example.usuariolaura.prova1;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox chkTeste, chkDesenvolvimento, chkDeign, chkMobile, chkSeguranca, chkEmpreendedorismo, chkDireito;
    Button btMatricular;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //laura hel//

        chkTeste = (CheckBox) findViewById(R.id.chkTeste);
        chkDesenvolvimento = (CheckBox) findViewById(R.id.chkDesenvolvimento);
        chkDeign = (CheckBox) findViewById(R.id.chkDesign);
        chkMobile = (CheckBox) findViewById(R.id.chkMobile);
        chkSeguranca = (CheckBox) findViewById(R.id.chkSeguranca);
        chkEmpreendedorismo = (CheckBox) findViewById(R.id.chkEmpreendedorismo);
        Button btMatricular = (Button) findViewById(R.id.btMatricular);
        btMatricular.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                double Confirmar = 0;

                if (chkTeste.isChecked())
                    Confirmar += 1;


                if (chkDesenvolvimento.isChecked())
                    Confirmar += 1;


                if (chkDeign.isChecked())
                    Confirmar += 1;


                if (chkMobile.isChecked())
                    Confirmar += 1;


                if (chkSeguranca.isChecked())
                    Confirmar += 1;


                if (chkEmpreendedorismo.isChecked())
                    Confirmar += 1;


                if (chkDireito.isChecked())
                    Confirmar += 1;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

                dialogo.setTitle("Confirmar");
                dialogo.setMessage("O(a) discente está matriculado em + disciplians :" +String.valueOf(Confirmar));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }

        });
    }
}
