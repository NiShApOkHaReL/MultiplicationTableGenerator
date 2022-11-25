package com.nisha.multiplicationtablegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView text;
        EditText n;
        Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
            n = findViewById(R.id.n1);
            button = findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    String st = "";
                    for(int i=1;i<=10;i++){

                        int n2 = Integer.parseInt(n.getText().toString());
                        int mul = n2*i;
                        st = st.concat("\n"+n2+"*"+i+"="+mul);


                    }
                    text.setText(""+st);
                }
            });
    }
}