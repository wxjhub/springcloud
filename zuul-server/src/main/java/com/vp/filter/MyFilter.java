package com.vp.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

/**
 * wangxinji
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    public String filterType() {
        // 前置过滤器
        //pre：可以在请求被路由之前调用
        //route：在路由请求时候被调用
        //post：在route和error过滤器之后被调用
        //error：处理请求时发生错误时被调用
        return "pre";
    }

    /**
     * //优先级为0，数字越大，优先级越低
     * @return
     */
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以依据url规则判断是否需要进行过滤 true需要过滤进入run方法 ,false直接忽略
     * @return
     */
    public boolean shouldFilter() {
        /*RequestContext ctx = RequestContext.getCurrentContext();
        log.info(ctx.getRequest().getRequestURI() + " get request path info");
        String url = ctx.getRequest().getRequestURI().toLowerCase();

        // 这里判断url逻辑
        if (url.startsWith("/login")) {
            return false;
        }*/

        return true;
    }

    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if (accessToken != null) {
            return null;
        }
        log.warn("token is null");
        //过滤该请求，不对其进行路由(直接输入返回） 对该请求进行路由(默认就是true)
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
        try {
            ctx.getResponse().getWriter().write("token is null");
        } catch (Exception e) {
        }
        return null;
    }
}
