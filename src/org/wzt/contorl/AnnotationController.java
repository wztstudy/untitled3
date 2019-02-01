package org.wzt.contorl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.wzt.service.InvitationService;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class AnnotationController {

    @Resource
    private InvitationService is;

    @RequestMapping("/search")
    public ModelAndView handleRequest(@RequestParam Map<String,Object> map) throws Exception {
        ModelAndView mv = new ModelAndView();
        int currentPage = Integer.parseInt((String) map.get("currentPage"));
        int displayCount = Integer.parseInt((String) map.get("displayCount"));
        int offset = (currentPage-1)*displayCount;
        Map<String,Object> returnMap = is.searchInvitation(offset,displayCount);
        mv.addAllObjects(returnMap);
        mv.setViewName("search");
        return mv;
    }
}
