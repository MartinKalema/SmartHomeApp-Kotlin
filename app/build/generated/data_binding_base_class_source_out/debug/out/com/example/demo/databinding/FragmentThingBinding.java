// Generated by view binder compiler. Do not edit!
package com.example.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.demo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentThingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View divider2;

  @NonNull
  public final LinearLayout firstLayout;

  @NonNull
  public final LinearLayout fourthLayout;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final LinearLayout secondLayout;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final Toolbar thingsToolbar;

  @NonNull
  public final LinearLayout thirdLayout;

  private FragmentThingBinding(@NonNull ConstraintLayout rootView, @NonNull View divider2,
      @NonNull LinearLayout firstLayout, @NonNull LinearLayout fourthLayout,
      @NonNull ImageView imageView3, @NonNull LinearLayout secondLayout,
      @NonNull TextView textView2, @NonNull Toolbar thingsToolbar,
      @NonNull LinearLayout thirdLayout) {
    this.rootView = rootView;
    this.divider2 = divider2;
    this.firstLayout = firstLayout;
    this.fourthLayout = fourthLayout;
    this.imageView3 = imageView3;
    this.secondLayout = secondLayout;
    this.textView2 = textView2;
    this.thingsToolbar = thingsToolbar;
    this.thirdLayout = thirdLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentThingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentThingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_thing, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentThingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider2;
      View divider2 = ViewBindings.findChildViewById(rootView, id);
      if (divider2 == null) {
        break missingId;
      }

      id = R.id.first_layout;
      LinearLayout firstLayout = ViewBindings.findChildViewById(rootView, id);
      if (firstLayout == null) {
        break missingId;
      }

      id = R.id.fourth_layout;
      LinearLayout fourthLayout = ViewBindings.findChildViewById(rootView, id);
      if (fourthLayout == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.second_layout;
      LinearLayout secondLayout = ViewBindings.findChildViewById(rootView, id);
      if (secondLayout == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.things_toolbar;
      Toolbar thingsToolbar = ViewBindings.findChildViewById(rootView, id);
      if (thingsToolbar == null) {
        break missingId;
      }

      id = R.id.third_layout;
      LinearLayout thirdLayout = ViewBindings.findChildViewById(rootView, id);
      if (thirdLayout == null) {
        break missingId;
      }

      return new FragmentThingBinding((ConstraintLayout) rootView, divider2, firstLayout,
          fourthLayout, imageView3, secondLayout, textView2, thingsToolbar, thirdLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
