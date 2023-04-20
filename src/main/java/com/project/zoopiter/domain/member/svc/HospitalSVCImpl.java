package com.project.zoopiter.domain.member.svc;

import com.project.zoopiter.domain.entity.Hospital;
import com.project.zoopiter.domain.member.dao.HospitalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HospitalSVCImpl implements HospitalSVC {
  @Autowired
  private HospitalDAO hospitalDAO;

  @Override
  public List<Hospital> findAllHospitals() {
    return hospitalDAO.findAll();
  }
}