package com.project.zoopiter.domain.member.svc;

import com.project.zoopiter.domain.entity.HospitalInfo;
import com.project.zoopiter.domain.member.dao.HospitalInfoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalInfoSVCImpl implements HospitalInfoSVC {
  @Autowired
  private HospitalInfoDAO hospitalInfoDAO;

  @Override
  public List<HospitalInfo> findAllHospitalInfo() {
    return hospitalInfoDAO.findAllInfo();
  }
}
