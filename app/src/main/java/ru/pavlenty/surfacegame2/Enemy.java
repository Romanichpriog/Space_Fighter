package ru.pavlenty.surfacegame2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import java.util.Random;

public class Enemy {
    private Bitmap bitmap;
    private int x;
    private int y;
    private int speed;
    private int speedx;
    private Boolean b;
    private Rect enrec;

    private int maxX;
    private int maxY;
    private int minX;
    private int minY;
    public Enemy(Context context,int screenX, int screenY){

        maxX = screenX;
        maxY = screenY;
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.enemy);
        x=screenX-bitmap.getWidth();
        Random generator = new Random();
        y=generator.nextInt(maxY);
        speed = generator.nextInt(10);
        b=generator.nextBoolean();
        speedx=generator.nextInt(8);
        if (b) {
            speedx = -speedx;
        }
    }
    public void update(int playerSpeed) {

        x -= playerSpeed;
        x -= speed;
        y -= speedx;

        if (y<0 || y>maxY){
            speedx=-speedx;
        }

        if (x < 0) {

            x = maxX;
            Random generator = new Random();
            y = generator.nextInt(maxY);
            speed = generator.nextInt(7);
        }
        enrec = new Rect(x, y, x + bitmap.getWidth(), y + bitmap.getHeight());
    }
    public Rect GTR(){
        return enrec;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Bitmap getBitmap() {
        return bitmap;
    }
}
