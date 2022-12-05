package com.example.voteapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button btn, btn1, btn2, btn3, btn4, btn5, btn6;
    int vCount[] =new int[6];
    ImageView[] imgV = new  ImageView[6];
    int[] imgID = {R.id.img1, R.id.img2, R.id.img3, R.id.img4, R.id.img5, R.id.img6};
    String Name[] = {"김민영", "이수영", "박지환","이수지","박정연","이민혁"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android:setTitle("회장선거 투표");


        imgV[0]=findViewById(imgID[0]);
        imgV[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), person1.class);
                startActivity(intent);
            }
        });

        imgV[1]=findViewById(imgID[1]);
        imgV[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), person2.class);
                startActivity(intent);
            }
        });

        imgV[2]=findViewById(imgID[2]);
        imgV[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), person3.class);
                startActivity(intent);
            }
        });

        imgV[3]=findViewById(imgID[3]);
        imgV[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), person4.class);
                startActivity(intent);
            }
        });

        imgV[4]=findViewById(imgID[4]);
        imgV[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), person5.class);
                startActivity(intent);
            }
        });

        imgV[5]=findViewById(imgID[5]);
        imgV[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), person6.class);
                startActivity(intent);
            }
        });

        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                vCount[0]++;
                Toast.makeText(getApplicationContext(), "기호 1번에 투표하였습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                vCount[1]++;
                Toast.makeText(getApplicationContext(), "기호 2번에 투표하였습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                vCount[2]++;
                Toast.makeText(getApplicationContext(), "기호 3번에 투표하였습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn4=findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                vCount[3]++;
                Toast.makeText(getApplicationContext(), "기호 4번에 투표하였습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn5=findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                vCount[4]++;
                Toast.makeText(getApplicationContext(),  "기호 5번에 투표하였습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn6=findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                vCount[5]++;
                Toast.makeText(getApplicationContext(), "기호 6번에 투표하였습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), resultvote.class);
                intent.putExtra("vCount", vCount);
                intent.putExtra("Name", Name);
                startActivity(intent);
            }
        });
    }
}
