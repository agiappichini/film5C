package itts.voltapg.film5c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String film[] = {"Spiderman", "Titanic", "Catwoman", "Superman"};

ListView lvFilm;
Button btnEsci;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFilm = (ListView)findViewById(R.id.lvFilm);
        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, film);
        lvFilm.setAdapter(aaFilm);

        lvFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String titolo = (String)lvFilm.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(), titolo, Toast.LENGTH_LONG).show();
                Log.d("click_procedura", "Hai cliccato sulla " + i + " voce");
            }
        });

        btnEsci = (Button)findViewById(R.id.btnEsci);

        btnEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Stai uscendo",
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}