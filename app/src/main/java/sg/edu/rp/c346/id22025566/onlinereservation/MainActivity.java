package sg.edu.rp.c346.id22025566.onlinereservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
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
    CheckBox cbSmoking;
    CheckBox cbNonSmoking;
    Button btnConfirm;
    Button btnReset;



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
        cbSmoking=findViewById(R.id.checkBoxSmoking);
        cbNonSmoking=findViewById(R.id.checkBoxNonSmoking);
        btnConfirm=findViewById(R.id.buttonConfirm);
        btnReset=findViewById(R.id.buttonReset);

        //What happens when CONFIRM button is clicked
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=etName.getText().toString();
                String mobile=etMobile.getText().toString();


                Toast.makeText(MainActivity.this, "Name: " + name, Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "Mobile: " + mobile, Toast.LENGTH_LONG).show();








            }
        });



    }
}