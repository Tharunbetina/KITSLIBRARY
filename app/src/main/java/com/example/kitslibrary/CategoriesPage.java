package com.example.kitslibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class CategoriesPage extends AppCompatActivity {

    Animation catbox1_anim;
    CardView catbox1,catbox2,catbox3,catbox4,catbox5,catbox6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_categories_page);

        catbox1_anim = AnimationUtils.loadAnimation(this,R.anim.catbox1_anim);

        catbox1 = findViewById(R.id.catbox1);
        catbox2 = findViewById(R.id.catbox2);
        catbox3 = findViewById(R.id.catbox3);
        catbox4 = findViewById(R.id.catbox4);
        catbox5 = findViewById(R.id.catbox5);
        catbox6 = findViewById(R.id.catbox6);

        catbox1.setAnimation(catbox1_anim);
        catbox2.setAnimation(catbox1_anim);
        catbox3.setAnimation(catbox1_anim);
        catbox4.setAnimation(catbox1_anim);
        catbox5.setAnimation(catbox1_anim);
        catbox6.setAnimation(catbox1_anim);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
    public void tomain (View view){
        Intent i = new Intent(CategoriesPage.this, CreditsPage.class);
        startActivity(i);
    }
}