package com.baomidou.springmvc.platform.aop;

import com.baomidou.springmvc.platform.annotation.DataSourceContext;
import com.baomidou.springmvc.platform.constant.DBSourceEnum;
import com.baomidou.springmvc.platform.jdbc.DbContextHolder;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by maohua on 2017/7/21.
 */
public class DataSourceSwitchAOP {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceSwitchAOP.class);

    public void switchDataSource(JoinPoint joinPoint) {
        DataSourceContext dataSourceContext = findMethodOrClassLevelAnnotation(joinPoint, DataSourceContext.class);
        if (null != dataSourceContext) {
            DbContextHolder.setDbType(dataSourceContext.value());
            return;
        }
        DbContextHolder.setDbType(DBSourceEnum.SOURCE_MYBATIS);
    }

    public static <A extends Annotation> A findMethodOrClassLevelAnnotation(JoinPoint joinPoint, Class<A> annotationClass) {
        Class<?> targetClass = joinPoint.getTarget().getClass();
        String methodName = joinPoint.getSignature().getName();
        try {
            Method method = targetClass.getMethod(methodName);
            Annotation annotationOnMethod = method.getAnnotation(annotationClass);
            if (null != annotationOnMethod) {
                return (A) annotationOnMethod;
            } else {
                do {
                    Annotation annotation = targetClass.getAnnotation(annotationClass);
                    if (null != annotation) {
                        return (A) annotation;
                    }
                    targetClass = targetClass.getSuperclass();
                } while (!Object.class.equals(targetClass));
            }
        } catch (NoSuchMethodException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null;
    }

}
