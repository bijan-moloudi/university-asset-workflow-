create index IX_895B4964 on UNV_Course (groupId, universityId);
create index IX_766C0D97 on UNV_Course (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_49F90DD9 on UNV_Course (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_4E91DA08 on UNV_Student (groupId, universityId);
create index IX_847EA673 on UNV_Student (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2542DB5 on UNV_Student (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_277707C1 on UNV_Student_Course (companyId);
create index IX_D2193E7F on UNV_Student_Course (studentId);

create index IX_9EBF0654 on UNV_University (groupId);
create index IX_86392F8A on UNV_University (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6E7C108C on UNV_University (uuid_[$COLUMN_LENGTH:75$], groupId);