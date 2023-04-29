package com.moutamid.mealsprepwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.Toast;

import com.moutamid.mealsprepwork.adapters.SavedAdapter;
import com.moutamid.mealsprepwork.database.RoomDB;
import com.moutamid.mealsprepwork.databinding.ActivitySavedBinding;
import com.moutamid.mealsprepwork.models.MealModel;

import java.util.ArrayList;
import java.util.List;

public class SavedActivity extends AppCompatActivity {
    ActivitySavedBinding binding;
    SavedAdapter adapter;
    RoomDB database;
    List<MealModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySavedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        database = RoomDB.getInstance(this);

        binding.recyclerView.setHasFixedSize(false);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        list = database.mealDAO().getAll();
        adapter = new SavedAdapter(SavedActivity.this, list, true);
        binding.recyclerView.setAdapter(adapter);

  /*      if (savedInstanceState != null) {
            mDataList = savedInstanceState.getParcelableArrayList("dataList");
            adapter.setData(mDataList);
        }*/

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

  /*  @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putParcelableArrayList("dataList", new ArrayList<>(adapter.getData()));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mDataList = savedInstanceState.getParcelableArrayList("dataList");
        adapter.setData(mDataList);
    }*/

/*

 mRecyclerView = findViewById(R.id.recycler_view);
        mAdapter = new MyAdapter(mDataList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        if (savedInstanceState != null) {
            mDataList = savedInstanceState.getParcelableArrayList("dataList");
            mAdapter.setData(mDataList);
        }

        @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putParcelableArrayList("dataList", new ArrayList<>(mAdapter.getData()));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mDataList = savedInstanceState.getParcelableArrayList("dataList");
        mAdapter.setData(mDataList);
    }

    public void setData(List<String> dataList) {
            mDataList = dataList;
            notifyDataSetChanged();
        }

        public List<String> getData() {
            return mDataList;
        }

    <activity android:name=".MainActivity"
          android:configChanges="orientation|screenSize"
          android:screenOrientation="portrait"/>

    */

}