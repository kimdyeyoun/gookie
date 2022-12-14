package com.dyna.gookie.mapper;

import com.dyna.gookie.dto.ReplyListDto;
import com.dyna.gookie.entity.Reply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReplyMapper {

    //TODO 해당 국회의원에 대한 댓글 리스트 카운트
    int replyCount(int congressId);

    //TODO 해당 국회의원에 대한 댓글 리스트
    List<ReplyListDto> replyList(@Param("congressId") int congressId, @Param("offset") int offset, @Param("limit") int limit);

    //TODO 댓글 작성
    int replyWrite(Reply reply);

    //TODO 댓글 수정
    int replyModify(Reply reply);

    //TODO 댓글 삭제
    int replyDelete(Reply reply);
}
