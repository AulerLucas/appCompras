package appbolota.rede.ulbra.compras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox arroz, leite, carne, feijao;
    Button btnCalcular;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arroz = findViewById(R.id.chkarroz);
        leite = findViewById(R.id.chkleite);
        carne = findViewById(R.id.chkcarne);
        feijao = findViewById(R.id.chkfeijao);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double total = 0;
                if (arroz.isChecked()) {
                    total += 4.20;
                }
                if (leite.isChecked()) {
                    total += 7.90;
                }
                if (carne.isChecked()) {
                    total += 15.70;
                }
                if (feijao.isChecked()) {
                    total += 8.20;
                }

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra :" + String.valueOf(total));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();


            }
        });
    }
}

