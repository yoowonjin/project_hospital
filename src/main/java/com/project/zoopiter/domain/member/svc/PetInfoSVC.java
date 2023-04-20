package com.project.zoopiter.domain.member.svc;

import com.project.zoopiter.domain.entity.PetInfo;

import java.util.List;
import java.util.Optional;

public interface PetInfoSVC {
  // 등록
  String saveInfo(PetInfo petInfo);

  // 조회
  Optional<PetInfo> findInfo(Long memberId);

  // 수정
  int updateInfo (Long petNum, PetInfo petInfo);

  // 삭제
  int deleteInfo(Long petNum);
  // 목록
  List<PetInfo> findAll();
}
