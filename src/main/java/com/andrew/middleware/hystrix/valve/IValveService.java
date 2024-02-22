package com.andrew.middleware.hystrix.valve;

import com.andrew.middleware.hystrix.annotation.DoHystrix;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

public interface IValveService {

    Object access(ProceedingJoinPoint jp, Method method, DoHystrix doHystrix, Object[] args);
}
