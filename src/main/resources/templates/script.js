const API_URL = "http://localhost:8080/api/students";

document.getElementById("studentForm").addEventListener("submit", async (e) => {
    e.preventDefault();

    const student = {
        firstname: document.getElementById("firstname").value,
        lastname: document.getElementById("lastname").value,
        genderId: parseInt(document.getElementById("gender_id").value),
        desc: document.getElementById("desc").value,
    };

    await fetch(API_URL, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(student),
    });

    loadStudents();
});

async function loadStudents() {
    const response = await fetch(API_URL);
    const students = await response.json();

    const tableBody = document.getElementById("studentTable");
    tableBody.innerHTML = "";

    students.forEach((student) => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td>${student.id}</td>
            <td>${student.firstname}</td>
            <td>${student.lastname}</td>
            <td>${student.genderId}</td>
            <td>${student.desc}</td>
            <td>
                <button onclick="deleteStudent(${student.id})">Delete</button>
            </td>
        `;
        tableBody.appendChild(row);
    });
}

async function deleteStudent(id) {
    await fetch(`${API_URL}/${id}`, { method: "DELETE" });
    loadStudents();
}

// Load students on page load
loadStudents();
