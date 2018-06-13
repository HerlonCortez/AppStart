package android.usuario.appstart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ctN1,ctN2;
    Button btSomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctN1 = (EditText)findViewById(R.id.ctN1);
        ctN2 = (EditText)findViewById(R.id.ctN2);
        btSomar = (Button)findViewById(R.id.btSomar);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int n1 = Integer.parseInt(ctN1.getText().toString());
                    int n2 = Integer.parseInt(ctN2.getText().toString());
                    int result = n1 + n2;
                    Toast.makeText(MainActivity.this,"A Soma é "+result,Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Campo(s) vazio", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
