package com.example.externalstorage;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button button_sin, button_cos, button_log, button_tan, button_mc, button_mr, button_sqrt, button_1x;
    private Button button_sign, button_br_l, button_br_r, button_e, button_n, button_m_minus, button_m_plus, button_c;
    private Button button_settings;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button0 = findViewById(R.id.btn0);
        button = findViewById(R.id.btn);
        res = findViewById(R.id.result);
        button_cos = findViewById(R.id.btn_cos);
        button_sin = findViewById(R.id.btn_sin);
        button_tan = findViewById(R.id.btn_tan);
        button_log = findViewById(R.id.btn_log);
        button_m_minus = findViewById(R.id.btn_m_minus);
        button_m_plus = findViewById(R.id.btn_m_plus);
        button_mc = findViewById(R.id.btn_mc);
        button_mr = findViewById(R.id.btn_mr);
        button_sqrt = findViewById(R.id.btn_sqrt);
        button_1x = findViewById(R.id.btn_1x);
        button_br_l = findViewById(R.id.btn_bracket_l);
        button_br_r = findViewById(R.id.btn_bracket_r);
        button_sign = findViewById(R.id.btn_sign);
        button_e = findViewById(R.id.btn_e);
        button_n = findViewById(R.id.btn_n);
        button_c = findViewById(R.id.btn_c);
        button_settings = findViewById(R.id.btn_settings);

        findViewById(R.id.btn_normal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_sin.setVisibility(View.GONE);
                button_cos.setVisibility(View.GONE);
                button_tan.setVisibility(View.GONE);
                button_log.setVisibility(View.GONE);
                button_m_minus.setVisibility(View.GONE);
                button_m_plus.setVisibility(View.GONE);
                button_mc.setVisibility(View.GONE);
                button_mr.setVisibility(View.GONE);
                button_sign.setVisibility(View.GONE);
                button_1x.setVisibility(View.GONE);
                button_br_l.setVisibility(View.GONE);
                button_br_r.setVisibility(View.GONE);
                button_e.setVisibility(View.GONE);
                button_n.setVisibility(View.GONE);
                button_sqrt.setVisibility(View.GONE);
                button_c.setVisibility(View.GONE);
            }
        });

        findViewById(R.id.btn_engineer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_sin.setVisibility(View.VISIBLE);
                button_cos.setVisibility(View.VISIBLE);
                button_tan.setVisibility(View.VISIBLE);
                button_log.setVisibility(View.VISIBLE);
                button_m_minus.setVisibility(View.VISIBLE);
                button_m_plus.setVisibility(View.VISIBLE);
                button_mc.setVisibility(View.VISIBLE);
                button_mr.setVisibility(View.VISIBLE);
                button_sign.setVisibility(View.VISIBLE);
                button_1x.setVisibility(View.VISIBLE);
                button_br_l.setVisibility(View.VISIBLE);
                button_br_r.setVisibility(View.VISIBLE);
                button_e.setVisibility(View.VISIBLE);
                button_n.setVisibility(View.VISIBLE);
                button_sqrt.setVisibility(View.VISIBLE);
                button_c.setVisibility(View.VISIBLE);
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button0.getText().toString());
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button1.getText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button2.getText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button3.getText().toString());
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button4.getText().toString());
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button5.getText().toString());
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button.getText().toString());
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button6.getText().toString());
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button7.getText().toString());
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button8.getText().toString());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button9.getText().toString());
            }
        });

        button_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}