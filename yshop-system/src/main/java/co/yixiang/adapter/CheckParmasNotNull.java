package co.yixiang.adapter;

import cn.hutool.json.JSONObject;
import co.yixiang.annotion.ParamsNotNull;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class CheckParmasNotNull extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(!(handler instanceof HandlerMethod)){
            JSONObject json = new JSONObject();
            json.put("code","404");
            json.put("desc","UnSupport handler");
            response.getWriter().write(json.toString());
            return false;
        }

        response.setHeader("Content-type", "text/html;charset=UTF-8");

        //获取所有请求参数 得到带有某个注解的参数名然后放入集合
        HandlerMethod method = (HandlerMethod) handler;
        Parameter[]  parameters = method.getMethod().getParameters();
        List<String> paramsNameList = new ArrayList<>();
        for(Parameter parameter : parameters){
            //这行代码获参数是否有加   ParamsNotNull 注解（参数非空校验)
            if(parameter.isAnnotationPresent(ParamsNotNull.class)){
                paramsNameList.add(parameter.getName());
            };
        }
        //对参数做某具体的种格式校验
        for(String params : paramsNameList){
            String value = request.getParameter(params);
            if(null==value){
                response.getWriter().write(nullMsg(params).toString());
                return  false;
            }
            value = value.replaceAll(" ","").replaceAll("\\[","")
                    .replaceAll("\\]","").replaceAll("\\{","").replaceAll("\\}","");
            if("".equals(value)){
                response.getWriter().write(nullMsg(params).toString());
                return  false;
            }
        }
        return true;
    }

    public JSONObject nullMsg(String params){
        JSONObject json = new JSONObject();
        json.put("code","404");
        json.put("desc",params+"不能为空");
        return json;
    }
}
