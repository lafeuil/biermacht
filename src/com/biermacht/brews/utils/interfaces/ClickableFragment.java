package com.biermacht.brews.utils.interfaces;

import android.view.MenuItem;
import android.view.View;

public interface ClickableFragment {
  // Method to call when a click event occurs
  public void handleClick(View v);

  // Method to call when this fragmet should update.
  public void update();

  // Method to call when an options item is selected.
  public boolean onOptionsItemSelected(MenuItem i);
}
