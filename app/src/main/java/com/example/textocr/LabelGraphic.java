package com.example.textocr;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.List;


    public class LabelGraphic extends GraphicOverlay.Graphic {

        private final Paint textPaint;
        private final GraphicOverlay overlay;

        private List<String> labels;

        LabelGraphic(GraphicOverlay overlay, List<String> labels) {
            super(overlay);
            this.overlay = overlay;
            this.labels = labels;
            textPaint = new Paint();
            textPaint.setColor(Color.WHITE);
            textPaint.setTextSize(60.0f);
        }

        @Override
        public synchronized void draw(Canvas canvas) {
            float x = overlay.getWidth() / 4.0f;
            float y = overlay.getHeight() / 4.0f;

            for (String label : labels) {
                canvas.drawText(label, x, y, textPaint);
                y = y - 62.0f;
            }
        }
    }


