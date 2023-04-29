package com.moutamid.mealsprepwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.ProgressDialog;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.JsonArray;
import com.moutamid.mealsprepwork.adapters.SavedAdapter;
import com.moutamid.mealsprepwork.database.RoomDB;
import com.moutamid.mealsprepwork.databinding.ActivitySearchBinding;
import com.moutamid.mealsprepwork.models.MealModel;
import com.moutamid.mealsprepwork.utlis.Constants;
import com.moutamid.mealsprepwork.utlis.VolleySingleton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    ActivitySearchBinding binding;
    SavedAdapter adapter;
    List<MealModel> list;
    private RequestQueue requestQueue;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Fetching Meals");

        binding.recyclerView.setHasFixedSize(false);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        requestQueue = VolleySingleton.getmInstance(SearchActivity.this).getRequestQueue();

        list = new ArrayList<>();

        binding.search.setOnClickListener(v -> {
            if (binding.edt.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please add meal name or ingredient", Toast.LENGTH_SHORT).show();
            } else {
                search(binding.edt.getText().toString());
            }
        });

    }

    private void search(String name) {
        list.clear();
        String url = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + name;
        progressDialog.show();

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                response -> {
                    try {
                        JSONArray jsonArray = response.getJSONArray("meals");

                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject object = jsonArray.getJSONObject(i);

                            MealModel model = new MealModel();
                            model.setMeal(object.getString("strMeal"));
                            model.setMealThumb(object.getString("strMealThumb"));
                            list.add(model);
                        }

                        adapter = new SavedAdapter(SearchActivity.this, list, false);
                        binding.recyclerView.setAdapter(adapter);
                        progressDialog.dismiss();
                    } catch (JSONException e) {
                        progressDialog.dismiss();
                        Toast.makeText(this, "No Meal found", Toast.LENGTH_LONG).show();
                    }
                }, error -> {
            progressDialog.dismiss();
            Toast.makeText(this, "No Meal found", Toast.LENGTH_LONG).show();
        });

        requestQueue.add(jsonObjectRequest);
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