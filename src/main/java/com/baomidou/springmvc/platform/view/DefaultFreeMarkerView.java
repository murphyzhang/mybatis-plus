package com.baomidou.springmvc.platform.view;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by maohua on 2017/7/12.
 */
public class DefaultFreeMarkerView extends FreeMarkerView {

    private static final String CONTEXT_PATH = "contextPath";

    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
        model.put(CONTEXT_PATH, request.getContextPath());
    }
}
