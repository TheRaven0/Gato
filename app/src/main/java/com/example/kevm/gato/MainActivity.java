package com.example.kevm.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_reset;
    public int jugador, turno = 0;
    public boolean fin = false;
    public EditText resultado;
    public char simbolo;
    public Gato tablero;
    public Button[][] tablero_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablero = new Gato();

        resultado = (EditText)(findViewById(R.id.resultado));

        btn_1 = (Button)(findViewById(R.id.btn1));
        btn_2 = (Button)(findViewById(R.id.btn2));
        btn_3 = (Button)(findViewById(R.id.btn3));
        btn_4 = (Button)(findViewById(R.id.btn4));
        btn_5 = (Button)(findViewById(R.id.btn5));
        btn_6 = (Button)(findViewById(R.id.btn6));
        btn_7 = (Button)(findViewById(R.id.btn7));
        btn_8 = (Button)(findViewById(R.id.btn8));
        btn_9 = (Button)(findViewById(R.id.btn9));
        btn_reset = (Button)(findViewById(R.id.reset));

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_reset.setOnClickListener(this);

        tablero_btn = new Button[][] {{btn_1, btn_2, btn_3}, {btn_4, btn_5, btn_6}, {btn_7, btn_8, btn_9}};

    }

    @Override
    public void onClick(View v) {
        turno++;
        jugador = turno % 2;

        if (jugador == 0)
            simbolo = 'X';
        else
            simbolo = 'O';

        seleccionar(simbolo, v);

        ganar(tablero.finalizar(tablero_btn, turno, jugador, simbolo));
        restart(v);
    }

    public void ganar(int res)
    {
        if (res == 2)
        {
            resultado.setText("Empate.");
            fin = true;
        }
        else if (res == 0)
        {
            resultado.setText("Gana el jugador 2.");
            fin = true;
        }
        else if (res == 1)
        {
            resultado.setText("Gana el jugador 1");
            fin = true;
        }

        if (fin)
        {
            resultado.setEnabled(false);
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
        }
    }

    public void restart(View v)
    {
        if (v.getId() == R.id.reset)
        {
            fin = false;
            turno = 0;
            resultado.setEnabled(false);
            resultado.setText(" ");
            btn_1.setEnabled(true);
            btn_1.setText(" ");
            btn_2.setEnabled(true);
            btn_2.setText(" ");
            btn_3.setEnabled(true);
            btn_3.setText(" ");
            btn_4.setEnabled(true);
            btn_4.setText(" ");
            btn_5.setEnabled(true);
            btn_5.setText(" ");
            btn_6.setEnabled(true);
            btn_6.setText(" ");
            btn_7.setEnabled(true);
            btn_7.setText(" ");
            btn_8.setEnabled(true);
            btn_8.setText(" ");
            btn_9.setEnabled(true);
            btn_9.setText(" ");
        }
    }

    public void seleccionar(char simbolo, View v)
    {
        if (v.getId() == R.id.btn1)
        {
            btn_1.setText(simbolo + "");
            btn_1.setEnabled(false);
        }
        else if(v.getId() == R.id.btn2)
        {
            btn_2.setText(simbolo + "");
            btn_2.setEnabled(false);
        }
        else if(v.getId() == R.id.btn3)
        {
            btn_3.setText(simbolo + "");
            btn_3.setEnabled(false);
        }
        else if(v.getId() == R.id.btn4)
        {
            btn_4.setText(simbolo + "");
            btn_4.setEnabled(false);
        }
        else if(v.getId() == R.id.btn5)
        {
            btn_5.setText(simbolo + "");
            btn_5.setEnabled(false);
        }
        else if(v.getId() == R.id.btn6)
        {
            btn_6.setText(simbolo + "");
            btn_6.setEnabled(false);
        }
        else if(v.getId() == R.id.btn7)
        {
            btn_7.setText(simbolo + "");
            btn_7.setEnabled(false);
        }
        else if(v.getId() == R.id.btn8)
        {
            btn_8.setText(simbolo + "");
            btn_8.setEnabled(false);
        }
        else if(v.getId() == R.id.btn9)
        {
            btn_9.setText(simbolo + "");
            btn_9.setEnabled(false);
        }
    }
}