package evercuevas.com.evergram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        this.mostrarToolbar(getResources().getString(R.string.registrate),true);
    }

    // Setiamos el toolbar
    public void mostrarToolbar(String titulo, Boolean backButton){
        Toolbar objTool = findViewById(R.id.ecrToolbar);

        setSupportActionBar(objTool);

        if(getSupportActionBar() != null) getSupportActionBar().setTitle(titulo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(backButton);
    }
}
