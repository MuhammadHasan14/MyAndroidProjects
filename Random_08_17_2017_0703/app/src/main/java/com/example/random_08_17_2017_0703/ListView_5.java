package com.example.random_08_17_2017_0703;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mhraz on 8/18/2017.
 */

public class ListView_5 extends AppCompatActivity {

    String[] subnames = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14"
    };

    private ListView lv_subnames;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<String>(ListView_5.this, R.layout.listitem_1,R.id.tv_description, subnames);
        lv_subnames = (ListView) findViewById(R.id.lv_subnames);

        lv_subnames.setAdapter(adapter);

        lv_subnames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i = new Intent(ListView_5.this, ShowBio_1.class);
                i.putExtra("position",position);
                startActivity(i);

/*                Intent j = new Intent(MainActivity.this, ShowBio.class);
                Uri.parse("geo:0,0?q=24.874137,67.029339 ");
                j.putExtra("position",position);
                startActivity(j);*/

/*                Intent k = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=24.874137,67.029339 "));*/

            }
        });
    }
}
