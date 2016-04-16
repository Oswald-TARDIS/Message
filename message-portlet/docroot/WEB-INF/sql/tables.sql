create table message_t_message (
	messageId LONG not null primary key,
	groupId LONG,
	companyId LONG
);

create table message_t_student (
	studentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	passwd VARCHAR(75) null
);

create table message_t_teacher (
	teacherId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	passwd VARCHAR(75) null
);