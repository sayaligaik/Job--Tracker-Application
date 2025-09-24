package com.jobtracker.service;

import com.jobtracker.model.JobApplication;
import com.jobtracker.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public JobApplication addJob(JobApplication job) {
        return jobRepository.save(job);
    }

    public List<JobApplication> getAllJobs() {
        return jobRepository.findAll();
    }

    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}
