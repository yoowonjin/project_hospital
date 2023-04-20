package com.project.zoopiter.domain.member.svc;

import com.project.zoopiter.domain.entity.HospitalInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HospitalInfoSVC {

  List<HospitalInfo> findAllHospitalInfo();
}
