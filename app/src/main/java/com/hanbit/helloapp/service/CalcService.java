package com.hanbit.helloapp.service;

import com.hanbit.helloapp.domain.CalcBean;

/**
 * Created by hb2005 on 2017-03-08.
 */

public interface CalcService {
    int add(CalcBean bean);
    int sub(CalcBean bean);
    int mul(CalcBean bean);
    int div(CalcBean bean);
    int mod(CalcBean bean);
}
