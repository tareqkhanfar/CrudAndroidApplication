package com.khanfar.crudapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private EditText name ;
    private EditText age ;
    private EditText id ;
    private RadioGroup radioGroup ;
    private LinkedList<Student> list = new LinkedList<>();
private Button add , delete , search ;
private Switch sw ;
private Spinner city ;
private TextView allData ;
    public static  String cityStr = "" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpData();
        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this ,R.array.city , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city.setAdapter(adapter);

        city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MainActivity.cityStr = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void setUpData() {
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        id = findViewById(R.id.id);
        radioGroup = findViewById(R.id.radio);
        sw = findViewById(R.id.switch_);
        city = findViewById(R.id.spinner);
        allData = findViewById(R.id.allData) ;
    }

    public void DeleteOnClick(View view) {
        for (Student s : list ) {
            if (s.getId() ==Integer.parseInt(id.getText().toString()) ){
                list.remove(s);
                break;
            }
        }
        String str = "" ;
        for (Student s : list) {
            str += s.toString()+"\n#####################################################\n";
        }
        allData.setText(str);


    }

    public void SearchOnClick(View view) {
        for (Student s : list ) {
            if (s.getId() ==Integer.parseInt(id.getText().toString()) ){
                allData.setText(s.toString());
                return;
            }
        }
    }

    public void updateOnClick(View view) {
    }

    public void AddOnClick(View view) {
        String nameStr = name.getText().toString() ;
        int ageNum =Integer.parseInt( age.getText().toString() );
        int idNum = Integer.parseInt(id.getText().toString()) ;
        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(id);

        Toast.makeText(MainActivity.this, cityStr, Toast.LENGTH_SHORT ).show();

        list.add(new Student(nameStr , idNum , ageNum,sw.isChecked() , cityStr,radioButton.getText().toString() ));
        String str = "" ;
        for (Student s : list) {
            str += s.toString()+"\n#####################################################\n";
        }
        allData.setText(str);

    }
}