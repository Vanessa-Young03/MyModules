package sg.edu.rp.c346.id22038532.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C218Activity extends AppCompatActivity {

    TextView tvDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c218);

        tvDisplay = findViewById(R.id.C218Display);
        Intent intentReceived = getIntent();
        String ModuleCode218 = intentReceived.getStringExtra("ModuleCode218");
        String ModuleName218 = intentReceived.getStringExtra("ModuleName218");
        String AcademicYear218 = intentReceived.getStringExtra("AcademicYear218");
        String Semester218 = intentReceived.getStringExtra("Semester218");
        String ModuleCreadit218 = intentReceived.getStringExtra("ModuleCredit218");
        String Venue218 = intentReceived.getStringExtra("Venue218");
        tvDisplay.setText(ModuleCode218 + "\n"  + ModuleName218 + "\n" + AcademicYear218 + "\n" + Semester218 + "\n" + ModuleCreadit218 + "\n" + Venue218);
    }
}