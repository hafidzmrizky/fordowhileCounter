package com.hafidzmrizky.fordowhile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button forBtn, whileBtn, doWhileBtn;
    EditText startNumber, endNumber;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forBtn = findViewById(R.id.forBtn);
        whileBtn = findViewById(R.id.whileBtn);
        doWhileBtn = findViewById(R.id.doWhileBtn);
        forBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forBtn();
            }
        });

        whileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whileBtn();
            }
        });

        doWhileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doWhileBtn();
            }
        });

    }

    private void whileBtn() {
        startNumber = findViewById(R.id.startNumber);
        endNumber = findViewById(R.id.endNumber);
        hasil = findViewById(R.id.hasil);
        if (startNumber.getText().toString().isEmpty()) {
            startNumber.setError("Harus diisi");
            startNumber.requestFocus();
            return;
        }
        if (endNumber.getText().toString().isEmpty()) {
            endNumber.setError("Harus diisi");
            endNumber.requestFocus();
            return;
        }
        int start, end;
        start = Integer.parseInt(String.valueOf(startNumber.getText()));
        end = Integer.parseInt(String.valueOf(endNumber.getText()));
        hasil.setText("");
        if (start >= end) {
            while (start >= end) {
                hasil.setText(hasil.getText().toString() + start + "\n");
                start--;
            }
        } else {
            while (start <= end) {
                hasil.setText(hasil.getText().toString() + start + "\n");
                start++;
            }
        };
    }

    private void doWhileBtn() {
        startNumber = findViewById(R.id.startNumber);
        endNumber = findViewById(R.id.endNumber);
        hasil = findViewById(R.id.hasil);
        if (startNumber.getText().toString().isEmpty()) {
            startNumber.setError("Harus diisi");
            startNumber.requestFocus();
            return;
        }
        if (endNumber.getText().toString().isEmpty()) {
            endNumber.setError("Harus diisi");
            endNumber.requestFocus();
            return;
        }
        int start, end;
        start = Integer.parseInt(String.valueOf(startNumber.getText()));
        end = Integer.parseInt(String.valueOf(endNumber.getText()));
        hasil.setText("");
        if (start >= end) {
            do {
                hasil.setText(hasil.getText().toString() + start + "\n");
                start--;
            } while (start >= end);
        } else {
            do {
                hasil.setText(hasil.getText().toString() + start + "\n");
                start++;
            } while (start <= end);
        }
    }

    private void forBtn() {
        startNumber = findViewById(R.id.startNumber);
        endNumber = findViewById(R.id.endNumber);
        hasil = findViewById(R.id.hasil);
        if (startNumber.getText().toString().isEmpty()) {
            startNumber.setError("Harus diisi");
            startNumber.requestFocus();
            return;
        }
        if (endNumber.getText().toString().isEmpty()) {
            endNumber.setError("Harus diisi");
            endNumber.requestFocus();
            return;
        }
        int start, end;
        start = Integer.parseInt(String.valueOf(startNumber.getText()));
        end = Integer.parseInt(String.valueOf(endNumber.getText()));
        hasil.setText("");
        if (start >= end) {
            for (int i = start; i >= end; i--) {
                hasil.setText(hasil.getText().toString() + i + "\n");
            }
        } else {
            for (int i = start; i <= end; i++) {
                hasil.setText(hasil.getText().toString() + i + "\n");
            }
        }
    }


}