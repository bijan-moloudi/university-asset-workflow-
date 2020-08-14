create table UNV_Course (
	uuid_ VARCHAR(75) null,
	courseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	unit INTEGER,
	universityId LONG
);

create table UNV_Student (
	uuid_ VARCHAR(75) null,
	studentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	phone VARCHAR(75) null,
	universityId LONG
);

create table UNV_Student_Course (
	companyId LONG not null,
	courseId LONG not null,
	studentId LONG not null,
	primary key (courseId, studentId)
);

create table UNV_University (
	uuid_ VARCHAR(75) null,
	universityId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	name VARCHAR(75) null
);