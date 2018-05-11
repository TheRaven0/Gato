package com.example.kevm.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_reset;
    public int jugador, turno;
    public EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    }

    @Override
    public void onClick(View v) {

    }
}
