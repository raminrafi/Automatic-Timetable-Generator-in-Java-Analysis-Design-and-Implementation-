# Analysis, Design and Implementation of Automatic Timetable generator (Desktop application) in Java.
Open the given SQL file using SQL Server Management Studio. (We have used the login user with userid='ramin_rafi' and password='12569')
Open the project folder in NetBeans.
Establish connection with SQL by adding jar files: sqljdbc42.jar and mysql-connector.jar
Run project. The main page opens up. 
Select either one of the login options or the admin signup option.
Fill the required fields accordingly.

    1.If you've logged in as a student, you can view your timetable by clicking on its button.

    2.If you've logged in as an instructor, you can  view your timetable or choose the option to communicate with other instructors via messages.

    3.If you've logged in as an admin, you can choose from the following options:

                a)Generate Timetable
                      Timetable generated will be displayed.

                b)View Timetable
                       You may choose from the following 4 options:
                           1.View Timetable Instructorwise by entering InstructorID
                           2.View Timetable Coursewise by entering CourseID
                           3.View Timetable Batch and Departmentwise by entering BatchID and DepartmentID
                           4.View Timetable (overall timetable)

                c)Update Timetable
                         You may choose from the following 10 options and then enter the fill the required fields:
                            1.Add Slot
                            2.Remove Slot
                            3.Add Instructor
                            4.Remove Instructor
                            5.Add Section
                            6.Remove Section
                            7.Add Course
	          8.Remove Course
                            9.Add Venue
	          10.Remove Venue
		
                d)Delete Timetable

     4.Successfully signing up as an admin will take you to the admin page (refer to the above option)

Once you're done, you may logout.


