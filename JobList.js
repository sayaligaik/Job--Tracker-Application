import React from 'react';

function JobList({ jobs }) {
  return (
    <div>
      {jobs.map(job => (
        <div key={job.id} style={{border: '1px solid #ccc', margin: '10px', padding: '10px'}}>
          <h3>{job.position} at {job.company}</h3>
          <p>Status: {job.status}</p>
        </div>
      ))}
    </div>
  );
}

export default JobList;
