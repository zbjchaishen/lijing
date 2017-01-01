package com.lijing.resource;

import com.google.gson.Gson;
import com.sun.jersey.api.core.InjectParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * Created by chenpeng654 on 2016/8/8.
 */
@Controller
public class IndexResource {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String toAdd(){
        return "index";
    }
}
