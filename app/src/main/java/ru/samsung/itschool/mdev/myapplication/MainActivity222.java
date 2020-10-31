package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity222 extends AppCompatActivity implements View.OnClickListener {

    private EditText object_a, object_b, object_c;
    private TextView result;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                object_a = findViewById(R.id.obj_a);
                object_b = findViewById(R.id.obj_b);
                object_c = findViewById(R.id.obj_c);
                String str_a = object_a.getText().toString();
                double a = Double.parseDouble(str_a);
                String str_b = object_b.getText().toString();
                double b = Double.parseDouble(str_b);
                String str_c = object_c.getText().toString();
                double c = Double.parseDouble(str_c);
                result = findViewById(R.id.res);

                double d = b*b - 4*a*c;
                if(d == 0) {
                    double x = -b/(2*a);
                    result.setText("Результат: x="+x);
                } else if(d < 0 ) {
                    result.setText("Нет решений!");
                } else {
                    double x1 = (-b + Math.sqrt(d))/(2*a);
                    double x2 = (-b - Math.sqrt(d))/(2*a);
                    result.setText("Результат: x1="+x1 + "; x2="+x2);
                }

                //Toast.makeText(this,R.string.app_name,Toast.LENGTH_LONG).show();
                Snackbar.make(findViewById(R.id.root),"Test!!!!",Snackbar.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public void onClick(View view) {
       /* if(view.getId() == R.id.button) {

        }else if() {

        }*/

    }
}