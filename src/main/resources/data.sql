CREATE TABLE dormitory(
    id INT GENERATED by DEFAULT AS IDENTITY PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    address VARCHAR(300) NOT NULL,
    block_number INT NOT NULL
);

CREATE TABLE block(
    dormitory_id INT,
    FOREIGN KEY(dormitory_id) REFERENCES dormitory(id),
    name VARCHAR(1) NOT NULL
);

CREATE TABLE university(
    id INT GENERATED by DEFAULT AS IDENTITY PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);


CREATE TABLE faculty(
    id_of_faculty INT GENERATED by DEFAULT AS IDENTITY PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    university_id INT,
    FOREIGN KEY (university_id) REFERENCES university(id);
);

CREATE TABLE student(
    id DOUBLE AS IDENTITY PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    surname VARCHAR(20) NOT NULL,
    age INT,
    gender VARCHAR(7) NOT NULL,
    profession VARCHAR(80) NOT NULL,
    schoolStatus INT NOT NULL,
    faculty VARCHAR (50) NOT NULL,
    facultyId INT NOT NULL,
    FOREIGN KEY(facultyId) REFERENCES faculty(id_of_faculty),
    phone VARCHAR(14) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    dormitory_starts DATE NOT NULL,
    dormitory_finishes DATE NOT NULL
);

CREATE TABLE residency(
    start_resident DATE,
    FOREIGN KEY(start_resident) REFERENCES student(dormitory_starts),
    finish_resident DATE,
    FOREIGN KEY(finish_resident) REFERENCES student(dormitory_finishes)
);

INSERT INTO dormitory(name, address, block_number) VALUES ('ALAADDIN YURDU', 'Konya/Selçuk Üniversitesi Kampüsü', '4'),
                                                          ('ALİ ULVİ YURDU', 'Bosna Hersek Mahallesi', '2'),
                                                          ('MEVLANA YURDU', 'Yazır Mahallesi', '2');

INSERT INTO block(dormitory_id, name) VALUES ('1','A'),
                                             ('1','B'),
                                             ('1','C'),
                                             ('1','D'),
                                             ('2','A'),
                                             ('2','B'),
                                             ('3','A'),
                                             ('3','B');

INSERT INTO university(name) VALUES ('Selcuk University');

INSERT INTO faculty(name) VALUES ('Engineering'),
                                 ('Medical'),
                                 ('Social Sceince'),
                                 ('Foreign Languages'),
                                 ('Sceince'),
                                 ('Literatur');

INSERT INTO student(id, name, surname,gender, age, profession, schoolStatus, faculty, phone, email, dormitory_starts, dormitory_finishes) VALUES ('56985679156','Mahmut', 'Yirmi','Male',20, 'Machanical Engineering',2, 'Engineering', '+905869563578','mahmutyrm@gmail.com','2021-09-25','2025-10-15'),
                                                                                                                                                 ('84569756423','Ayşe', 'Açıkgöz','Female', 19, 'Dentist',1, 'Medical', '+905869563578','ayseeacgz@gmail.com','2021-09-25','2025-10-15'),
                                                                                                                                                 ('14569862655','Yılmaz','Yıldırır','Male', 23,'Electrical-Electoronical Engineering', 4, 'Engineering', '+905964235865','yilmazyildirir@gmail.com', '2018-09-23', '2022-06-16'),
                                                                                                                                                 ('35689412566','Ahmet', 'İrvasa','Male', 19, 'English Literatur',1, 'Literatur', '+905741235486', 'irvasaa@gmail.com', '2022-09-20', '2026-06-14'),
                                                                                                                                                 ('22665897456','Gizem','Varol','Female', 23, 'English Teacher', 4, 'Foreign Languages', '+905054101115', 'gizemvarol78@gmail.com','2018-09-23', '2022-06-16'),
                                                                                                                                                 ('45874952000', 'Betül', 'Kara', 'Female', 21, 'History Teacher', 3, 'Social Sceince', '+905488480845', 'karaabetul321@gmial.com','2019-09-21','2023-06-12'),
                                                                                                                                                 ('68954823514', 'Didem', 'Karaca', 'Female', 24, 'Eye Doctor',5, 'Medical', '+905123456789','karacadidemm@gmail.com', '2017-09-17', '2023-06-12');