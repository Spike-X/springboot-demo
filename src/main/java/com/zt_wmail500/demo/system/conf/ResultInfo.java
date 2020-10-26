package com.zt_wmail500.demo.system.conf;

import lombok.Getter;

/**
 * @program: demo
 * @description: 统一返回
 * @author: tao.zhang
 * @create: 2020-10-26 21:42
 **/
@Getter
public class ResultInfo<T> {
    /**
     * 状态码，比如1000代表响应成功
     */
    private final int code;

    /**
     * 响应信息，用来说明响应情况
     */
    private final String msg;

    /**
     * 响应的具体数据
     */
    private final T data;

    public ResultInfo(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public ResultInfo(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
