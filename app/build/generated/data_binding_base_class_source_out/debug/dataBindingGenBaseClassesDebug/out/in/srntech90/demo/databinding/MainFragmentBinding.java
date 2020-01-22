// Generated by data binding compiler. Do not edit!
package in.srntech90.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import in.srntech90.demo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainFragmentBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout main;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recycleView;

  protected MainFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout main, ProgressBar progressBar, RecyclerView recycleView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.main = main;
    this.progressBar = progressBar;
    this.recycleView = recycleView;
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainFragmentBinding>inflateInternal(inflater, R.layout.main_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainFragmentBinding>inflateInternal(inflater, R.layout.main_fragment, null, false, component);
  }

  public static MainFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MainFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainFragmentBinding)bind(component, view, R.layout.main_fragment);
  }
}
