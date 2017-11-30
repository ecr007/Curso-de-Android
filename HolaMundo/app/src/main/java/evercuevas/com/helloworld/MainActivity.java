package evercuevas.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = "{\"nombre\":\"Unai\",\"edad\":28}";

        Gson parse = new Gson();

        Persona obj = (Persona) parse.fromJson(json,Persona.class);

        System.out.print("Nombre -> "+obj.getNombre());
        System.out.print("Edad -> "+obj.getEdad());
    }
}
