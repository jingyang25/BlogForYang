package com.blog.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ResponseUtil {
    public static void write(HttpServletResponse response, Object object) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();//获取流，然后赋值给前面的对象
        out.println(object);//输出一些信息，可能很多
        out.flush();//强制刷新  ,把流里的缓冲数据输出
        out.close();//关闭流

    }

}
