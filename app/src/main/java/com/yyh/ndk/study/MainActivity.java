package com.yyh.ndk.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yyh.ndk.study.ndk.MyNdkUtils;

public class MainActivity extends AppCompatActivity {
    private Button btn_onclick;
    private TextView tv_text_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_onclick = (Button) findViewById(R.id.btn_onclick);
        tv_text_result = (TextView) findViewById(R.id.tv_text_result);
        btn_onclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String  result = new  MyNdkUtils().getMyHelloFormWrold();
                    tv_text_result.setText("Java调C的返回结果为:  "+ result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
