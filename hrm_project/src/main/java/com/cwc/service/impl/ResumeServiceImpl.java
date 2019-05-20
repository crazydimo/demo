package com.cwc.service.impl;

import com.cwc.dao.ResumeDao;
import com.cwc.model.Resume;
import com.cwc.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ResumeServiceImpl implements ResumeService {

    @Resource
    private ResumeDao resumeDao;
    public boolean addResume(Resume resume) {
        if (resume==null){
            return false;
        }
        return resumeDao.addResume(resume);
    }

    public boolean delResume(Resume resume) {
        if (resume==null){
            return false;
        }
        return resumeDao.delResume(resume);
    }

    public boolean updateResume(Resume resume) {
        if (resume==null){
            return false;
        }
        return resumeDao.updateResume(resume);
    }

    public Resume queryResumeByUid(Resume resume) {
        if (resume==null){
            return null;
        }
        return resumeDao.queryResumeByUid(resume);
    }

    public Resume queryResumeById(Resume resume) {
        if (resume==null){
            return null;
        }
        return resumeDao.queryResumeById(resume);
    }

    public Resume queryResume() {
        return resumeDao.queryResume();
    }
}
