package com.lilac.jersey.injection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * <p>
 * 获取当前登录用户信息
 * </p>
 * @author ${Author}
 * @version ${Version}
 * @since 9.1.0
 *
 */
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface CurrentUser {

}
