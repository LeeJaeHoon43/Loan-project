package com.example.loan.service;

import com.example.loan.dto.CounselDTO;

public interface CounselService {
    CounselDTO.Response create(CounselDTO.Request request);
    CounselDTO.Response get(Long counselId);
    CounselDTO.Response update(Long counselId, CounselDTO.Request request);
}
