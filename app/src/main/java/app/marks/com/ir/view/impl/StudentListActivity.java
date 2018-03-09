package app.marks.com.ir.view.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

import java.util.List;

import app.marks.com.ir.R;
import app.marks.com.ir.adapter.CustomList;
import app.marks.com.ir.dto.Student;
import app.marks.com.ir.viewModel.StudentListViewModel;
import app.marks.com.ir.viewModel.impl.StudentListViewModelImpl;

@EActivity(R.layout.activity_student_list)
public class StudentListActivity extends Activity {

    @Bean(StudentListViewModelImpl.class)
    StudentListViewModel studentListViewModel;

    @Override
    protected void onStart() {
        super.onStart();
        final List<Student> students = studentListViewModel.getStudentsByDepartment("", "");
        final ListView listView = (ListView) findViewById(R.id.listView);

        final CustomList list = new CustomList(this, students);
        listView.setAdapter(list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                final Student student = (Student) list.getItem(position);
                final Intent intent = new Intent(getApplicationContext(), StudentDetailsActivity.class);
                intent.putExtra("student", student);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }
}
