// Generated by view binder compiler. Do not edit!
package com.qiaooapp.menudb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.qiaooapp.menudb.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCartBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCheckout;

  @NonNull
  public final RecyclerView recyclerCart;

  @NonNull
  public final TextView textTotal;

  private ActivityCartBinding(@NonNull LinearLayout rootView, @NonNull Button btnCheckout,
      @NonNull RecyclerView recyclerCart, @NonNull TextView textTotal) {
    this.rootView = rootView;
    this.btnCheckout = btnCheckout;
    this.recyclerCart = recyclerCart;
    this.textTotal = textTotal;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCheckout;
      Button btnCheckout = ViewBindings.findChildViewById(rootView, id);
      if (btnCheckout == null) {
        break missingId;
      }

      id = R.id.recyclerCart;
      RecyclerView recyclerCart = ViewBindings.findChildViewById(rootView, id);
      if (recyclerCart == null) {
        break missingId;
      }

      id = R.id.textTotal;
      TextView textTotal = ViewBindings.findChildViewById(rootView, id);
      if (textTotal == null) {
        break missingId;
      }

      return new ActivityCartBinding((LinearLayout) rootView, btnCheckout, recyclerCart, textTotal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
