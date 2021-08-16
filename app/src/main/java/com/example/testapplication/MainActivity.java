package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){
        states.add(new State ("Бразилия", "Бразилиа"));
        states.add(new State ("Аргентина", "Буэнос-Айрес"));
        states.add(new State ("Колумбия", "Богота"));
        states.add(new State ("Уругвай", "Монтевидео"));
        states.add(new State ("Чили", "Сантьяго"));
        states.add(new State ("Бразилия", "Бразилиа"));
        states.add(new State ("Аргентина", "Буэнос-Айрес"));
        states.add(new State ("Колумбия", "Богота"));
        states.add(new State ("Уругвай", "Монтевидео"));
        states.add(new State ("Чили", "Сантьяго"));
        states.add(new State ("Бразилия", "Бразилиа"));
        states.add(new State ("Аргентина", "Буэнос-Айрес"));
        states.add(new State ("Колумбия", "Богота"));
        states.add(new State ("Уругвай", "Монтевидео"));
        states.add(new State ("Чили", "Сантьяго"));
    }
    
}