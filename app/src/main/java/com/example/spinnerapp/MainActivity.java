package com.example.spinnerapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView txt;
    Spinner spn;
    String[] item={"C","C++","JAVA","Python3","Dart","PHP","HTML"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.text);
        spn = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, item);
        spn.setAdapter(adapter);
        spn.setOnItemSelectedListener(this);
    }
     @Override
     public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
     {
         txt.setText(item[position]);
     }
     @Override
     public void onNothingSelected(AdapterView<?> arg)
     {
        //
     }
}