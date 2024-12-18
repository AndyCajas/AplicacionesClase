// Generated by view binder compiler. Do not edit!
package app.example.pruebagit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import app.example.pruebagit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnDividir;

  @NonNull
  public final AppCompatButton btnMultiplicar;

  @NonNull
  public final AppCompatButton btnRestar;

  @NonNull
  public final AppCompatButton btnSumar;

  @NonNull
  public final EditText etNum1;

  @NonNull
  public final EditText etNum2;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final TextView tvMostrarRespuesta;

  private ActivityMain2Binding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btnDividir,
      @NonNull AppCompatButton btnMultiplicar, @NonNull AppCompatButton btnRestar,
      @NonNull AppCompatButton btnSumar, @NonNull EditText etNum1, @NonNull EditText etNum2,
      @NonNull LinearLayout main, @NonNull TextView tvMostrarRespuesta) {
    this.rootView = rootView;
    this.btnDividir = btnDividir;
    this.btnMultiplicar = btnMultiplicar;
    this.btnRestar = btnRestar;
    this.btnSumar = btnSumar;
    this.etNum1 = etNum1;
    this.etNum2 = etNum2;
    this.main = main;
    this.tvMostrarRespuesta = tvMostrarRespuesta;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDividir;
      AppCompatButton btnDividir = ViewBindings.findChildViewById(rootView, id);
      if (btnDividir == null) {
        break missingId;
      }

      id = R.id.btnMultiplicar;
      AppCompatButton btnMultiplicar = ViewBindings.findChildViewById(rootView, id);
      if (btnMultiplicar == null) {
        break missingId;
      }

      id = R.id.btnRestar;
      AppCompatButton btnRestar = ViewBindings.findChildViewById(rootView, id);
      if (btnRestar == null) {
        break missingId;
      }

      id = R.id.btnSumar;
      AppCompatButton btnSumar = ViewBindings.findChildViewById(rootView, id);
      if (btnSumar == null) {
        break missingId;
      }

      id = R.id.etNum1;
      EditText etNum1 = ViewBindings.findChildViewById(rootView, id);
      if (etNum1 == null) {
        break missingId;
      }

      id = R.id.etNum2;
      EditText etNum2 = ViewBindings.findChildViewById(rootView, id);
      if (etNum2 == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.tvMostrarRespuesta;
      TextView tvMostrarRespuesta = ViewBindings.findChildViewById(rootView, id);
      if (tvMostrarRespuesta == null) {
        break missingId;
      }

      return new ActivityMain2Binding((LinearLayout) rootView, btnDividir, btnMultiplicar,
          btnRestar, btnSumar, etNum1, etNum2, main, tvMostrarRespuesta);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
