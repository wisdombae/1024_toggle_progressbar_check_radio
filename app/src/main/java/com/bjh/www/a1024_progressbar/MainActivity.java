package com.bjh.www.a1024_progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);      // findViewById: Resource를 매우 많이 잡아먹음
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        textView = (TextView) findViewById(R.id.textView);
        progressBar.setVisibility(View.GONE);   // progressBar 초기 상태: GONE
        textView.setVisibility(View.GONE);      // textView 초기 상태: GONE
    }

    public void onClickWidget(View view) {

        int id = view.getId();
        String text_togglebutton;
        String text_checkbox;
        String text_radiobutton;

        switch(id) {

            case R.id.toggleButton:
                text_togglebutton = ((Button)view).getText().toString();
                textView.setVisibility(View.VISIBLE);
                textView.setText(text_togglebutton);

                if(toggleButton.isChecked()) {
                    progressBar.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                }
                else {
                    progressBar.setVisibility(View.GONE);
                    textView.setVisibility(View.GONE);
                }
                break;

            case R.id.checkBox1:
                text_checkbox = ((CheckBox)view).getText().toString();
                checkBoxStatePrint(view, text_checkbox);
                break;
            case R.id.checkBox2:
                text_checkbox = ((CheckBox)view).getText().toString();
                checkBoxStatePrint(view, text_checkbox);
                break;
            case R.id.checkBox3:
                text_checkbox = ((CheckBox)view).getText().toString();
                checkBoxStatePrint(view, text_checkbox);
                break;

            case R.id.radioButton1:
                text_radiobutton = ((RadioButton)view).getText().toString();
                radioBoxStatePrint(view, text_radiobutton);
                break;
            case R.id.radioButton2:
                text_radiobutton = ((RadioButton)view).getText().toString();
                radioBoxStatePrint(view, text_radiobutton);
                break;
            case R.id.radioButton3:
                text_radiobutton = ((RadioButton)view).getText().toString();
                radioBoxStatePrint(view, text_radiobutton);
                break;

            default:
                /*
                textView.setText(text_radiobutton);
                text_radiobutton = "NOTHING";
                textView.setVisibility(View.VISIBLE);
                */
        }
    }

    public void checkBoxStatePrint(View view, String str) {
        if (((CheckBox)view).isChecked()) {
            textView.setVisibility(View.VISIBLE);
            textView.setText(str);
            str = str + " - " + ((CheckBox)view).isChecked();
        }
        else {
            textView.setVisibility(View.GONE);
        }
    }

    public void radioBoxStatePrint(View view, String str) {
        textView.setVisibility(View.VISIBLE);
        textView.setText(str);
    }
}
