package com.cdac.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/*")
public class counterfilter extends HttpFilter implements Filter {

  ServletContext sCtx = request.getServletcontext();
  Integer hitCounter = (Integer) sCtx.getAttribute("hitCounter");
  if(hitCounter == null)
	  hitCounter = 0;
  hitCounter ++;
  sCtx.setAttribute("hitCounter", hitCounter);

			
		
		chain.doFilter(request, response);
	}

	

}
