package org.wzt.dao;

import org.apache.ibatis.annotations.Param;
import org.wzt.model.Invitation;

import java.util.List;

public interface InvitationMapper {
    List<Invitation> searchInvitation(@Param("offset")int offset, @Param("displayCount") int displayCount);

    int totalCount();
}
