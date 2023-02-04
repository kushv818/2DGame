package com.example.a2dgame;

import android.graphics.Bitmap;

public abstract class GameObject {
    protected Bitmap image;
    protected final int rowCount;
    protected final int colCount;
    protected final int imageWidth;
    protected final int imageHeight;
    protected final int spriteWidth;
    protected final int spriteHeight;
    protected int x;
    protected int y;

    public GameObject(Bitmap image, int rowCount, int colCount, int x, int y)  {

        this.image = image;
        this.rowCount= rowCount;
        this.colCount= colCount;

        this.x= x;
        this.y= y;

        this.imageWidth = image.getWidth();
        this.imageHeight = image.getHeight();

        this.spriteWidth = this.imageWidth/ colCount;
        this.spriteHeight= this.imageHeight/ rowCount;
    }

    protected Bitmap createSubImageAt(int row, int col)  {
        // createBitmap(bitmap, x, y, width, height).
        Bitmap subImage = Bitmap.createBitmap(image, col* spriteWidth, row* spriteHeight ,spriteWidth,spriteHeight);
        return subImage;
    }

    public int getX()  {
        return this.x;
    }

    public int getY()  {
        return this.y;
    }


    public int getHeight() {
        return spriteHeight;
    }

    public int getWidth() {
        return spriteWidth;
    }
}
