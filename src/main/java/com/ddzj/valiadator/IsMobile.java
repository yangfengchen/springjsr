package com.ddzj.valiadator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * <p>
 *
 * </p>
 *
 * <p>
 * Copyright: 2019 . All rights reserved.
 * </p>
 * <p>
 * Company: Zsoft
 * </p>
 * <p>
 * CreateDate:2019-07-03
 * </p>
 *
 * @author pc
 * @history Mender:pc；Date:2019-07-03；
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {IsMobileValiadator.class})
public @interface IsMobile {
    //true:参数必须有,进行格式校验      false:参数可以为空,不为空时也要进行进行格式校验
    boolean requried() default true; //这个可有可无
    //提示信息
    String message() default "手机号码格式错误";//通过注解后输出的信息,可以自定义
    Class<?>[] groups() default{};
    Class<?extends Payload>[] payload() default{};
}
