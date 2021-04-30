create table Event_Worker (
	workerID LONG not null primary key,
	surname VARCHAR(75) null,
	name VARCHAR(75) null,
	patronymic VARCHAR(75) null,
	gender VARCHAR(75) null,
	date_of_birth DATE null,
	position VARCHAR(75) null,
	date_of_employment DATE null,
	salary_level LONG,
	work_number LONG,
	telephone_number LONG,
	banking_organization VARCHAR(75) null,
	archival_status BOOLEAN
);

create table staff_register_Banking_organization (
	banking_organizationID LONG not null primary key,
	name VARCHAR(75) null,
	identification_code INTEGER,
	address VARCHAR(75) null,
	workerID LONG
);

create table staff_register_Position_directory (
	position_directoryID LONG not null primary key,
	name VARCHAR(75) null,
	archival_status BOOLEAN
);

create table staff_register_Worker (
	workerID LONG not null primary key,
	surname VARCHAR(75) null,
	name VARCHAR(75) null,
	patronymic VARCHAR(75) null,
	gender VARCHAR(75) null,
	date_of_birth DATE null,
	date_of_employment DATE null,
	salary_level LONG,
	work_number LONG,
	telephone_number LONG,
	archival_status BOOLEAN,
	position_directoryID LONG,
	banking_organizationID LONG
);