package com.xue.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回结果类
 * @author xxx
 * @create 2022-07-28 14:39
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{


    private Integer code;
    private String message;
    private T date;


    public CommonResult(Integer code,String message){
        this(code,message,null);
    }



}
