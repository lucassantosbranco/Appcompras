package br.ulbra.appcompras;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ComprasActivity extends Activity {
    CheckBox chkarroz, chkleite, chkcarne, chkfeijao, chkrefrigerante;
    Button bttotal;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);


        chkarroz = (CheckBox) findViewById(R.id.chkarroz);
        chkleite = (CheckBox) findViewById(R.id.chkleite);
        chkcarne = (CheckBox) findViewById(R.id.chkcarne);
        chkfeijao = (CheckBox) findViewById(R.id.chkfeijao);
        chkrefrigerante = (CheckBox) findViewById(R.id.chkrefrigerante);


        bttotal = (Button) findViewById(R.id.bttotal);


        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (chkarroz.isChecked()) {total += 2.69;}
                if (chkleite.isChecked()) {total += 5.00;}
                if (chkcarne.isChecked()) {total += 10.00;}
                if (chkfeijao.isChecked()) {total += 2.30;}
                if (chkrefrigerante.isChecked()) {total += 2.00;
                }


                AlertDialog.Builder dialogo = new AlertDialog.Builder(ComprasActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra: R$ " + String.format("%.2f", total));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}
