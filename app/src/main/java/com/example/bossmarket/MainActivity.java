package com.example.bossmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Item> itemList;
    Adapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        itemList = new ArrayList<>();
        Item item1 = new Item(R.drawable.yuno_gasai, "Yuno Gasai", "Yandere", "Mirai Nikki");
        Item item2 = new Item(R.drawable.taiga_aisaka, "Taiga Aisaka", "Tsundere", "Toradora!");
        Item item3 = new Item(R.drawable.hinata_hyuga, "Hinata Hyuga", "Dandere", "Naruto");
        Item item4 = new Item(R.drawable.rei_ayanami, "Rei Ayanami", "Kuudere", "Neon Genesis Evangelion");
        Item item5 = new Item(R.drawable.nagi_sanzenin, "Nagi Sanzenin", "Himedere", "Hayate no Gotoku");
        Item item6 = new Item(R.drawable.mahiru_inami, "Mahiru Inami", "Bokodere", "Working!!");
        Item item7 = new Item(R.drawable.yuuko_yoshida, "Yuuko Yoshida", "Bakadere", "Machikado Mazoku");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);


        LinearLayoutManager layoutMan = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutMan);
        myadapter = new Adapter(itemList);
        recyclerView.setAdapter(myadapter);
    }

    public void onClick(View v, int pos){
        Toast.makeText(this,
                "YOU HAVE SELECTED &quot;+ itemList.get(pos).getItemname()",
                Toast.LENGTH_LONG).show();
    }

}