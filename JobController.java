package com.jobtracker.controller;

import com.jobtracker.model.JobApplication;
import com.jobtracker.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*")
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<JobApplication> getJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping
    public JobApplication addJob(@RequestBody JobApplication job) {
        return jobService.addJob(job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
    }
}
