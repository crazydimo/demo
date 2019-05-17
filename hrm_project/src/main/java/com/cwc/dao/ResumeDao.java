package com.cwc.dao;

import com.cwc.model.Resume;

public interface ResumeDao {
    boolean addResume(Resume resume);
    boolean delResume(Resume resume);
    boolean updateResume(Resume resume);
    Resume queryResumeByUid(Resume resume);
    Resume queryResume();
}
