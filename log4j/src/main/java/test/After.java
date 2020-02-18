package test;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class After implements AfterReturningAdvice {
	public static Logger logger = Logger.getLogger(Test.class);

	public void afterReturning(Object obj, Method method, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		

		String LogInfo = "这是后置通知";
		logger.info(LogInfo);
	}

}
