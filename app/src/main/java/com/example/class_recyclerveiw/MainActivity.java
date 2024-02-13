package com.example.class_recyclerveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int [] images = {R.drawable.chel,R.drawable.chelsea,R.drawable.chelsea_ser
            ,R.drawable.gold_chelsea,R.drawable.beuty,R.drawable.cheshirt
            ,R.drawable.chgelsea_shirt,R.drawable.gooliy};
    ArrayList<CardModel> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setUpModel() {
        String[] texts = getResources().getStringArray(R.array.whatever);
        for (int i = 0; i < texts.length; i++) {
            models.add(new CardModel(texts[i], images[i]));
        }
    }
}

