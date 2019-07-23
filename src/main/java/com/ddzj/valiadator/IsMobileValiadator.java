package com.ddzj.valiadator;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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

public class IsMobileValiadator  implements ConstraintValidator<IsMobile, String> {
    /**注意的是:ConstraintValidator<IsMobile, String>
     * 第一个参数就是自定义注解的名字 第二个就是注解修饰的字段类型
     */

    //申明一个required 默认的值为false
    public boolean required = false;


    public void initialize(IsMobile constraintAnnotation) {

        //初始化:拿到IsMobile中的required中的值
        required = constraintAnnotation.requried();

    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        //判断value是否必须 required为true则为必须 反之不是必须的
        if(required)
        {
            System.out.println("xxxxxxxxx");
            //必须的
            return true;
        }
        else
        {
            //判断值是否为空
            if(StringUtils.isEmpty(value))
            {
                //为空的时候返回true
                return true;
            }
            System.out.println("xxxxx1111");
            //否则进行格式校验
            return true;

        }

    }
}
