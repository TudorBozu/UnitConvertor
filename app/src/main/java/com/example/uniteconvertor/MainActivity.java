package com.example.uniteconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView1;
    Button button;
    EditText editText;
    double pounds=0.453;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.text1);
        textView1=findViewById(R.id.text2);
        button=findViewById(R.id.button1);
        editText=findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            double KG_Pounds = Double.parseDouble(editText.getText().toString());
            Convert(KG_Pounds);
            textView1.setText(" "+Convert(KG_Pounds)+" LB ");
            }
        });
    }
    public double Convert(double kilos){

        double pounds_res=kilos/pounds;
        return pounds_res;
    }
}