package com.my.crud.common.lang;

import com.baomidou.mybatisplus.extension.api.R;
import lombok.Data;

/**
 * @author myx
 * @date 2020/11/12 - 10:55
 */
@Data
public class Result {
    private String code;
    private String msg;
    private Object data;

    public static Result succ(String code,String msg,Object data){
        Result result = new Result();
        result.code = code;
        result.msg = msg;
        result.data = data;
        return result;
    }

    public static Result succ(String msg,Object data){
        return Result.succ("200",msg,data);
    }

    public static Result succ(Object data){
        return Result.succ("200","操作成功",data);
    }

    public static Result fail(String code,String msg,Object data){
        Result result = new Result();
        result.code = code;
        result.msg = msg;
        result.data = data;
        return result;
    }
    public static Result fail(String code,String msg){
        return Result.succ(code,msg,null);
    }
    public static Result fail(String msg){
        return Result.succ("400",msg,null);
    }
}
