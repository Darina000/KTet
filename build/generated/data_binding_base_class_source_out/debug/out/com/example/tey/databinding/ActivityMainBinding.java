// Generated by view binder compiler. Do not edit!
package com.example.tey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tey.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnExit;

  @NonNull
  public final Button btnNewGame;

  @NonNull
  public final Button btnResetScore;

  @NonNull
  public final TextView tvHighScore;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnExit,
      @NonNull Button btnNewGame, @NonNull Button btnResetScore, @NonNull TextView tvHighScore) {
    this.rootView = rootView;
    this.btnExit = btnExit;
    this.btnNewGame = btnNewGame;
    this.btnResetScore = btnResetScore;
    this.tvHighScore = tvHighScore;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_exit;
      Button btnExit = ViewBindings.findChildViewById(rootView, id);
      if (btnExit == null) {
        break missingId;
      }

      id = R.id.btn_new_game;
      Button btnNewGame = ViewBindings.findChildViewById(rootView, id);
      if (btnNewGame == null) {
        break missingId;
      }

      id = R.id.btn_reset_score;
      Button btnResetScore = ViewBindings.findChildViewById(rootView, id);
      if (btnResetScore == null) {
        break missingId;
      }

      id = R.id.tv_high_score;
      TextView tvHighScore = ViewBindings.findChildViewById(rootView, id);
      if (tvHighScore == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnExit, btnNewGame,
          btnResetScore, tvHighScore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}