package com.example.v2tien.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyView extends LinearLayout implements BaseAction {
    private TextView textView;
    private EditText editText;

    public MyView(Context context) {
        super(context);
        initView(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        inflate(context, R.layout.my_view, this);
        textView = findViewById(R.id.tv);
        editText = findViewById(R.id.edt);
        editText.addTextChangedListener(new ListenerOnTextChange() {
            @Override
            void getTextCount(int textCount) {
                textView.setText(textCount + " Characters !! ");
            }
        });
    }

    @Override
    public void setHintEditText(CharSequence hint) {
        editText.setHint(hint);
    }

    @Override
    public void setStyle(int style) {

    }

    public TextView getTextView() {
        return textView;
    }

    public EditText getEditText() {
        return editText;
    }
}
