package com.example.calc;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText edt1,edt2;
        TextView texview1;
        Button btnadd,btnsub,btnmul,btndiv;

        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        texview1=findViewById(R.id.texview1);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);



        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno=Integer.parseInt(edt1.getText().toString());
                int sno=Integer.parseInt(edt2.getText().toString());

                double add=fno+sno;
                texview1.setText("Add:"+add);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno=Integer.parseInt(edt1.getText().toString());
                int sno=Integer.parseInt(edt2.getText().toString());

                double sub=fno-sno;
                texview1.setText("Sub:"+sub);

            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int fno=Integer.parseInt(edt1.getText().toString());
               int  sno=Integer.parseInt(edt2.getText().toString());
               double mul=fno*sno;
               texview1.setText("mul:"+mul);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno=Integer.parseInt(edt1.getText().toString());
                int sno=Integer.parseInt(edt2.getText().toString());
                double div=fno/sno;
                texview1.setText("div:"+div);
            }
        });




    }
}