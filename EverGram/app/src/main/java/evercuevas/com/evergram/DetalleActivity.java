package evercuevas.com.evergram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        this.mostrarToolbar("",true);
    }

    // Setiamos el toolbar
    public void mostrarToolbar(String titulo, Boolean backButton){
        Toolbar objTool = findViewById(R.id.detalleToolbar);

        setSupportActionBar(objTool);

        if(getSupportActionBar() != null) getSupportActionBar().setTitle(titulo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(backButton);
    }
}
