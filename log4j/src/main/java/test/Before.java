package test;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class Before implements MethodBeforeAdvice {
	
	public static Logger logger= Logger.getLogger(Test.class); 

	public void before(Method method, Object[] arg1, Object obj)
			throws Throwable {
		// TODO Auto-generated method stub
		
		
		String LogInfo = "这是前置通知";
		//LogInfo = LogInfo + "方法传递的参数为" + arg1[0].toString();
		logger.info(LogInfo);
		
	}

}
