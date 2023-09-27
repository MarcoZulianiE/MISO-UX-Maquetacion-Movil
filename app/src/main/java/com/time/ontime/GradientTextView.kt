package com.time.ontime

import android.content.Context
import android.graphics.Canvas
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Shader
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat

class GradientTextView(context: Context, attrs: AttributeSet? = null) :
    AppCompatTextView(context, attrs) {

    private val startColor = ContextCompat.getColor(context, R.color.spring_green)
    private val endColor = ContextCompat.getColor(context, R.color.picton_blue)

    override fun onDraw(canvas: Canvas?) {
        val paint = paint
        val textWidth = paint.measureText(text.toString())
        val textHeight = paint.descent() - paint.ascent()
        val linearGradient = LinearGradient(
            0f,
            0f,
            0f,
            textHeight,
            startColor,
            endColor,
            Shader.TileMode.CLAMP
        )
        paint.shader = linearGradient
        super.onDraw(canvas)
    }
}