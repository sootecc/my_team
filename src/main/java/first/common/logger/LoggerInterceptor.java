package first.common.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggerInterceptor extends HandlerInterceptorAdapter{
	
	
	//protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	protected Logger log = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	@Override		//컨트롤러가 호출되지 전에 실행되는 전처리기
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		if(log.isDebugEnabled()) {
			log.debug("================================              START             ============================");
			log.debug(" Request URI \t: "+request.getRequestURI());		//현재 호출된 URI가 뭔지 보여준다.
		}
		return super.preHandle(request, response, handler);
	}
	
	
	@Override		//컨트롤러가 실행되고 난 후 호출되는 후처리기
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
		if(log.isDebugEnabled()) {
			log.debug("================================               END              =============================\n");
		}
	}
}
