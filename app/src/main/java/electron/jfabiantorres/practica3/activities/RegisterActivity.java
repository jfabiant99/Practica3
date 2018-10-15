package electron.jfabiantorres.practica3.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import electron.jfabiantorres.practica3.R;
import electron.jfabiantorres.practica3.repositories.NoteRepository;

public class RegisterActivity extends AppCompatActivity {

    private EditText titleInput;
    private EditText descriptionInput;
    private EditText dateInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        titleInput = findViewById(R.id.title_input);
        descriptionInput = findViewById(R.id.description_input);
        dateInput = findViewById(R.id.date_input);
    }

    public void callRegister(View view){
        String title = titleInput.getText().toString();
        String description = descriptionInput.getText().toString();
        String date = dateInput.getText().toString();

        if(title.isEmpty() || description.isEmpty() || date.isEmpty()){
            Toast.makeText(this, "Todos los datos son obligatorios", Toast.LENGTH_SHORT).show();
            return;
        }

        NoteRepository.create(title, description, date);

        finish();

    }

}
