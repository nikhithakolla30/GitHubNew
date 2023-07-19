document.addEventListener("DOMContentLoaded", function() {
  const urlParams = new URLSearchParams(window.location.search);
  const category = urlParams.get("category");

  if (category) {
    fetchJobListings(category);
  }
});

function fetchJobListings(category) {
  const jobContainer = document.getElementById("job-listings");
  jobContainer.innerHTML = "";

  let jobListings = [];

  if (category === "information-technology") {
    jobListings = [
      {
        title: "IT Job 1",
        location: "Location 1",
        category: "Information Technology",
        description: "This is IT Job 1 description.",
        company: "Company 1"
      },
      {
        title: "IT Job 2",
        location: "Location 2",
        category: "Information Technology",
        description: "This is IT Job 2 description.",
        company: "Company 2"
      },
      // Add more IT job listings here
    ];
  } else if (category === "finance") {
    jobListings = [
      {
        title: "Finance Job 1",
        location: "Location 1",
        category: "Finance",
        description: "This is Finance Job 1 description.",
        company: "Company 1"
      },
      {
        title: "Finance Job 2",
        location: "Location 2",
        category: "Finance",
        description: "This is Finance Job 2 description.",
        company: "Company 2"
      },
      // Add more finance job listings here
    ];
  } else if (category === "marketing") {
    jobListings = [
      {
        title: "Marketing Job 1",
        location: "Location 1",
        category: "Marketing",
        description: "This is Marketing Job 1 description.",
        company: "Company 1"
      },
      {
        title: "Marketing Job 2",
        location: "Location 2",
        category: "Marketing",
        description: "This is Marketing Job 2 description.",
        company: "Company 2"
      },
      // Add more marketing job listings here
    ];
  } else if (category === "engineering") {
    jobListings = [
      {
        title: "Engineering Job 1",
        location: "Location 1",
        category: "Engineering",
        description: "This is Engineering Job 1 description.",
        company: "Company 1"
      },
      {
        title: "Engineering Job 2",
        location: "Location 2",
        category: "Engineering",
        description: "This is Engineering Job 2 description.",
        company: "Company 2"
      },
      // Add more engineering job listings here
    ];
  } else if (category === "sales") {
    jobListings = [
      {
        title: "Sales Job 1",
        location: "Location 1",
        category: "Sales",
        description: "This is Sales Job 1 description.",
        company: "Company 1"
      },
      {
        title: "Sales Job 2",
        location: "Location 2",
        category: "Sales",
        description: "This is Sales Job 2 description.",
        company: "Company 2"
      },
      // Add more sales job listings here
    ];
  } else if (category === "human-resources") {
    jobListings = [
      {
        title: "Human Resources Job 1",
        location: "Location 1",
        category: "Human Resources",
        description: "This is Human Resources Job 1 description.",
        company: "Company 1"
      },
      {
        title: "Human Resources Job 2",
        location: "Location 2",
        category: "Human Resources",
        description: "This is Human Resources Job 2 description.",
        company: "Company 2"
      },
      // Add more human resources job listings here
    ];
  } else if (category === "customer-service") {
    jobListings = [
      {
        title: "Customer Service Job 1",
        location: "Location 1",
        category: "Customer Service",
        description: "This is Customer Service Job 1 description.",
        company: "Company 1"
      },
      {
        title: "Customer Service Job 2",
        location: "Location 2",
        category: "Customer Service",
        description: "This is Customer Service Job 2 description.",
        company: "Company 2"
      },
      // Add more customer service job listings here
    ];
  } else if (category === "healthcare") {
    jobListings = [
      {
        title: "Healthcare Job 1",
        location: "Location 1",
        category: "Healthcare",
        description: "This is Healthcare Job 1 description.",
        company: "Company 1"
      },
      {
        title: "Healthcare Job 2",
        location: "Location 2",
        category: "Healthcare",
        description: "This is Healthcare Job 2 description.",
        company: "Company 2"
      },
      // Add more healthcare job listings here
    ];
  }

  // Create HTML elements for each job listing
  jobListings.forEach(function(job) {
    const jobElement = document.createElement("div");
    jobElement.classList.add("job");
    jobElement.innerHTML = `
      <h3>${job.title}</h3>
      <p>Location: ${job.location}</p>
      <p>Category: ${job.category}</p>
      <p>${job.description}</p>
      <p>Company: ${job.company}</p>
      <button class="apply-button" data-title="${job.title}">Apply</button>
    `;
    jobContainer.appendChild(jobElement);
  });

  // Add event listener for Apply buttons
  const applyButtons = document.getElementsByClassName("apply-button");
  for (let i = 0; i < applyButtons.length; i++) {
    applyButtons[i].addEventListener("click", handleApplyButtonClick);
  }
}

function handleApplyButtonClick(event) {
  const jobTitle = event.target.dataset.title;
  localStorage.setItem("jobTitle", jobTitle);
  window.location.href = "applicationform.html";
}
