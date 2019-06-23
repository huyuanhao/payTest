package com.payTest.http;

import com.allen.library.bean.BaseData;
import com.payTest.PayBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @author PC
 * @date 2019/05/09 16:25
 */
public interface ApiService {

    /**
     六、发起付款[post/payStart]
     请求参数：均为必填
     business_id    商户自己平台订单号，需保证唯一性
     uid            商户账号id
     channel        支付通道 0--支付宝收款码  1--微信收款码  2--支付宝转账  3--支付宝转银行卡
     money          金额
     auth_key        验证key
     auth_value      验证value
     返回参数为object类型，字段有：
     business_id    商户自己平台id
     money          金额
     platform_id    平台订单号
     qrcode         二维码链接
     */
    @POST("payStart")
    Observable<BaseData<PayBean>> payStart(@Query("business_id") String business_id, @Query("uid") String uid, @Query("channel") String channel,
                                           @Query("money") String money, @Query("auth_key") String auth_key, @Query("auth_value") String auth_value);
}
