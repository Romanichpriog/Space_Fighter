package ru.pavlenty.surfacegame2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    private Bitmap bitmap;
    public Explosion(Context context){
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.boom);

    }
    public Bitmap getBitmap() {
        return bitmap;
    }
}
