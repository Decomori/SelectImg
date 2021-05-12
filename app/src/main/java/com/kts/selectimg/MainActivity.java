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

        TabHost tabHost = findViewById(R.id.TabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("DOG").setIndicator("강아지");
        tabSpecDog.setContent(R.id.dog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("CAT").setIndicator("고양이");
        tabSpecCat.setContent(R.id.cat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.rabbit);
        tabHost.addTab(tabSpecRabbit);

        TabHost.TabSpec tabSpecHedgehog = tabHost.newTabSpec("HEDGEHOG").setIndicator("고슴도치");
        tabSpecHedgehog.setContent(R.id.hedgehog);
        tabHost.addTab(tabSpecHedgehog);

        TabHost.TabSpec tabSpecHamster = tabHost.newTabSpec("HAMSTER").setIndicator("햄스터");
        tabSpecHamster.setContent(R.id.hamster);
        tabHost.addTab(tabSpecHamster);

        tabHost.setCurrentTab(0);
    }
}