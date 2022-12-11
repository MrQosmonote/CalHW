package com.example.calculaterhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display =findViewById(R.id.textView);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.display).equals(display.getText().toString())){
                    display.setText("");
                }
            }
        });

    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursePos = display.getSelectionStart();
        String leftStr = oldStr.substring(0,cursePos);
        String rightStr = oldStr.substring(cursePos);
        display.setText(String.format("%s%s%s",leftStr,strToAdd));
    }


    public void buttonZero(View view){
        updateText("0");

    }
    public void buttonOne(View view){
        updateText("1");

    }
    public void buttonTwo(View view){
        updateText("2");

    }
    public void buttonThree(View view){
        updateText("3");

    }
    public void buttonFour(View view){
        updateText("4");

    }
    public void buttonFive(View view){
        updateText("5");

    }
    public void buttonSix(View view){
        updateText("6");

    }
    public void buttonSeven(View view){
        updateText("7");

    }
    public void buttonEight(View view){
        updateText("8");

    }
    public void buttonNine(View view){
        updateText("9");

    }
    public void buttonMultiply(View view){
        updateText("×");

    }
    public void buttonSubtract(View view){
        updateText("-");

    }
    public void buttonAdd(View view){
        updateText("+");

    }
    public void buttonDivide(View view){
        updateText("÷");

    }
    public void buttonEquals(View view){

    }
    public void buttonClear(View view){
        updateText("");

    }
    public void buttonPrantheses(View view){

    }
    public void buttonPlusMinus(View view){
        updateText("-");

    }
    public void buttonDot(View view){
        updateText(".");

    }
    public void buttonExponent(View view){
        updateText("^");

    }
    public void buttonBack(View view){

    }
}