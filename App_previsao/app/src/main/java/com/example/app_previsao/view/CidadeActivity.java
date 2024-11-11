package com.example.app_previsao.view;

import android.os.Bundle;

import android.widget.ImageView;
;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_previsao.R;
import com.example.app_previsao.adapter.ItemAdapter;
import com.example.app_previsao.model.Item;

import java.util.ArrayList;
import java.util.List;

public class CidadeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Criação da lista de itens
        itemList = new ArrayList<>();
        itemList.add(new Item("Item 1", "Descrição do Item 1"));
        itemList.add(new Item("Item 2", "Descrição do Item 2"));
        itemList.add(new Item("Item 3", "Descrição do Item 3"));

        // Configura o Adapter
        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);

    }
}
