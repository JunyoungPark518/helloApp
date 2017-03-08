package com.hanbit.helloapp.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.helloapp.R;
import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;
import com.hanbit.helloapp.serviceImpl.CalcServiceImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etFirstNum, etSecondNum;
    Button btAdd, btSub, btMul, btDiv, btMod, btRes;
    TextView tvRes;
    CalcService service;
    CalcBean bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        service = new CalcServiceImpl();
        bean = new CalcBean();
        etFirstNum = (EditText) findViewById(R.id.etFirstNum);
        etSecondNum = (EditText) findViewById(R.id.etSecondNum);
        btAdd = (Button) findViewById(R.id.btAdd);
        btSub = (Button) findViewById(R.id.btSub);
        btMul = (Button) findViewById(R.id.btMul);
        btDiv = (Button) findViewById(R.id.btDiv);
        btMod = (Button) findViewById(R.id.btMod);
        btRes = (Button) findViewById(R.id.btRes);
        tvRes = (TextView) findViewById(R.id.tvRes);
        btAdd.setOnClickListener(this);
        btSub.setOnClickListener(this);
        btMul.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btMod.setOnClickListener(this);
        btRes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        bean.setFirstNum(Integer.parseInt(etFirstNum.getText().toString()));
        bean.setSecondNum(Integer.parseInt(etSecondNum.getText().toString()));
        Log.d("firstNum=",String.valueOf(bean.getFirstNum()));
        Log.d("secondNum=",String.valueOf(bean.getSecondNum()));
        switch(v.getId()) {
            case R.id.btAdd:
                bean.setResult(service.add(bean));
                break;
            case R.id.btSub:
                bean.setResult(service.sub(bean));
                break;
            case R.id.btMul:
                bean.setResult(service.mul(bean));
                break;
            case R.id.btDiv:
                bean.setResult(service.div(bean));
                break;
            case R.id.btMod:
                bean.setResult(service.mod(bean));
                break;
            case R.id.btRes:
                tvRes.setText("RESULT:"+bean.getResult());
                break;
        }
    }
}
