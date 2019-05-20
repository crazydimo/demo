package com.cwc.service;

import com.cwc.model.Resume;

public interface ResumeService {
    boolean addResume(Resume resume);
    boolean delResume(Resume resume);
    boolean updateResume(Resume resume);
    Resume queryResumeByUid(Resume resume);
    Resume queryResumeById(Resume resume);
    Resume queryResume();
}
