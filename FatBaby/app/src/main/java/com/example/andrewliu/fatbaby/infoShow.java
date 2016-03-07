package com.example.andrewliu.fatbaby;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ProgressBar;

import com.example.andrewliu.fatbaby.BodyCirleShow.BodyProgress;
import com.example.andrewliu.fatbaby.progressbar.CircleProgressBar;

public class infoShow extends AppCompatActivity {
    CircleProgressBar pb1,pb2,pb3,pb4,pb5;
    BodyProgress mBodyProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setLogo(R.drawable.left);
        actionBar.setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_info_show);

        pb1=(CircleProgressBar)findViewById(R.id.roundProgressBar1);
        setProgressBarProgress(pb1,30,"day 1");
        pb2=(CircleProgressBar)findViewById(R.id.roundProgressBar2);
        setProgressBarProgress(pb2,40,"day 2");
        pb3=(CircleProgressBar)findViewById(R.id.roundProgressBar3);
        setProgressBarProgress(pb3,50,"day 3");
        pb4=(CircleProgressBar)findViewById(R.id.roundProgressBar4);
        setProgressBarProgress(pb4,60,"day 4");
        pb5=(CircleProgressBar)findViewById(R.id.roundProgressBar5);
        setProgressBarProgress(pb5,70,"day 5");

        mBodyProgress=(BodyProgress)findViewById(R.id.bodyProgress);
        setBodyProgress(mBodyProgress,60,"加油哦");
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void setProgressBarProgress(CircleProgressBar pb,int progress,String text){
        pb.updateProgressText(progress, text);
    }
    public void setBodyProgress(BodyProgress bp, int progress, String text){
        bp.updateProgressText(progress,text);
    }
}
