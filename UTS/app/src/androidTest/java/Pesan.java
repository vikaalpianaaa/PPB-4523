import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Pesan extends AppCompatActivity {
    EditText nimsiswa, namasiswa;
    Button btnSave, btnView;
    DatabaseReference refrence;
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

        nimsiswa=findViewById(R.id.nimmhs);
        namasiswa=findViewById(R.id.nmmhs);
        btnSave=findViewById(R.id.tombolSave);
        btnView=findViewById(R.id.tombolView);
        data =new Data();

        refrence= FirebaseDatabase.getInstance().getReference().child("CAFFE");

        btnSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data.setNo(nimsiswa.getText().toString().trim());
                data.setPesanan(namasiswa.getText().toString().trim());
                refrence.push().setValue(data);
                Toast.makeText(Pesan.this, "Data Tersimpan", Toast.LENGTH_LONG).show();
            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pesan.this, TampilSemuaData.class);
                startActivity(intent);
            }
        });
    }
}