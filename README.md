# -E-Learning-System
In this new era of electronics, we know the concept of e-learning which does not include the use of paper and pen. There are many advantages of e-learning system. In this e-learning system we can assign projects to students and can share documents and more easily. This system has three modules including student, faculties and Admin. Students can login, they have access to main menu, calendar, projects, documentation, to upload, view the things uploaded by the faculties, knowledge books, also send messages to faculties. Faculties can login and have access for viewing, uploading documents and projects. Admin can login and manage the faculties and student details and also view projects. This is how the new concept of e-learning came into existence, which is an easier and smarter system for colleges.


⚙️    Hardware Requirements:<br>
*   Computer with either Intel Pentium processor or AMD processor.<br>
*   1GB+ DDR RAM<br>
*   1GB hard disk drive<br>


💻    Software Requirements:<br>
*   Windows Operating system.<br>
*   JRE and JDK.<br>	
*   MySQL server (WAMP)<br>

# DESIGN<br>
Database Design is a collection of processes that facilitate the designing, development, implementation and maintenance of enterprise data management systems.<br>
It helps produce database systems:<br>
*   That meet the requirements of the users<br>
*   Have high performance.<br>

**Architecture Description** <br>
The design of a DBMS depends on its architecture. It can be centralized or decentralized or hierarchical. The architecture of a DBMS can be seen as either single tier or multi-tier.<br><br>
**ER Diagram**
![image.png](diagrams/ER_Diagram.jpg)

Fig 1: ER Diagram <br><br>
An entity–relationship model describes interrelated things of interest in a specific domain of knowledge (Refer Fig 1). It is composed of entity types and specifies relationships that can exist between instances of those entity types.

**Relational Schema Diagram**

![image_1.png](diagrams/Relatoinal_Schema.jpg)

 Fig 2: Relational Schema <br><br>
Relational schema is a collection of meta-data. Database schema describes the structure and constraints of data representing in a particular domain (Refer Fig 2).

# IMPLEMENTATION <br>
**Description on Implementation**<br>
The goal of this application is to manage the Students, Teachers, Courses and various functions of E-Learning System.

**List of modules with use cases:**<br>
This Java project consists of 3 major modules
*  ***Admin***<br>
   * Admin Login with Username & Password<br>
   * View Profile<br>
   * View Account Information<br>
   * Delete Account<br>
   * Manage Account (Change email, change name, change profile, change password)<br>
   * Admin Adds Subject<br>
   * Admin Deletes Subject<br>
   * View All Teachers Details and Delete Teacher<br>
   * View All Students Details and Delete Student<br>
   * View All Courses Details<br>
   * Add New Admin<br>
   * Logout<br>
*  ***Teacher***<br>
   *  Signup<br>
   *  Teacher Login with Username & Password<br>
   *  View Profile<br>
   *  View Account Information<br>
   *  Delete Account<br>
   *  Manage Account (Change email, change name, change profile, change password)<br>
   *  Teacher Adds Course<br>
   *  View My Students in a Particular course.<br>
   *  View My Courses<br>
   *  Update My Course<br>
   *  Logout<br>
*  ***Student***<br>
   *  Signup<br>
   *  Student Login with Username & Password<br>
   *  View Profile<br>
   *  View Account Information<br>
   *  Delete Account<br>
   *  Manage Account (Change email, change name, change profile, change password)<br>
   *  Student Enrols Courses<br>
   *  Student Study Courses<br>
   *  Student Withdraw Courses<br>
   *  Student Views Participants in a particular course.<br>
   *  Student can Message any participant in a particular course except Teacher.<br>
   *  Logout<br>
