package com.amranemon.storecalculate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edSell, edBuy;
    TextView tvDisplay;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edSell = findViewById(R.id.edSell);
        edBuy = findViewById(R.id.edBuy);
        tvDisplay = findViewById(R.id.tvDisplay);
        btnCalculate = findViewById(R.id.btn);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sell = edSell.getText().toString();
                String buy = edBuy.getText().toString();
                if (sell.isEmpty() || buy.isEmpty()) {
                    tvDisplay.setText("Please enter both values");
                } else {
                    double sellValue = Double.parseDouble(sell);
                    double buyValue = Double.parseDouble(buy);
                    double profit = buyValue - sellValue;
                    tvDisplay.setText("Profit: " + profit);
                }
            }
        });

    }
}