import React, { useEffect, useState } from 'react';
import JobList from '../components/JobList';

function Dashboard() {
  const [jobs, setJobs] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/jobs')
      .then(res => res.json())
      .then(data => setJobs(data));
  }, []);

  return (
    <div>
      <h1>Job Tracker Dashboard</h1>
      <JobList jobs={jobs} />
    </div>
  );
}

export default Dashboard;
