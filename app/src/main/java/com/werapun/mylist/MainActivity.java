package com.werapun.mylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] list = { "Aerith Gainsborough", "Barret Wallace", "Cait Sith"
                , "Cid Highwind", "Cloud Strife", "RedXIII", "Sephiroth"
                , "Tifa Lockhart", "Vincent Valentine", "Yuffie Kisaragi"
                , "Cid Highwind", "Cloud Strife", "RedXIII", "Sephiroth"
                , "Tifa Lockhart", "Vincent Valentine", "Yuffie Kisaragi"
                , "Cid Highwind", "Cloud Strife", "RedXIII", "Sephiroth"
                , "Tifa Lockhart", "Vincent Valentine", "Yuffie Kisaragi"
                , "ZackFair" };

//        ListView listView = findViewById(R.id.listView1);
//        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                TextView textView = (TextView)view.findViewById(R.id.tvName);
//                Toast.makeText(getApplicationContext(),
//                        "Clicked on item:" +  position + " : " +
//                                textView.getText(),
//                        Toast.LENGTH_SHORT).show();
//            }
//        });

        RecyclerView listView = findViewById(R.id.listView1);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getApplicationContext(), list);
        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setAdapter(adapter);


    }
}
