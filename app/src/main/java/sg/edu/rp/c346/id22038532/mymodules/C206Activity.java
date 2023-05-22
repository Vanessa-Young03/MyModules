package sg.edu.rp.c346.id22038532.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C206Activity extends AppCompatActivity {

    TextView tvAnswer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c206);

        tvAnswer = findViewById(R.id.C206Display);
        Intent intentReceived = getIntent();
        String ModuleCode206 = intentReceived.getStringExtra("ModuleCode206");
        String ModuleName206 = intentReceived.getStringExtra("ModuleName206");
        String AcademicYear206 = intentReceived.getStringExtra("AcademicYear206");
        String Semester206 = intentReceived.getStringExtra("Semester206");
        String ModuleCreadit206 = intentReceived.getStringExtra("ModuleCredit206");
        String Venue206 = intentReceived.getStringExtra("Venue206");
        tvAnswer.setText(ModuleCode206 + "\n"  + ModuleName206 + "\n" + AcademicYear206 + "\n" + Semester206 + "\n" + ModuleCreadit206 + "\n" + Venue206);
    }
}