package com.example.kevm.gato;

import android.view.View;
import android.widget.Button;

public class Gato {

    public void seleccionar(char simbolo, Button[] btn, View v)
    {
        if (v.getId() == R.id.btn1)
        {
            btn[0].setText(simbolo + "");
            btn[0].setEnabled(false);
        }
        else if(v.getId() == R.id.btn2)
        {
            btn[1].setText(simbolo + "");
            btn[1].setEnabled(false);
        }
        else if(v.getId() == R.id.btn3)
        {
            btn[2].setText(simbolo + "");
            btn[2].setEnabled(false);
        }
        else if(v.getId() == R.id.btn4)
        {
            btn[3].setText(simbolo + "");
            btn[3].setEnabled(false);
        }
        else if(v.getId() == R.id.btn5)
        {
            btn[4].setText(simbolo + "");
            btn[4].setEnabled(false);
        }
        else if(v.getId() == R.id.btn6)
        {
            btn[5].setText(simbolo + "");
            btn[5].setEnabled(false);
        }
        else if(v.getId() == R.id.btn7)
        {
            btn[6].setText(simbolo + "");
            btn[6].setEnabled(false);
        }
        else if(v.getId() == R.id.btn8)
        {
            btn[7].setText(simbolo + "");
            btn[7].setEnabled(false);
        }
        else if(v.getId() == R.id.btn9)
        {
            btn[8].setText(simbolo + "");
            btn[8].setEnabled(false);
        }
    }
}
