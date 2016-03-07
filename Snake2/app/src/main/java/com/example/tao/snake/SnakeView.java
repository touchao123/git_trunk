package com.example.tao.snake;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SnakeView extends View {
    private TextView text;
    private Canvas canvas;
    private Paint paint = new Paint();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake_view);
        aaa();
//        loadView();
    }

    public void loadView(){
//        text = (TextView)findViewById(R.id.textView);
//        text.setText("I LOVE YOU!");
    }
    public void aaa(){

        //创建一个的Bitmap对象

        Bitmap bitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888) ;
        //创建一个canvas对象，并且开始绘图
        Canvas canvas = new Canvas (bitmap) ;
        Drawable d = getResources().getDrawable(R.drawable.greenstar,null);
        d.setBounds(100, 100, 40, 40);
        d.draw(canvas);
//        ImageView imgView  = new ImageView(this) ;  //或者其他可以设置背景图片的View控件


        //为ImageView设置图像
        //将Bitmap对象转换为Drawable图像资
//        imgView.setImageBitmap(bitmap);
//        Drawable drawable = new BitmapDrawable(bitmap) ;
//        imgView.setBackgroundDrawable(drawable) ;
    }
    public void drawCanvas(){
        Bitmap bp = Bitmap.createBitmap(300,300, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bp);
        Resources r = this.getResources();
        Drawable title=r.getDrawable(R.drawable.redstar, null);
        title.setBounds(0,0,300,300);
        title.draw(canvas);
//        for(int i=0;i<100;i++){
//            for(int j=0;i<100;i++) {
//                canvas.drawBitmap(bp, i,j,paint);
//            }
//        }
        canvas.drawBitmap(bp,20,20,paint);
        ImageView imagev=new ImageView(this);
        imagev.setImageBitmap(bp);
//        canvas.drawLine(0,0,100,100,);
    }
}
