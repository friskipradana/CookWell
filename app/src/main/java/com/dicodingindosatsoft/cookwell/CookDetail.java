package com.dicodingindosatsoft.cookwell;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CookDetail extends AppCompatActivity {

    TextView xnama_recipe, xdetail_recipe, xnama_account, xbahan_bahan, xlangkah_langkah, xlokasi;
    ImageView ximage_recipe, xphoto_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook_detail);


        getSupportActionBar().setLogo(R.drawable.ic_chef);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setTitle(" CookWell");


        ximage_recipe = findViewById(R.id.ximage_recipe);
        xnama_recipe = findViewById(R.id.xnama_recipe);
        xdetail_recipe = findViewById(R.id.xdetail_recipe);
        xphoto_account = findViewById(R.id.xphoto_account);
        xnama_account = findViewById(R.id.xnama_account);
        xlokasi = findViewById(R.id.xlokasi);
        xbahan_bahan = findViewById(R.id.xbahan_bahan);
        xlangkah_langkah = findViewById(R.id.xlangkah_langkah);

        int xximage_recipe = getIntent().getIntExtra("image_recipe", 0);
        String xxnama_recipe = getIntent().getStringExtra("nama_recipe");
        String xxdetail_recipe = getIntent().getStringExtra("detail_recipe");
        int xxphoto_account = getIntent().getIntExtra("photo_account", 0);
        String xxnama_account = getIntent().getStringExtra("nama_account");
        String xxlokasi = getIntent().getStringExtra("lokasi_account");
        String xxbahan_bahan = getIntent().getStringExtra("bahan_bahan");
        String xxlangkah_langkah = getIntent().getStringExtra("langkah_langkah");


        ximage_recipe.setImageResource(xximage_recipe);
        xnama_recipe.setText(xxnama_recipe);
        xdetail_recipe.setText(xxdetail_recipe);
        xphoto_account.setImageResource(xxphoto_account);
        xnama_account.setText(xxnama_account);
        xlokasi.setText(xxlokasi);
        xbahan_bahan.setText(xxbahan_bahan);
        xlangkah_langkah.setText(xxlangkah_langkah);


    }

}
