package com.hanbit.helloapp.serviceImpl;

import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;

/**
 * Created by hb2005 on 2017-03-08.
 */

public class CalcServiceImpl implements CalcService {
    @Override
    public int add(CalcBean bean) {
        return bean.getFirstNum() + bean.getSecondNum();
    }

    @Override
    public int sub(CalcBean bean) {
        return bean.getFirstNum() - bean.getSecondNum();
    }

    @Override
    public int mul(CalcBean bean) {
        return bean.getFirstNum() * bean.getSecondNum();
    }

    @Override
    public int div(CalcBean bean) {
        return bean.getFirstNum() / bean.getSecondNum();
    }

    @Override
    public int mod(CalcBean bean) {
        return bean.getFirstNum() % bean.getSecondNum();
    }
}
