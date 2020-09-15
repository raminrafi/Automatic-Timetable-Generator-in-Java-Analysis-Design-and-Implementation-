use master
go
create database project
go
use project
go

drop database project
go

create table Department
(
    departmentID varchar(30)  primary key,
	name varchar(30),
	coursesOffered varchar(50)
)

create table [User]
(
    userID varchar(50),
	fname varchar(30),
	lname varchar(30),
	department varchar(30),
	email varchar(50),
	[password] varchar(30),
	phoneNumber varchar(20),
	[role] int,
	isLoggedIn int,
	CONSTRAINT PK_User PRIMARY KEY (userID,department),
	FOREIGN KEY (department) REFERENCES [Department],
)
go

create table Instructor
(
	instructorID varchar(50) ,
	department varchar(30),
	numOfCourses int,
	course varchar(10),
	section varchar(10)
	CONSTRAINT PK_Instructor PRIMARY KEY (instructorID,department),
	FOREIGN KEY (department) REFERENCES [Department]
)
go

create table Student
(
    rollNumber varchar(50),
	numOfCourses int,
	CGPA float,
	batch varchar(10),
	course varchar(10),
	currentCreditHrs int
)
go

create table Batch
(
	batchID varchar(10) not null primary key,
	[year]  int,
	discipline varchar(30)
)
go

go

create table Course(
	courseID varchar(10),
	name varchar(50),
	creditHrs int,
	timeduration float,
	prereq varchar(50) ,
	instructor varchar(50),
	sections int,
	departmentID varchar(30),
	batchID varchar(10)
	CONSTRAINT PK_Course PRIMARY KEY (courseID,departmentID),
	FOREIGN KEY (departmentID) REFERENCES Department,
	FOREIGN KEY (batchID) REFERENCES Batch,
	FOREIGN KEY (instructor,departmentID) REFERENCES Instructor --check
)
go

create table Section
(
    name varchar(10),
	currentSeats int,
	maxSeats int,
	courseID varchar(50),
	CONSTRAINT PK_Section PRIMARY KEY (name,courseID)
)
go


create table Venue
(
	venue varchar(10) primary key
)
go 

create table TimeSlot
(
	id int,
	StartTime varchar(10),
	EndTime varchar(10),
	[Day] varchar(10),
	Duration float,
	Venue varchar(10) not null,
	isAvailable varchar(10),
	courseID varchar(50),
	Section varchar(10),
	CONSTRAINT PK_Slot PRIMARY KEY (StartTime,EndTime,Venue,[Day]),
	FOREIGN KEY (Venue) REFERENCES [Venue] 
)
go



drop table Course 
go
drop table Student 
go
drop table Batch 
go
drop table Venue
go
drop table TimeSlot
go
drop table Department
go
drop table Section
go
drop table Instructor
go
drop table [User]
go



CREATE TABLE Messages
(
	threadID int,
	instructorID varchar(50),
	textMessage varchar(100),
)

INSERT INTO Messages VALUES(0,'farahmunirCS','Hi');
INSERT INTO Messages VALUES(0,'lehmiakiranCS','How are you!');
INSERT INTO Messages VALUES(0,'lehmiakiranCS','Great!');


INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSCS2017',2017,'Computer Science');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSCV2017',2017,'Civil Engineering');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSEE2016',2016,'Electrical Engineering');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSEE2018',2018,'Electrical Engineering');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSAF2017',2017,'Accounting and Finance');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BBA2017',2017,'Business Admnistration');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BBA2018',2018,'Business Admnistration');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('MSCS2017',2017,'Computer Science');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSCV2015',2015,'Civil Engineering');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSCV2018',2018,'Civil Engineering');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSCS2018',2018,'Computer Science');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSCS2019',2019,'Computer Science');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSCS2016',2016,'Computer Science');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('MSL2018',2018,'Sciece and Humanities');
INSERT INTO Batch (batchID, [year], discipline) VALUES ('BSL2018',2018,'Sciece and Humanities');


INSERT INTO Department VALUES ('CS','Computer Science',NULL);
INSERT INTO Department VALUES ('EE','Electrical Engineering',NULL);
INSERT INTO Department VALUES ('MT','Management',NULL);
INSERT INTO Department VALUES ('CV','Civil Engineering',NULL);
INSERT INTO Department VALUES ('SH','Sciece and Humanities',NULL);



INSERT INTO [User] VALUES ('zareenalamgirCS','Zareen','Alamgir','CS','zareen.alamgir@nu.edu.pk','passwordza','0333-9876543',NULL,0);
INSERT INTO [User] VALUES ('kashifzafarCS','Kashif','Zafar','CS','kashif.zafar@nu.edu.pk','passwordkz','0333-9876543',NULL,0);
INSERT INTO [User] VALUES ('amirwaliCS','Amir','Wali','CS','amir.wali@nu.edu.pk','passwordaw','0333-9876544',NULL,0);
INSERT INTO [User] VALUES ('samanshahidCS','Saman','Shahid','CS','saman.shahid@nu.edu.pk','passwordss','0333-9876545',NULL,0);
INSERT INTO [User] VALUES ('bismillahjanCS','Bismillah','Jan','CS','bismillah.jan@nu.edu.pk','passwordbj','0333-9876546',NULL,0);
INSERT INTO [User] VALUES ('tahirbashirMT','Tahir','Bashir','MT','tahir.bashir@nu.edu.pk','passwordtb','0333-9876547',NULL,0);
INSERT INTO [User] VALUES ('shakeelzafarCS','Shakeel','Zafar','CS','shakeel.zafar@nu.edu.pk','passwordsz','0333-9876548',NULL,0);
INSERT INTO [User] VALUES ('mustafakhanEE','Mustafa','Khan','EE','mustafa.khan@nu.edu.pk','passwordmk','0333-9876549',NULL,0);
INSERT INTO [User] VALUES ('aisharashidCS','Aisha','Rashid','CS','aisha.rashid@nu.edu.pk','passwordar','0333-9876540',NULL,0);
INSERT INTO [User] VALUES ('17L-4000','Shahid','Zafar','CS','l174000@nu.edu.pk','passwordsz','0333-9876541',NULL,0);
INSERT INTO [User] VALUES ('16L-4001','Sara','Ali','EE','l164001@nu.edu.pk','passwordsa','0333-9876881',NULL,0);
INSERT INTO [User] VALUES ('15L-4002','Ahmed','Raza','CV','l154002@nu.edu.pk','passwordar','0333-9877741',NULL,0);
INSERT INTO [User] VALUES ('17L-4003','Sameen','Farooq','MT','l174003@nu.edu.pk','passwordsf','0333-9976541',NULL,0);
INSERT INTO [User] VALUES ('18L-4004','Husnain','Ali','SH','l174000@nu.edu.pk','passwordha','0333-9876541',NULL,0);
INSERT INTO [User] VALUES ('aftabkhadimCS','Aftab','Khadim','CS','aftab.khadim@nu.edu.pk','passwordak','0333-9876542',1,0);
INSERT INTO [User] VALUES ('lehmiakiranCS','Lehmia','Kiran','CS','lehmia.kiran@nu.edu.pk','passwordlk','0333-9876522',NULL,0);
INSERT INTO [User] VALUES ('ammararafiqCE','Ammara','Rafiq','CS','ammara.rafiq@nu.edu.pk','passwordar','0333-9876533',NULL,0);
INSERT INTO [User] VALUES ('farahmunirCS','Farrah','Munir','CS','farrah.munir@nu.edu.pk','passwordfm','0333-9876553',NULL,0);
INSERT INTO [User] VALUES ('tahirrashidCS','Muhammad Tahir','Rashid','CS','tahir.rashid@nu.edu.pk','passwordmtr','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('tahirrashidCS','Muhammad Tahir','Rashid','EE','tahir.rashid@nu.edu.pk','passwordmtr','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('ammararafiqCS','Ammara','Rafiq','CS','ammara.rafiq@nu.edu.pk','passwordar','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('salmanmubarakCS','Salman','Mubarak','EE','salman.mubarak@nu.edu.pk','passwordsm','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('ishaqrazaCS','Ishaq','Raza','CS','ishaq.raza@nu.edu.pk','passwordir','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('ijazrasoolEE','Ijaz','Rasool','SH','ijaz.rasool@nu.edu.pk','passwordir','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('tarirkhanMT','Tahir','Khan','MT','tahir.khan@nu.edu.pk','passwordtk','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('aimeniqbalMT','Aimen','Iqbal','MT','aimen.iqbal@nu.edu.pk','passwordai','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('azhartariqMT','Azhar','Tariq','MT','azhar.tariq@nu.edu.pk','passwordat','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('haiderahmedMT','Haider','Ahmed','MT','haider.ahmed@nu.edu.pk','passwordha','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('daudiqbalMT','Daud','Iqbal','MT','daud.iqbal@nu.edu.pk','passworddi','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('saadrazaEE','Saad','Raza','EE','saad.raza@nu.edu.pk','passwordsr','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('qasimnoorEE','Qasim','Noor','EE','qasim.noor@nu.edu.pk','passwordqn','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('haroonrashidEE','Haroon','Rashid','EE','haroon.rashid@nu.edu.pk','passwordhr','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('qasimnoorCV','Qasim','Noor','CV','qasim.noor@nu.edu.pk','passwordqn','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('rizwanaliCV','Rizwan','Ali','CV','rizwan.ali@nu.edu.pk','passwordra','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('hamnawaseemCS','Hamna','Waseem','CS','hamna.waseem@nu.edu.pk','passwordhw','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('maryambashirCS','Maryam','Bashir','CS','maryam.bashir@nu.edu.pk','passwordmb','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('aamirraheemCS','Aamir','Raheem','CS','aamir.raheem@nu.edu.pk','passwordar','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('adeelqayyumCS','Adeel','Qayyum','CS','adeel.qayyum@nu.edu.pk','passwordaq','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('mujahidhussainSH','Mujahid','Hussain','SH','mujahid.hussain@nu.edu.pk','passwordmh','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('hamzajanjuaSH','Hamza','Janjua','SH','hamza.janjua@nu.edu.pk','passwordhj','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('umerfarooqSH','Umer','Farooq','SH','umer.farooq@nu.edu.pk','passworduf','0323-9876543',NULL,0);
INSERT INTO [User] VALUES ('taimurbakshiCS','Taimmur','Bakshi','CS','taimur.bakshi@nu.edu.pk','passwordtb','0323-9876543',NULL,0);



INSERT INTO Student VALUES ('17L-4000',5,3,'BSCS2017','MT224', 98);
INSERT INTO Student VALUES ('17L-4000',5,3,'BSCS2017','SS217', 98);
INSERT INTO Student VALUES ('17L-4000',5,3,'BSCS2017','EE227', 98);
INSERT INTO Student VALUES ('17L-4000',5,3,'BSCS2017','EL227', 98);
INSERT INTO Student VALUES ('17L-4000',5,3,'BSCS2017','CS217', 98);
INSERT INTO Student VALUES ('16L-4001',5,2.99,'BSEE2016','SS113', 115);
INSERT INTO Student VALUES ('16L-4001',5,2.99,'BSEE2016','EE403', 115);
INSERT INTO Student VALUES ('16L-4001',5,2.99,'BSEE2016','EE452', 115);
INSERT INTO Student VALUES ('16L-4001',5,2.99,'BSEE2016','EE455', 115);
INSERT INTO Student VALUES ('16L-4001',5,2.99,'BSEE2016','EE902', 115);
INSERT INTO Student VALUES ('15L-4002',5,2.03,'BSCV2015','CV306', 115);
INSERT INTO Student VALUES ('15L-4002',5,2.03,'BSCV2015','CV901', 115);
INSERT INTO Student VALUES ('15L-4002',5,2.03,'BSCV2015','CV564', 115);
INSERT INTO Student VALUES ('15L-4002',5,2.03,'BSCV2015','CV111', 115);
INSERT INTO Student VALUES ('15L-4002',5,2.03,'BSCV2015','CV234', 115);
INSERT INTO Student VALUES ('17L-4003',5,3.05,'BBA2017','SS217', 95);
INSERT INTO Student VALUES ('17L-4003',5,3.05,'BBA2017','SS218', 95);
INSERT INTO Student VALUES ('17L-4003',5,3.05,'BBA2017','MT101', 95);
INSERT INTO Student VALUES ('17L-4003',5,3.05,'BBA2017','MT112', 95);
INSERT INTO Student VALUES ('17L-4003',5,3.05,'BBA2017','MT234', 95);
INSERT INTO Student VALUES ('18L-4004',5,3,'MSL2018','SH113', 50);
INSERT INTO Student VALUES ('18L-4004',5,3,'MSL2018','SH115', 50);
INSERT INTO Student VALUES ('18L-4004',5,3,'MSL2018','SH201', 50);
INSERT INTO Student VALUES ('18L-4004',5,3,'MSL2018','SH222', 50);
INSERT INTO Student VALUES ('18L-4004',5,3,'MSL2018','SH301', 50);


INSERT INTO Instructor VALUES('ammararafiqCV','CV',1,'EL227','A');
INSERT INTO Instructor VALUES('ammararafiqCS','CS',1,'EL227','B');
INSERT INTO Instructor VALUES('kashifzafarCS','CS',1,'CS220','A');
INSERT INTO Instructor VALUES('amirwaliCS','CS',1,'CS410','A');
INSERT INTO Instructor VALUES('samanshahidCS','CS',1,'EE117','A');
INSERT INTO Instructor VALUES('samanshahidCV','CV',1,'NS202','A');
INSERT INTO Instructor VALUES('farahmunirCS','CS',1,'EE227','B');
INSERT INTO Instructor VALUES('tahirbashirMT','MT',1,'SS217','A');
INSERT INTO Instructor VALUES('shakeelzafarCS','CS',1,'CL217','A');
INSERT INTO Instructor VALUES('mustafakhanEE','EE',1,'SS113','A');
INSERT INTO Instructor VALUES('aisharashidCS','CS',1,'MT224','A');
INSERT INTO Instructor VALUES('lehmiakiranCS','CS',1,'CS118','A');
INSERT INTO Instructor VALUES('zareenalamgirCS','CS',1,'CS219','A');
INSERT INTO Instructor VALUES('ishaqrazaCS','CS',1,'CS219','B');
INSERT INTO Instructor VALUES('salmanmubarakEE','EE',1,'EE117','B');
INSERT INTO Instructor VALUES('ijazrasoolSH','SH',1,'SH101','A');
INSERT INTO Instructor VALUES('ijazrasoolEE','EE',1,'SH101','A');
INSERT INTO Instructor VALUES('tahirkhanMT','MT',1,'MT101','A');
INSERT INTO Instructor VALUES('azhartariqMT','MT',1,'MT200','A');
INSERT INTO Instructor VALUES('haiderahmedMT','MT',1,'MT112','A');
INSERT INTO Instructor VALUES('daudiqbalMT','MT',1,'MT234','A');
INSERT INTO Instructor VALUES('saadrazaEE','EE',1,'EE452','A');
INSERT INTO Instructor VALUES('haroonrashidEE','EE',1,'EE902','A');
INSERT INTO Instructor VALUES('qasimnoorEE','EE',1,'EE461','A');
INSERT INTO Instructor VALUES('qasimnoorCV','CV',1,'SH113','A');
INSERT INTO Instructor VALUES('qasimnoorCS','CS',1,'MT119','A');
INSERT INTO Instructor VALUES('rizwanaliCV','CV',1,'SH116','A');
INSERT INTO Instructor VALUES('hamnawaseemCS','CS',1,'CL219','A');
INSERT INTO Instructor VALUES('adeelqayyumCS','CS',1,'null','A');
INSERT INTO Instructor VALUES('aamirraheemCS','CS',1,'null','A');
INSERT INTO Instructor VALUES('maryambashirCS','CS',1,'CS302','A');
INSERT INTO Instructor VALUES('mujahidhussainSH','SH',1,'SH201','A');
INSERT INTO Instructor VALUES('umerfarooqSH','SH',1,'SH201','A');
INSERT INTO Instructor VALUES('hamzajanjuaSH','SH',1,'SH222','A');
INSERT INTO Instructor VALUES('taimurbakshiCS','CS',1,'CS307','A');
INSERT INTO Instructor VALUES('shahidrazaCV','CV',1,'CV901','A');
INSERT INTO Instructor VALUES('saminiftikharCS','CS',1,'EE229','A');
INSERT INTO Instructor VALUES('amnakhanCS','CS',1,'CS218','A');
INSERT INTO Instructor VALUES('humaakbarCS','CS',1,'MT205','A');
INSERT INTO Instructor VALUES('abeedaakramCS','CS',1,'CS217','A');
INSERT INTO Instructor VALUES('bismillahjanCS','CS',1,'CL118','A');
INSERT INTO Instructor VALUES('aimeniqbalMT','MT',1,'SS218','A');
INSERT INTO Instructor VALUES('raheelatariqMT','MT',1,'SS118','A');
INSERT INTO Instructor VALUES('aamirikramMT','MT',1,'MG414','A');
INSERT INTO Instructor VALUES('rizwanaliEE','EE',1,'CV564','A');
INSERT INTO Instructor VALUES('mehmoodnawazEE','EE',1,'CV117','A');
INSERT INTO Instructor VALUES('abdullahaliEE','EE',1,'CV555','A');



delete from course
delete from instructor
delete from Department
delete from Batch


INSERT INTO Course VALUES ('SS152','Communication and Presentation Skills',3,1.5,'SS150','aisharashidCS',3,'CS','BSCS2018');
INSERT INTO Course VALUES ('SL152','Communication and Presentation Skills Lab',1,3,'SS150','samanshahidCS',3,'CS','BSCS2018');
INSERT INTO Course VALUES ('CS219','Database Systems',3,1.5,'CS218','zareenalamgirCS',3,'CS','BSCS2018');
INSERT INTO Course VALUES ('CL219','Database Systems Lab',1,3,'CS218','hamnawaseemCS',3,'CS','BSCS2018');
INSERT INTO Course VALUES ('CS220','Operating Systems',3,1.5,'CS218','aamirraheemCS',3,'CS','BSCS2018');
INSERT INTO Course VALUES ('CL220','Operating Systems Lab',1,3,'CS218','adeelqayyumCS',3,'CS','BSCS2018');
INSERT INTO Course VALUES ('CS302','Design and Analysis of Algorithms',3,1.5,'CS218','maryambashirCS',2,'CS','BSCS2018');
INSERT INTO Course VALUES ('EE229','Computer Organization and Assembly Language',3,1.5,'EE227','saminiftikharCS',2,'CS','BSCS2018');
INSERT INTO Course VALUES ('EL229','Computer Organization and Assembly Language Lab',1,3,'EE227','ammararafiqCS',2,'CS','BSCS2018');
INSERT INTO Course VALUES ('CS218','Data Structures',3,1.5,'CS217','amnakhanCS',1,'CS','BSCS2018');
INSERT INTO Course VALUES ('CL218','Data Structures Lab',1,3,'CS217','hamnawaseemCS',1,'CS','BSCS2018');
INSERT INTO Course VALUES ('MT205','Probability and Statustics',4,2,'None','humaakbarCS',2,'CS','BSCS2018');
INSERT INTO Course VALUES ('CS211','Discrete Structures',3,1.5,'None','hamnawaseemCS',2,'CS','BSCS2018');
INSERT INTO Course VALUES ('NS202','Environmental Studies',3,1.5,'None','samanshahidCV',2,'CV','BSCV2018');
INSERT INTO Course VALUES ('SS118','Psychology',3,1.5,'None','raheelatariqMT',2,'MT','BBA2018'); 
INSERT INTO Course VALUES ('MG414','Entrepreneurship',3,1.5,'None','aamirikramMT',2,'MT','BBA2018');
INSERT INTO Course VALUES ('MG103','Finance and Accounting',3,1.5,'None','umerfarooqSH',2,'SH','BSL2018');
INSERT INTO Course VALUES ('MG336','Principles of Leadership',3,1.5,'None','mujahidhussainSH',1,'SH','BSL2018');
INSERT INTO Course VALUES ('SS103','Arabic Language',3,1.5,'None','hamzajanjuaSH',1,'SH','BSL2018');
INSERT INTO Course VALUES ('CS307','Computer Networks',3,1.5,'CS201','taimurbakshiCS',1,'CS','BSCS2018');
INSERT INTO Course VALUES ('CS237','Artifical Intelligence',1,1.5,'Database System','kashifzafarCS',1,'CS','BSCS2017');
INSERT INTO Course VALUES ('EE902','Control Engineering',3,1.5,'None','haroonrashidEE',2,'EE','BSEE2016');
INSERT INTO Course VALUES ('EE461','Robotics and Automation',3,1.5,'None','qasimnoorEE',1,'EE','BSEE2016'); 
INSERT INTO Course VALUES ('CV306','Structcural Design',3,1.5,'None','qasimnoorCV',1,'CV','BSCV2015'); 
INSERT INTO Course VALUES ('CV309','Steel Design',3,1.5,'None','qasimnoorCV',1,'CV','BSCV2015');
INSERT INTO Course VALUES ('CV234','Concrete and Foundation Design',3,1.5,'None','qasimnoorCV',1,'CV','BSCV2015'); 
INSERT INTO Course VALUES ('CV111','Robotics and Automation',3,1.5,'None','qasimnoorCV',1,'CV','BSCV2018'); 
INSERT INTO Course VALUES ('CV564','Geotechnical Engineering',3,1.5,'CV109','rizwanaliEE',1,'EE','BSEE2018'); 
INSERT INTO Course VALUES ('CV117','Foundation Engineering',3,1.5,'CV112','mehmoodnawazEE',1,'EE','BSEE2018'); --330
INSERT INTO Course VALUES ('CVL117','Foundation Engineering Lab',1,3,'CV112','abdullahaliEE',1,'EE','BSEE2018'); 
INSERT INTO Course VALUES ('CV901','Solid Mechanics',3,1.5,'CV115','shahidrazaCV',1,'CV','BSCV2018'); 
INSERT INTO Course VALUES ('CV555','Engineering Graphics',3,1.5,'CV114','ijazrasoolEE',1,'EE','BSEE2018');
INSERT INTO Course VALUES ('EE227','Digital Logic Design',3,1.5,'None','farahmunirCS',3,'CS','BSCS2019');
INSERT INTO Course VALUES ('EL227','Digital Logic Design Lab',1,3,'None','ammararafiqCS',3,'CS','BSCS2019');
INSERT INTO Course VALUES ('CS217','Object Oriented Programming',3,1.5,'CS118','abeedaakramCS',3,'CS','BSCS2019');
INSERT INTO Course VALUES ('CL217','Object Oriented Programming Lab',1,3,'CL118','shakeelzafarCS',3,'CS','BSCS2019');
INSERT INTO Course VALUES ('CS118','Programming Fundamentals',3,1.5,'None','lehmiakiranCS',3,'CS','BSCS2019');
INSERT INTO Course VALUES ('CL118','Programming Fundamentals Lab',1,3,'None','bismillahjanCS',3,'CS','BSCS2019'); 
INSERT INTO Course VALUES ('MT224','Differential Equations (CAl II)',3,1.5,'MT119','aisharashidCS',2,'CS','BSCS2019');
INSERT INTO Course VALUES ('MT119','Calculus and Analytical Geometry',3,1.5,'None','qasimnoorCS',1,'CS','BSCS2019');
INSERT INTO Course VALUES ('EE117','Applied Physics',3,1.5,'None','samanshahidCS',1,'CS','BSCS2019');
INSERT INTO Course VALUES ('SH115','Inntroduction to Anthropology',3,1.5,'SH114','ijazrasoolSH',1,'SH','MSL2018'); 
INSERT INTO Course VALUES ('SH113','English Phonology',3,1.5,'SH111','qasimnoorCV',1,'CV','MSL2018'); 
INSERT INTO Course VALUES ('SH201','Sociolinguistics',3,1.5,'SH110','mujahidhussainSH',1,'SH','MSL2018'); 
INSERT INTO Course VALUES ('SH222','Language, Culture and Society',3,1.5,'CV114','hamzajanjuaSH',1,'SH','MSL2018'); 
INSERT INTO Course VALUES ('SH101','Academic Writing',3,1.5,'CV114','ijazrasoolSH',1,'SH','MSL2018'); 
INSERT INTO Course VALUES ('SH116','Literary Theory II',3,1.5,'CV114','rizwanaliCV',1,'CV','MSL2018'); 
INSERT INTO Course VALUES ('SH301','PsychoLinguistics',3,1.5,'CV114','ijazrasoolSH',1,'SH','MSL2018');
INSERT INTO Course VALUES ('SS217','Mass Communication',3,1.5,'None','tahirbashirMT',1,'MT','BBA2017');
INSERT INTO Course VALUES ('SS218','Organizational Behavior',3,1.5,'None','aimeniqbalMT',1,'MT','BBA2017');
INSERT INTO Course VALUES ('MT101','Economics',3,1.5,'None','tahirkhanMT',2,'MT','BBA2017');
INSERT INTO Course VALUES ('MT200','Banking and Insurance',3,1.5,'None','azhartariqMT',1,'MT','BBA2017');
INSERT INTO Course VALUES ('MT112','Finance Investment',3,1.5,'MT111','haiderahmedMT',1,'MT','BBA2017');
INSERT INTO Course VALUES ('MT234','Portfolio Management',3,1.5,'MT233','daudiqbalMT',1,'MT','BBA2017');
INSERT INTO Course VALUES ('SS113','Pakistan Studies',3,1.5,'None','mustafakhanEE',1,'EE','BSEE2016');
INSERT INTO Course VALUES ('EE403','Photonics',3,1.5,'None','mustafakhanEE',1,'EE','BSEE2016'); 
INSERT INTO Course VALUES ('EE452','Microwave Engineering',3,1.5,'EE303','saadrazaEE',1,'EE','BSEE2016'); 
INSERT INTO Course VALUES ('EE455','Electronic Circuits',3,1.5,'EE200','haroonrashidEE',1,'EE','BSEE2016');
INSERT INTO Course VALUES ('EL455','Electronic Circuits Lab',1,3,'EE200','haroonrashidEE',1,'EE','BSEE2016'); 

INSERT INTO Section VALUES ('A',12,50,'EE227');
INSERT INTO Section VALUES ('B',10,50,'EE227');
INSERT INTO Section VALUES ('A',30,50,'CS219');
INSERT INTO Section VALUES ('B',32,50,'CS219');
INSERT INTO Section VALUES ('B',11,50,'EE117');
INSERT INTO Section VALUES ('A',34,50,'CS118');
INSERT INTO Section VALUES ('A',43,50,'MT224');
INSERT INTO Section VALUES ('A',49,50,'SS113');
INSERT INTO Section VALUES ('A',12,50,'EL227');
INSERT INTO Section VALUES ('A',19,50,'CL217');
INSERT INTO Section VALUES ('A',19,50,'CS220');
INSERT INTO Section VALUES ('A',27,50,'CS410');
INSERT INTO Section VALUES ('A',0,50,'SH115');
INSERT INTO Section VALUES ('A',0,50,'SH113');
INSERT INTO Section VALUES ('A',0,50,'SH201');
INSERT INTO Section VALUES ('A',0,50,'SH222');
INSERT INTO Section VALUES ('A',0,50,'SH101');
INSERT INTO Section VALUES ('A',0,50,'SH116');
INSERT INTO Section VALUES ('A',0,50,'SH301');
INSERT INTO Section VALUES ('A',0,50,'SS217');
INSERT INTO Section VALUES ('A',0,50,'SS218');
INSERT INTO Section VALUES ('A',0,50,'MT101');
INSERT INTO Section VALUES ('B',0,50,'MT101');
INSERT INTO Section VALUES ('A',0,50,'MT112');
INSERT INTO Section VALUES ('A',0,50,'MT234');
INSERT INTO Section VALUES ('B',0,50,'SS113');
INSERT INTO Section VALUES ('A',0,50,'EE403');
INSERT INTO Section VALUES ('B',0,50,'EE452');
INSERT INTO Section VALUES ('A',0,50,'EE455'); 
INSERT INTO Section VALUES ('A',0,50,'EL455');
INSERT INTO Section VALUES ('B',0,50,'EE902'); 
INSERT INTO Section VALUES ('A',0,50,'EE902');
INSERT INTO Section VALUES ('A',0,50,'EE461');
INSERT INTO Section VALUES ('A',0,50,'CV306');
INSERT INTO Section VALUES ('A',0,50,'CV309'); 
INSERT INTO Section VALUES ('A',0,50,'CV234');
INSERT INTO Section VALUES ('A',0,50,'CV111');
INSERT INTO Section VALUES ('A',0,50,'CV564');
INSERT INTO Section VALUES ('A',0,50,'CV117'); 
INSERT INTO Section VALUES ('A',0,50,'CVL117');
INSERT INTO Section VALUES ('A',0,50,'CV901');
INSERT INTO Section VALUES ('A',0,50,'CV555'); 
INSERT INTO Section VALUES ('B',0,50,'MT224');
INSERT INTO Section VALUES ('A',0,50,'MT119');
INSERT INTO Section VALUES ('A',0,50,'EE117');
INSERT INTO Section VALUES ('A',0,50,'SS152');
INSERT INTO Section VALUES ('B',0,50,'SS152');
INSERT INTO Section VALUES ('C',0,50,'SS152');
INSERT INTO Section VALUES ('A',0,50,'SL152');
INSERT INTO Section VALUES ('B',0,50,'SL152');
INSERT INTO Section VALUES ('C',0,50,'SL152');
INSERT INTO Section VALUES ('B',0,50,'CS220');
INSERT INTO Section VALUES ('C',0,50,'CS220');
INSERT INTO Section VALUES ('A',0,50,'CL220');
INSERT INTO Section VALUES ('B',0,50,'CL220');
INSERT INTO Section VALUES ('B',0,50,'CS218');
INSERT INTO Section VALUES ('A',0,50,'EE229');
INSERT INTO Section VALUES ('B',0,50,'EE229');
INSERT INTO Section VALUES ('A',0,50,'EL229');
INSERT INTO Section VALUES ('B',0,50,'EL229');
INSERT INTO Section VALUES ('A',0,50,'MT205');
INSERT INTO Section VALUES ('B',0,50,'MT205');
INSERT INTO Section VALUES ('A',0,50,'CS211');
INSERT INTO Section VALUES ('B',0,50,'CS211');
INSERT INTO Section VALUES ('A',0,50,'NS202');
INSERT INTO Section VALUES ('B',0,50,'NS202');
INSERT INTO Section VALUES ('A',0,50,'MG414');
INSERT INTO Section VALUES ('B',0,50,'MG414');
INSERT INTO Section VALUES ('A',0,50,'MG103');
INSERT INTO Section VALUES ('B',0,50,'MG103');
INSERT INTO Section VALUES ('A',0,50,'MG336');
INSERT INTO Section VALUES ('A',0,50,'SS103');
INSERT INTO Section VALUES ('A',0,50,'CS307');


INSERT INTO Venue VALUES ('1');
INSERT INTO Venue VALUES ('2');
INSERT INTO Venue VALUES ('3');
INSERT INTO Venue VALUES ('4');
INSERT INTO Venue VALUES ('5');
INSERT INTO Venue VALUES ('6');
INSERT INTO Venue VALUES ('7');
INSERT INTO Venue VALUES ('8');
INSERT INTO Venue VALUES ('9');
INSERT INTO Venue VALUES ('10');
INSERT INTO Venue VALUES ('11');
INSERT INTO Venue VALUES ('12');
INSERT INTO Venue VALUES ('13');
INSERT INTO Venue VALUES ('14');
INSERT INTO Venue VALUES ('15');


INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (1,'08:00','09:30','Monday',1.5,'1','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (2,'09:30','11:00','Monday',1.5,'2','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (3,'11:00','12:30','Monday',1.5,'3','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (4,'12:30','02:00','Monday',1.5,'4','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (5,'02:00','03:30','Monday',1.5,'5','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (6,'03:30','05:00','Monday',1.5,'6','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (7,'08:00','11:00','Monday',3,'7','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (8,'02:00','05:00','Monday',3,'2','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (36,'08:00','09:30','Monday',1.5,'8','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (37,'09:30','11:00','Monday',1.5,'9','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (38,'11:00','12:30','Monday',1.5,'10','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (39,'12:30','02:00','Monday',1.5,'14','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (40,'02:00','03:30','Monday',1.5,'12','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (41,'03:30','05:00','Monday',1.5,'13','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (42,'08:00','11:00','Monday',3,'15','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (43,'02:00','05:00','Monday',3,'9','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (44,'08:00','09:30','Tuesday',1.5,'7','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (45,'09:30','11:00','Tuesday',1.5,'8','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (46,'11:00','12:30','Tuesday',1.5,'9','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (47,'12:30','02:00','Tuesday',1.5,'14','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (48,'02:00','03:30','Tuesday',1.5,'11','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (49,'03:30','05:00','Tuesday',1.5,'15','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (12,'12:30','02:00','Tuesday',1.5,'4','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (13,'02:00','03:30','Tuesday',1.5,'5','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (14,'03:30','05:00','Tuesday',1.5,'6','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (9,'08:00','09:30','Tuesday',1.5,'1','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (10,'09:30','11:00','Tuesday',1.5,'2','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (11,'11:00','12:30','Tuesday',1.5,'3','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (15,'08:00','09:30','Wednesday',1.5,'1','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (16,'09:30','11:00','Wednesday',1.5,'2','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (17,'11:00','12:30','Wednesday',1.5,'3','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (18,'12:30','02:00','Wednesday',1.5,'4','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (19,'02:00','03:30','Wednesday',1.5,'5','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (20,'03:30','05:00','Wednesday',1.5,'6','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (50,'08:00','09:30','Wednesday',1.5,'11','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (51,'09:30','11:00','Wednesday',1.5,'8','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (52,'11:00','12:30','Wednesday',1.5,'9','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (53,'12:30','02:00','Wednesday',1.5,'2','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (54,'02:00','03:30','Wednesday',1.5,'10','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (55,'03:30','05:00','Wednesday',1.5,'12','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (56,'08:00','09:30','Thursday',1.5,'8','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (57,'08:00','11:00','Thursday',3,'10','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (58,'09:30','11:00','Thursday',1.5,'11','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (59,'11:00','12:30','Thursday',1.5,'13','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (60,'12:30','02:00','Thursday',1.5,'14','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (61,'02:00','05:00','Thursday',3,'15','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (62,'02:00','03:30','Thursday',1.5,'12','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (63,'03:30','05:00','Thursday',1.5,'10','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (64,'05:00','06:30','Thursday',1.5,'9','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (21,'08:00','09:30','Thursday',1.5,'1','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (22,'08:00','11:00','Thursday',3,'1','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (23,'09:30','11:00','Thursday',1.5,'2','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (24,'11:00','12:30','Thursday',1.5,'3','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (25,'12:30','02:00','Thursday',1.5,'4','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (26,'02:00','05:00','Thursday',3,'2','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (27,'02:00','03:30','Thursday',1.5,'5','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (28,'03:30','05:00','Thursday',1.5,'6','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (29,'05:00','06:30','Thursday',1.5,'7','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (65,'08:00','09:30','Friday',1.5,'6','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (66,'08:00','11:00','Friday',3,'6','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (67,'09:30','11:00','Friday',1.5,'8','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (68,'11:00','12:30','Friday',1.5,'9','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (69,'02:00','03:30','Friday',1.5,'11','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (70,'02:00','05:00','Friday',12,'12','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (30,'08:00','09:30','Friday',1.5,'1','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (31,'08:00','11:00','Friday',3,'1','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (32,'09:30','11:00','Friday',1.5,'2','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (33,'11:00','12:30','Friday',1.5,'3','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (34,'02:00','03:30','Friday',1.5,'5','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (35,'02:00','05:00','Friday',3,'5','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (71,'08:00','09:30','Friday',1.5,'13','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (72,'08:00','11:00','Friday',3,'14','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (73,'09:30','11:00','Friday',1.5,'12','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (74,'11:00','12:30','Friday',1.5,'15','true','null','null');
INSERT INTO TimeSlot (id,StartTime, EndTime, [Day], Duration, Venue,isAvailable, courseID, Section) VALUES (75,'02:00','03:30','Friday',1.5,'14','true','null','null');



SELECT * from TimeSlot
SELECT * from Course
SELECT * from Instructor
SELECT * from [User]
Select * from Section
SELECT * from Batch
SELECT * from Department
SELECT * from Student
SELECT * from Venue
Select * from Messages

