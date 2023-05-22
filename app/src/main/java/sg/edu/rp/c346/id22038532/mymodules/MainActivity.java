package sg.edu.rp.c346.id22038532.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C346, C206, C203, C218, G953, C235;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C346 = findViewById(R.id.C346);
        C206 = findViewById(R.id.C206);
        C203 = findViewById(R.id.C203);
        C218 = findViewById(R.id.C218);
        G953 = findViewById(R.id.G953);
        C235 = findViewById(R.id.C235);

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C346Activity.class);
                intent.putExtra("ModuleCode346", "Module Code: C346");
                intent.putExtra("ModuleName346", "Module Name: Android Programming");
                intent.putExtra("AcademicYear346", "AcademicYear: 2020");
                intent.putExtra("Semester346", "Semester: 1");
                intent.putExtra("ModuleCreadit346", "Module Credit: 4");
                intent.putExtra("Venue346", "Venue: E63A");

                startActivity(intent);
            }
        });

        C206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C206Activity.class);
                intent.putExtra("ModuleCode206", "Module Code: C206");
                intent.putExtra("ModuleName206", "Module Name: Software Development Process");
                intent.putExtra("AcademicYear206", "AcademicYear: 2020");
                intent.putExtra("Semester206", "Semester: 1");
                intent.putExtra("ModuleCredit206", "Module Credit: 4");
                intent.putExtra("Venue206", "Venue: W64N");
                startActivity(intent);
            }
        });

        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C206Activity.class);
                intent.putExtra("ModuleCode203", "Module Code: C203");
                intent.putExtra("ModuleName203", "Module Name: Web Development in PHP");
                intent.putExtra("AcademicYear203", "AcademicYear: 2020");
                intent.putExtra("Semester203", "Semester: 1");
                intent.putExtra("ModuleCredit203", "Module Credit: 4");
                intent.putExtra("Venue203", "Venue: W64N");
                startActivity(intent);
            }
        });

        C218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C218Activity.class);
                intent.putExtra("ModuleCode218", "Module Code: C218");
                intent.putExtra("ModuleName218", "Module Name: UI/UX Design in Apps");
                intent.putExtra("AcademicYear218", "AcademicYear: 2020");
                intent.putExtra("Semester218", "Semester: 1");
                intent.putExtra("ModuleCredit218", "Module Credit: 4");
                intent.putExtra("Venue218", "Venue: W64N");
                startActivity(intent);
            }
        });

//        C235.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, .class);
//                String C235Details = "Module Code: C235 \n Module Name: IT Security & Management";
//                intent.putExtra("C235Details", C235Details);
//                startActivity(intent);
//            }
//        });


    }
}