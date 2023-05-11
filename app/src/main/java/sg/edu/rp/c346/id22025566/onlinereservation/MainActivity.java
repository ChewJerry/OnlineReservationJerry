package sg.edu.rp.c346.id22025566.onlinereservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView tvName;
    EditText etName;
    TextView tvMobile;
    EditText etMobile;
    TextView tvSizeGrp;
    EditText etSizeGrp;
    DatePicker dp;
    TimePicker tp;
    RadioGroup rgSmoke;
    RadioButton rbSmoking;
    RadioButton rbNonSmoking;
    Button btnConfirm;
    Button btnReset;
    TextView tvDisplayToast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName=findViewById(R.id.textViewName);
        etName=findViewById(R.id.editTextName);
        tvMobile=findViewById(R.id.textViewMobile);
        etMobile=findViewById(R.id.editTextMobile);
        tvSizeGrp=findViewById(R.id.textViewSizeGrp);
        etSizeGrp=findViewById(R.id.editTextSizeGrp);
        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        rgSmoke=findViewById(R.id.radioGroupSmoke);
        rbSmoking=findViewById(R.id.radioButtonSmoking);
        rbNonSmoking=findViewById(R.id.radioButtonNonSmoking);
        btnConfirm=findViewById(R.id.buttonConfirm);
        btnReset=findViewById(R.id.buttonReset);



        int defaultHour = 19;
        int defaultMinute = 30;
        tp.setHour(defaultHour);
        tp.setMinute(defaultMinute);

        // set to default date
        int defaultYear = 2023;
        int defaultMonth = 5;
        int defaultDayOfMonth = 1;
        dp.updateDate(defaultYear, defaultMonth, defaultDayOfMonth);

        //What happens when CONFIRM button is clicked
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String mobile = etMobile.getText().toString();
                String size = etSizeGrp.getText().toString();

                //Retrieve date
                int getYear = dp.getYear();
                int getMonth = dp.getMonth() + 1;
                int getDayOfMonth = dp.getDayOfMonth();
                String date = getDayOfMonth + "/" + getMonth + "/" + getYear;

                //Retrieve time
                String stringAnswer = "";
                int getHour = tp.getHour();
                int getMinute = tp.getMinute();
                stringAnswer = getHour + ":" + getMinute;

                //Retrieve state of radioButton ie. which is checked
                String stringSmoke = "Smoking area";
                String stringNoSmoke = "Non-smoking area";
                String stringResponse = "";

                int checkedRadioId = rgSmoke.getCheckedRadioButtonId();

                if (checkedRadioId==R.id.radioButtonSmoking) {
                    stringResponse="Smoking area";
                }
                else{
                    stringResponse="Non-smoking area";
                }



                Toast.makeText(MainActivity.this, "Name: " + name, Toast.LENGTH_SHORT).show();


                Toast.makeText(MainActivity.this, "Mobile: " + mobile, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Group size: " + size, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Date: " + date +  "  Time: " + stringAnswer , Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "Time: " + stringAnswer, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Area: " + stringResponse, Toast.LENGTH_SHORT).show();


            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int defaultYear = 2023;
                int defaultMonth = 5;
                int defaultDayOfMonth = 1;
                dp.updateDate(defaultYear, defaultMonth, defaultDayOfMonth);


                int defaultHour = 19;
                int defaultMinute = 30;
                tp.setHour(defaultHour);
                tp.setMinute(defaultMinute);


            }
        });




    }
}
//MainActivity.java 1