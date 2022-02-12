package Utils;

import android.app.Activity;
import android.content.Context;
import android.util.*;

public class LogView extends androidx.appcompat.widget.AppCompatTextView {

    public LogView(Context context) {
        super(context);
    }

    public LogView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LogView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void println(final String msg) {
        ((Activity) getContext()).runOnUiThread( (new Thread(new Runnable() {
            @Override
            public void run() {
                // Display the text we just generated within the LogView.
                appendToLog(msg);
            }
        })));
    }

    // Outputs the string as a new line of log data in the LogView
    public void appendToLog(String s) {
        append("\n" + s);
    }
}
