package com.example.kevm.gato;

import android.view.View;
import android.widget.Button;

public class Gato {

    public int finalizar(Button btn[][], int turno, int jugador, char s)
    {
        // 0 = gana jugador 1, 1 = gana jugador 2, 2 = empate, 3 = continua.
        if (btn[0][0].getText().toString().equals(s+"") && btn[0][1].getText().toString().equals(s+"") && btn[0][2].getText().toString().equals(s+"")) return jugador;
        if (btn[1][0].getText().toString().equals(s+"") && btn[1][1].getText().toString().equals(s+"") && btn[1][2].getText().toString().equals(s+"")) return jugador;
        if (btn[2][0].getText().toString().equals(s+"") && btn[2][1].getText().toString().equals(s+"") && btn[2][2].getText().toString().equals(s+"")) return jugador;

        if (btn[0][0].getText().toString().equals(s+"") && btn[1][0].getText().toString().equals(s+"") && btn[2][0].getText().toString().equals(s+"")) return jugador;
        if (btn[0][1].getText().toString().equals(s+"") && btn[1][1].getText().toString().equals(s+"") && btn[2][1].getText().toString().equals(s+"")) return jugador;
        if (btn[0][2].getText().toString().equals(s+"") && btn[1][2].getText().toString().equals(s+"") && btn[2][2].getText().toString().equals(s+"")) return jugador;

        if (btn[0][0].getText().toString().equals(s+"") && btn[1][1].getText().toString().equals(s+"") && btn[2][2].getText().toString().equals(s+"")) return jugador;
        if (btn[2][0].getText().toString().equals(s+"") && btn[1][1].getText().toString().equals(s+"") && btn[0][2].getText().toString().equals(s+"")) return jugador;

        if (turno == 9)
            return 2;

        return 3;
    }
}
