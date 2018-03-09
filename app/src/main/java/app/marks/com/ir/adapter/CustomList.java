package app.marks.com.ir.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import app.marks.com.ir.R;
import app.marks.com.ir.dto.Person;
import app.marks.com.ir.dto.Student;

/**
 * Created by vishwanathm on 3/8/2018.
 */

public class CustomList extends ArrayAdapter {

    private final Activity context;
    private List<Student> students = new ArrayList<>();

    public CustomList(final Activity context, final List<Student> students) {
        super(context, R.layout.content_student_details, students);
        this.context = context;
        this.students = students;
    }

    @Override
    public View getView(final int position, final View view, final ViewGroup parent) {
        final LayoutInflater inflater = context.getLayoutInflater();
        final View rowView = inflater.inflate(R.layout.content_student_details, null, true);
        final TextView txtTitle = (TextView) rowView.findViewById(R.id.text_rollNumber);
        final TextView txtTitle1 = (TextView) rowView.findViewById(R.id.text_fullName);
//        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
//        imageView.setImageResource(imageId[position]);
        final Person person = students.get(position).getPerson();
        txtTitle.setText(person.getRollNumber());
        txtTitle1.setText(person.getFullName());
        return rowView;
    }
}
