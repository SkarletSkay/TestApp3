package com.example.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView, recyclerViewIngredients;
    private RecyclerView.Adapter adapter, adapterIngredients;
    private RecyclerView.LayoutManager layoutManagerIngredients;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewIngredients = findViewById(R.id.recycle_view_ingredients);
        recyclerViewIngredients.setHasFixedSize(true);
        layoutManagerIngredients = new LinearLayoutManager(this);
        recyclerViewIngredients.setLayoutManager(layoutManagerIngredients);

        adapterIngredients = new IngredientsRecyclerViewAdapter(new int[][]{
                { R.string.ingredient_1, R.string.ingredient_2,
                        R.string.ingredient_3, R.string.ingredient_4, R.string.ingredient_5,
                        R.string.ingredient_6, R.string.ingredient_7, R.string.ingredient_8},
                {R.string.ingredient_quantity_1, R.string.ingredient_quantity_2,
                        R.string.ingredient_quantity_3, R.string.ingredient_quantity_4,
                        R.string.ingredient_quantity_5, R.string.ingredient_quantity_6,
                        R.string.ingredient_quantity_7, R.string.ingredient_quantity_8}
        });

        recyclerViewIngredients.setAdapter(adapterIngredients);

        recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);


        adapter = new DemoRecycleViewAdapter(new int[]{R.drawable.frap1, R.drawable.frap2,
                R.drawable.frap3, R.drawable.frap4, R.drawable.frap5});

        recyclerView.setAdapter(adapter);
    }

    public void addToCartList(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.added_to_cart),
                Toast.LENGTH_SHORT);
        toast.show();

    }
}
