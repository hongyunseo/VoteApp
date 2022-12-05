package com.example.voteapp;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resultvote extends AppCompatActivity {

    ImageView[] imgV = new  ImageView[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultvote);
        setTitle("투표 결과");

        ImageView resImg = (ImageView) findViewById(R.id.resImg);
        TextView resText = (TextView) findViewById(R.id.tv1);
        int top = 0;

        Intent intent = getIntent();
        int[] rVote = intent.getIntArrayExtra("vCount");
        String[] rName = intent.getStringArrayExtra("Name");

        int rImg[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6};

        for (int i = 0; i<rVote.length; i++){
            if(rVote[top] < rVote[i])
                top=i;
        }

        rVote.toString();
        resImg.setImageResource(rImg[top]);
        resText.setText(rName[top]+"/"+ rVote[top]+"표" +"\n"+ "\"당선을 축하드립니다.\"");


        Button btn= findViewById(R.id.rbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
