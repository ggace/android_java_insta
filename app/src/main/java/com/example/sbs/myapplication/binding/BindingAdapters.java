package com.example.sbs.myapplication.binding;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.example.sbs.myapplication.util.Util;

public class BindingAdapters {
    @BindingAdapter({"numberText"})
    public static void numberText(TextView view, int number) {
        view.setText(number + "");
    }

    @BindingAdapter({"imgUrl"})
    public static void imgUrl(ImageView view, String imgUrl) {
        Util.loadImageOn(imgUrl, view);
    }
}