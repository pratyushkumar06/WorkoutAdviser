package personal.project.android.workoutadviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    AssignWorkout assignWorkout=new AssignWorkout();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     button=(Button) findViewById(R.id.button);
    button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        TextView textView=(TextView) findViewById(R.id.text);

        Spinner spinner=(Spinner) findViewById(R.id.spinner);

        String str=String.valueOf(spinner.getSelectedItem());

        List<String> list=assignWorkout.getworkouts(str);

        StringBuilder stringBuilder=new StringBuilder();

        for(String work:list)
        {
            stringBuilder.append(work).append('\n');
        }

        textView.setText(stringBuilder);
        //textView.setText(str);
    }
}
