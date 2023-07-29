// Generated by view binder compiler. Do not edit!
package com.example.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class FragmentIdeasBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView firstImageTextview;

  @NonNull
  public final Toolbar ideasToolbar;

  private FragmentIdeasBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView firstImageTextview, @NonNull Toolbar ideasToolbar) {
    this.rootView = rootView;
    this.firstImageTextview = firstImageTextview;
    this.ideasToolbar = ideasToolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentIdeasBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentIdeasBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ideas, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentIdeasBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.first_image_textview;
      TextView firstImageTextview = ViewBindings.findChildViewById(rootView, id);
      if (firstImageTextview == null) {
        break missingId;
      }

      id = R.id.ideas_toolbar;
      Toolbar ideasToolbar = ViewBindings.findChildViewById(rootView, id);
      if (ideasToolbar == null) {
        break missingId;
      }

      return new FragmentIdeasBinding((ConstraintLayout) rootView, firstImageTextview,
          ideasToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
