// Generated by view binder compiler. Do not edit!
package com.example.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.demo.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreateRoutineBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton addAction;

  @NonNull
  public final FloatingActionButton addCondition;

  @NonNull
  public final LinearLayout addConditionLayout;

  @NonNull
  public final FloatingActionButton addEvent;

  @NonNull
  public final ImageView cancelButton;

  @NonNull
  public final ConstraintLayout containerOne;

  @NonNull
  public final LinearLayout containerTwo;

  @NonNull
  public final Toolbar createRoutineToolbar;

  @NonNull
  public final EditText enterText;

  @NonNull
  public final LinearLayout invisibleLayout;

  @NonNull
  public final LinearLayout invisibleLayout2;

  @NonNull
  public final TextView invisibleTextview;

  @NonNull
  public final TextView invisibleTextview2;

  @NonNull
  public final RelativeLayout parentContainer;

  @NonNull
  public final ImageView saveIcon;

  @NonNull
  public final TextView showNotification;

  @NonNull
  public final TextView showTime;

  @NonNull
  public final TextView visibleLayout;

  @NonNull
  public final TextView visibleTextview2;

  @NonNull
  public final TextView visibleTextview3;

  private ActivityCreateRoutineBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton addAction, @NonNull FloatingActionButton addCondition,
      @NonNull LinearLayout addConditionLayout, @NonNull FloatingActionButton addEvent,
      @NonNull ImageView cancelButton, @NonNull ConstraintLayout containerOne,
      @NonNull LinearLayout containerTwo, @NonNull Toolbar createRoutineToolbar,
      @NonNull EditText enterText, @NonNull LinearLayout invisibleLayout,
      @NonNull LinearLayout invisibleLayout2, @NonNull TextView invisibleTextview,
      @NonNull TextView invisibleTextview2, @NonNull RelativeLayout parentContainer,
      @NonNull ImageView saveIcon, @NonNull TextView showNotification, @NonNull TextView showTime,
      @NonNull TextView visibleLayout, @NonNull TextView visibleTextview2,
      @NonNull TextView visibleTextview3) {
    this.rootView = rootView;
    this.addAction = addAction;
    this.addCondition = addCondition;
    this.addConditionLayout = addConditionLayout;
    this.addEvent = addEvent;
    this.cancelButton = cancelButton;
    this.containerOne = containerOne;
    this.containerTwo = containerTwo;
    this.createRoutineToolbar = createRoutineToolbar;
    this.enterText = enterText;
    this.invisibleLayout = invisibleLayout;
    this.invisibleLayout2 = invisibleLayout2;
    this.invisibleTextview = invisibleTextview;
    this.invisibleTextview2 = invisibleTextview2;
    this.parentContainer = parentContainer;
    this.saveIcon = saveIcon;
    this.showNotification = showNotification;
    this.showTime = showTime;
    this.visibleLayout = visibleLayout;
    this.visibleTextview2 = visibleTextview2;
    this.visibleTextview3 = visibleTextview3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreateRoutineBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreateRoutineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_create_routine, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreateRoutineBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_action;
      FloatingActionButton addAction = ViewBindings.findChildViewById(rootView, id);
      if (addAction == null) {
        break missingId;
      }

      id = R.id.add_condition;
      FloatingActionButton addCondition = ViewBindings.findChildViewById(rootView, id);
      if (addCondition == null) {
        break missingId;
      }

      id = R.id.add_condition_layout;
      LinearLayout addConditionLayout = ViewBindings.findChildViewById(rootView, id);
      if (addConditionLayout == null) {
        break missingId;
      }

      id = R.id.add_event;
      FloatingActionButton addEvent = ViewBindings.findChildViewById(rootView, id);
      if (addEvent == null) {
        break missingId;
      }

      id = R.id.cancel_button;
      ImageView cancelButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelButton == null) {
        break missingId;
      }

      ConstraintLayout containerOne = (ConstraintLayout) rootView;

      id = R.id.container_two;
      LinearLayout containerTwo = ViewBindings.findChildViewById(rootView, id);
      if (containerTwo == null) {
        break missingId;
      }

      id = R.id.create_routine_toolbar;
      Toolbar createRoutineToolbar = ViewBindings.findChildViewById(rootView, id);
      if (createRoutineToolbar == null) {
        break missingId;
      }

      id = R.id.enter_text;
      EditText enterText = ViewBindings.findChildViewById(rootView, id);
      if (enterText == null) {
        break missingId;
      }

      id = R.id.invisible_layout;
      LinearLayout invisibleLayout = ViewBindings.findChildViewById(rootView, id);
      if (invisibleLayout == null) {
        break missingId;
      }

      id = R.id.invisible_layout2;
      LinearLayout invisibleLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (invisibleLayout2 == null) {
        break missingId;
      }

      id = R.id.invisible_textview;
      TextView invisibleTextview = ViewBindings.findChildViewById(rootView, id);
      if (invisibleTextview == null) {
        break missingId;
      }

      id = R.id.invisible_textview2;
      TextView invisibleTextview2 = ViewBindings.findChildViewById(rootView, id);
      if (invisibleTextview2 == null) {
        break missingId;
      }

      id = R.id.parent_container;
      RelativeLayout parentContainer = ViewBindings.findChildViewById(rootView, id);
      if (parentContainer == null) {
        break missingId;
      }

      id = R.id.save_icon;
      ImageView saveIcon = ViewBindings.findChildViewById(rootView, id);
      if (saveIcon == null) {
        break missingId;
      }

      id = R.id.show_notification;
      TextView showNotification = ViewBindings.findChildViewById(rootView, id);
      if (showNotification == null) {
        break missingId;
      }

      id = R.id.show_time;
      TextView showTime = ViewBindings.findChildViewById(rootView, id);
      if (showTime == null) {
        break missingId;
      }

      id = R.id.visible_layout;
      TextView visibleLayout = ViewBindings.findChildViewById(rootView, id);
      if (visibleLayout == null) {
        break missingId;
      }

      id = R.id.visible_textview_2;
      TextView visibleTextview2 = ViewBindings.findChildViewById(rootView, id);
      if (visibleTextview2 == null) {
        break missingId;
      }

      id = R.id.visible_textview_3;
      TextView visibleTextview3 = ViewBindings.findChildViewById(rootView, id);
      if (visibleTextview3 == null) {
        break missingId;
      }

      return new ActivityCreateRoutineBinding((ConstraintLayout) rootView, addAction, addCondition,
          addConditionLayout, addEvent, cancelButton, containerOne, containerTwo,
          createRoutineToolbar, enterText, invisibleLayout, invisibleLayout2, invisibleTextview,
          invisibleTextview2, parentContainer, saveIcon, showNotification, showTime, visibleLayout,
          visibleTextview2, visibleTextview3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
