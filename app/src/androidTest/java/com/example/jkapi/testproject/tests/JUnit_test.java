package com.example.jkapi.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.jkapi.testproject.R;
import com.example.jkapi.testproject.MainActivity;

/**
 * Created by jkapi on 4/18/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;

    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester);
    }
}
