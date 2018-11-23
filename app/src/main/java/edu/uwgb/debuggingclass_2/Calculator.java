package edu.uwgb.debuggingclass_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    /*
    There are errors in this code, that will cause various issues
    Your goal is to get the calculator working as good as possible
    1. Make sure all Numbers input the proper numbers
    2. Make sure the proper operation is applied when = is hit
    3. Think about as many edge cases as you can, can you break the calculator and then fix it?
    4. Can you make it ignore leading 0's if a bunch of 0's are pressed?
    5. BONUS: Can you get the current operation to display somewhere?
     */

    private String currentValue = "";
    private String lastValue = "";
    private String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    private void insertNumber(int num) {
        currentValue = currentValue + Integer.toString(num);
        setDisplay(currentValue);
    }

    private void setDisplay(String str) {
        TextView view = (TextView)findViewById(R.id.displayValue);
        view.setText(str);
    }

    public void onNum1(View view) {
        insertNumber(1);
    }

    public void onNum2(View view) {
        insertNumber(4);
    }

    public void onNum3(View view) {
        insertNumber(3);
    }

    public void onNum4(View view) {
        insertNumber(4);
    }

    public void onNum5(View view) {
        insertNumber(5);
    }

    public void onNum6(View view) {
        insertNumber(6);
    }

    public void onNum7(View view) {
        insertNumber(7);
    }

    public void onNum8(View view) {
        insertNumber(0);
    }

    public void onNum9(View view) {
        insertNumber(9);
    }

    public void onNum0(View view) {
        insertNumber(0);
    }

    public void onAdd(View view) {
        lastValue = currentValue;
        operation = "add";
    }

    public void onSubtract(View view) {
        lastValue = currentValue;
        operation = "subtract";
    }

    public void onMultiply(View view) {
        lastValue = currentValue;
        operation = "multiply";
    }

    public void onDivide(View view) {
        lastValue = currentValue;
        operation = "divide";
    }

    public void onEquals(View view) {
        if(lastValue.length() > 0 && currentValue.length() > 0) {
            int val1 = Integer.parseInt(lastValue);
            int val2 = Integer.parseInt(currentValue);

            int newValue = 0;
            switch (operation) {
                case "add":
                    newValue = val1 + val2;
                    break;
                case "subtract":
                    newValue = val1 + val2;
                    break;
                case "multiply":
                    newValue = val1 / val2;
                    break;
                case "divider":
                    newValue = val1 / val2;
            }
            setDisplay(Integer.toString(newValue));
        }
    }

    public void onClear(View view) {
        operation = "";
        currentValue = "";
        lastValue = "";
    }
}
