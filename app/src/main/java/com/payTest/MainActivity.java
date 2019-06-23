package com.payTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.allen.library.RxHttpUtils;
import com.allen.library.bean.BaseData;
import com.allen.library.interceptor.Transformer;
import com.google.gson.JsonObject;
import com.payTest.http.ApiService;
import com.youth.xframe.utils.http.DialogObserver;
import com.youth.xframe.widget.XToast;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4;
    private String channel = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void c1(View view) {
        channel = "0";
        pay();
    }

    public void c2(View view) {
        channel = "1";
        pay();
    }

    public void c3(View view) {
        channel = "2";
        pay();
    }

    public void c4(View view) {
        channel = "3";
        pay();
    }

    public void pay(){
        RxHttpUtils.createApi(ApiService.class)
                .payStart("2019623", "CMCUGOCA",channel,"0.01","VF8HPSPE","2d43ae5c8b2840ca94f848e12096e312")
                .compose(Transformer.<BaseData<PayBean>>switchSchedulers())
                .subscribe(new DialogObserver<PayBean>() {
                    @Override
                    protected void onError(String errorMsg) {

                    }

                    @Override
                    protected void onSuccess(PayBean data) {
                        XToast.success(data.getQrcode());
                    }
                });
    }
}
