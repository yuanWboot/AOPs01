package com.zy.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

//切面类
public class MethodAspect {
    //切面方法用于拓展额外功能
    //JoinPoint 连接点 通过连接点可以获取目标方法、类的信息
    public void printExecutionTime(JoinPoint joinPoint){
        //创建时间,获取时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String now = sdf.format(new Date());
        //获取目标方法类的名称
        String className = joinPoint.getTarget().getClass().getName();
        //获取目标方法名称
        String  methodName = joinPoint.getSignature().getName();
        System.out.println("=======>>>>>"+now+":"+className+"."+methodName);
        //获取目标方法参数
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("=======>参数："+arg);
        }
    }

}
