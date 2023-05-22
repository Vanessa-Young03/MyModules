package sg.edu.rp.c346.id22038532.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C203Activity extends AppCompatActivity {

    TextView tvDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c203);

        tvDisplay = findViewById(R.id.C203Display);
        Intent intentReceived = getIntent();
        String ModuleCode203 = intentReceived.getStringExtra("ModuleCode203");
        String ModuleName203 = intentReceived.getStringExtra("ModuleName203");
        String AcademicYear203 = intentReceived.getStringExtra("AcademicYear203");
        String Semester203 = intentReceived.getStringExtra("Semester203");
        String ModuleCreadit203 = intentReceived.getStringExtra("ModuleCredit203");
        String Venue203 = intentReceived.getStringExtra("Venue203");
        tvDisplay.setText(ModuleCode203 + "\n"  + ModuleName203 + "\n" + AcademicYear203 + "\n" + Semester203 + "\n" + ModuleCreadit203 + "\n" + Venue203);

    }
}