package io.github.pjfopen.novel.core.common.exception;

import io.github.pjfopen.novel.core.common.constant.ErrorCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * className: BusinessException
 * description: 自定义业务异常，用于处理用户请求时，业务错误时抛出
 * <p>
 * 在 Spring 3.2 中，新增了 @ControllerAdvice (opens new window)注解，
 * 用于定义适用于所有 @RequestMapping 方法的 @ExceptionHandler、@InitBinder 和 @ModelAttribute 方法。
 * Spring Boot 默认情况下会映射到 /error 进行异常处理，但是提示十分不友好。
 * 我们可以使用该注解定义 @ExceptionHandler 方法来捕获 Controller 抛出的通用异常，并统一进行处理。
 *
 * @author pjf
 * date: 2022/5/24
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException {
    private final ErrorCodeEnum errorCodeEnum;

    public BusinessException(ErrorCodeEnum errorCodeEnum) {
        // 不调用父类 Throwable的fillInStackTrace() 方法生成栈追踪信息，提高应用性能
        // 构造器之间的调用必须在第一行
        super(errorCodeEnum.getMessage(), null, false, false);
        this.errorCodeEnum = errorCodeEnum;
    }
}