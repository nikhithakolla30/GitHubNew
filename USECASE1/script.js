// Function to fetch and display job listings based on the selected category
function fetchJobListings(category) {
  const jobContainer = document.getElementById("job-listings");
  jobContainer.innerHTML = ""; // Clear the existing job listings

  let jobListings = [];

  if (category === "information-technology") {
    jobListings = [
      { title: "IT Job 1", company: "Company 1" },
      { title: "IT Job 2", company: "Company 2" },
      // Add more IT job listings here
    ];
  } else if (category === "finance") {
    jobListings = [
      { title: "Finance Job 1", company: "Company 1" },
      { title: "Finance Job 2", company: "Company 2" },
      // Add more finance job listings here
    ];
  } else if (category === "marketing") {
    jobListings = [
      { title: "Marketing Job 1", company: "Company 1" },
      { title: "Marketing Job 2", company: "Company 2" },
      // Add more marketing job listings here
    ];
  } else if (category === "engineering") {
    jobListings = [
      { title: "Engineering Job 1", company: "Company 1" },
      { title: "Engineering Job 2", company: "Company 2" },
      // Add more engineering job listings here
    ];
  } else if (category === "sales") {
    jobListings = [
      { title: "Sales Job 1", company: "Company 1" },
      { title: "Sales Job 2", company: "Company 2" },
      // Add more sales job listings here
    ];
  } else if (category === "human-resources") {
    jobListings = [
      { title: "Human Resources Job 1", company: "Company 1" },
      { title: "Human Resources Job 2", company: "Company 2" },
      // Add more human resources job listings here
    ];
  } else if (category === "customer-service") {
    jobListings = [
      { title: "Customer Service Job 1", company: "Company 1" },
      { title: "Customer Service Job 2", company: "Company 2" },
      // Add more customer service job listings here
    ];
  } else if (category === "healthcare") {
    jobListings = [
      { title: "Healthcare Job 1", company: "Company 1" },
      { title: "Healthcare Job 2", company: "Company 2" },
      // Add more healthcare job listings here
    ];
  } else if (category === "education") {
    jobListings = [
      { title: "Education Job 1", company: "Company 1" },
      { title: "Education Job 2", company: "Company 2" },
      // Add more education job listings here
    ];
  } else if (category === "hospitality") {
    jobListings = [
      { title: "Hospitality Job 1", company: "Company 1" },
      { title: "Hospitality Job 2", company: "Company 2" },
      // Add more hospitality job listings here
    ];
  }

  // Create HTML elements for each job listing
  jobListings.forEach(function(job) {
    const jobElement = document.createElement("div");
    jobElement.classList.add("job");
    jobElement.innerHTML = `
      <h3>${job.title}</h3>
      <p>${job.company}</p>
    `;
    jobContainer.appendChild(jobElement);
