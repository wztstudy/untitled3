package org.wzt.service.impl;

import org.springframework.stereotype.Service;
import org.wzt.dao.InvitationMapper;
import org.wzt.model.Invitation;
import org.wzt.service.InvitationService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InvitationServiceImpl implements InvitationService {

    @Resource
    private InvitationMapper invitationMapper;

    @Override
    public Map<String,Object> searchInvitation(int offset, int displayCount) {
        List<Invitation> infos = invitationMapper.searchInvitation(offset,displayCount);
        int totalCount = invitationMapper.totalCount();
        int totalPage = (totalCount%displayCount) == 0 ? totalCount/displayCount : totalCount/displayCount+1;
        Map<String,Object> map = new HashMap<>();
        map.put("infos",infos);
        map.put("totalCount",totalCount);
        map.put("totalPage",totalPage);
        return map;
    }
}
