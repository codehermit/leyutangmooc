package com.leyutang.common.exception;

import com.leyutang.common.constants.ResultCodeEnum;
import io.swagger.annotations.ApiModelProperty;

public class LeyutangException extends RuntimeException {
    @ApiModelProperty(value = "状态码")
    private Integer code;

    /**
     * 接收状态码和错误消息
     * @param code
     * @param message
     */
    public LeyutangException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public LeyutangException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "GuliException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
