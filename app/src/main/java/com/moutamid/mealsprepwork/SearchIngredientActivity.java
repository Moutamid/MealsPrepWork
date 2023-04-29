package com.moutamid.mealsprepwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.moutamid.mealsprepwork.adapters.SavedAdapter;
import com.moutamid.mealsprepwork.database.RoomDB;
import com.moutamid.mealsprepwork.databinding.ActivitySearchIngredientBinding;
import com.moutamid.mealsprepwork.models.MealModel;

import java.util.ArrayList;
import java.util.List;

public class SearchIngredientActivity extends AppCompatActivity {
    ActivitySearchIngredientBinding binding;
    RoomDB database;
    SavedAdapter adapter;
    List<MealModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchIngredientBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        database = RoomDB.getInstance(this);

        binding.recyclerView.setHasFixedSize(false);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        binding.search.setOnClickListener(v -> {
            if (binding.edt.getText().toString().isEmpty()){
                Toast.makeText(this, "Please add meal name or ingredient", Toast.LENGTH_SHORT).show();
            } else {
                list = database.mealDAO().getAll();
                adapter = new SavedAdapter(SearchIngredientActivity.this, list, list, true);
                adapter.getFilter().filter(binding.edt.getText().toString());
                binding.recyclerView.setAdapter(adapter);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }

}