package app.marks.com.ir.view.impl;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

import java.util.List;

import app.marks.com.ir.R;
import app.marks.com.ir.dto.Student;
import app.marks.com.ir.viewModel.StudentDetailsViewModel;
import app.marks.com.ir.viewModel.impl.StudentDetailsViewModelImpl;

@EActivity(R.layout.activity_student_details)
public class StudentDetailsActivity extends Activity {

    @Bean(StudentDetailsViewModelImpl.class)
    StudentDetailsViewModel studentDetailsViewModel;

    @Override
    protected void onStart() {
        super.onStart();

        final List<Student> students = studentDetailsViewModel.getStudentsByDepartment("", "");

        final ListView listView = (ListView) findViewById(R.id.listView);
        final TextView textView = (TextView) findViewById(R.id.textView);

        final ArrayAdapter<List<Student>> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, students);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                final Student std = (Student) adapter.getItem(position);
                Toast.makeText(getApplicationContext(), std.getFullName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
