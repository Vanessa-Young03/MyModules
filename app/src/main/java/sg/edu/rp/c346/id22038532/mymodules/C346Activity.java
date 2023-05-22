package sg.edu.rp.c346.id22038532.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C346Activity extends AppCompatActivity {

    TextView tvAnswer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);

        tvAnswer = findViewById(R.id.C346Display);
        Intent intentReceived = getIntent();
        String ModuleCode346 = intentReceived.getStringExtra("ModuleCode346");
        String ModuleName346 = intentReceived.getStringExtra("ModuleName346");
        String AcademicYear346 = intentReceived.getStringExtra("AcademicYear346");
        String Semester346 = intentReceived.getStringExtra("Semester346");
        String ModuleCreadit346 = intentReceived.getStringExtra("ModuleCreadit346");
        String Venue346 = intentReceived.getStringExtra("Venue346");
        tvAnswer.setText(ModuleCode346 + "\n"  + ModuleName346 + "\n" +AcademicYear346 + "\n" + Semester346 + "\n" + ModuleCreadit346 + "\n" + Venue346);


    }
}