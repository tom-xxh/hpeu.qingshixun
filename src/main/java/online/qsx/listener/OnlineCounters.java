package online.qsx.listener;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCounters extends HttpServlet implements HttpSessionListener {
	private static final long serialVersionUID = 1L;
	private static int sessionCounters = 0;
	@Override
	public void sessionCreated(HttpSessionEvent se){
		sessionCounters++;
		se.getSession().setAttribute("count", sessionCounters);
		System.out.println(sessionCounters+"00000000000000");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se){
		sessionCounters--;
		se.getSession().setAttribute("count", sessionCounters);
	}
	public static int getSessionCounters() {
		return sessionCounters;
	}
	
}
