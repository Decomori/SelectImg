package com.kts.selectimg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("3차 과제 - 탭호스트");

        TabHost tabHost = findViewById(R.id.TabHost); //TapHost 변수 생성
        tabHost.setup();

        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("DOG").setIndicator("강아지");
        //setIndicator로 화면에 보여줄 글자 설정, 연결할 탭스펙을 태그로 설정
        tabSpecDog.setContent(R.id.dog); //탭스펙을 탭과 연결
        tabHost.addTab(tabSpecDog); //탭을 호스트에 부착

        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("CAT").setIndicator("고양이");
        tabSpecCat.setContent(R.id.cat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.rabbit);
        tabHost.addTab(tabSpecRabbit);

        TabHost.TabSpec tabSpecHedgehog = tabHost.newTabSpec("HEDGEHOG").setIndicator("고슴\n도치");
        tabSpecHedgehog.setContent(R.id.hedgehog);
        tabHost.addTab(tabSpecHedgehog);

        TabHost.TabSpec tabSpecHamster = tabHost.newTabSpec("HAMSTER").setIndicator("햄스터");
        tabSpecHamster.setContent(R.id.hamster);
        tabHost.addTab(tabSpecHamster);

        tabHost.setCurrentTab(0);
    }
}