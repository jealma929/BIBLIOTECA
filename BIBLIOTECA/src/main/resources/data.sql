--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:

delete from libro;
delete from prestamo;
delete from socio;

INSERT INTO libro(isbn,titulo,autor,edicion,categoria) VALUES 
(437622149,"El Quijote","Miguel de Cervantes", 2007,1),
(416434725,"Papá dice", "Margarita del Mazo",2017,0),
(419507594,"Cuento de Navidad", "Charles Dickens",2003,0),
(401034794,"El Albatros negro", "Maria Oruña",2025,1);


INSERT INTO prestamo(libro,socio,fechaPrestamo,fechaDevolucion) VALUES 
(437622149,12000001,"03012025","18022025"),
(416434725,99000001,"05032025","20032025");


INSERT INTO socio(numSocio,fechaNac,nombreCompleto,trabajador,masInfo) VALUES
(12000001, "23051974", "Antonio Anto Nio", 0, "555555555"),
(12001210, "15091999", "Pedro Pe Dro", 1, "555333325"),
(99000001, "02052013", "Ana Lana Nal",0, "555255362 tfno tutor"),
(99000002, "26112012", "Lucia Luz Cia",0, "555325661tfno tutor"), 
(12551276, "06111971", "Evaristo Evar Isto",1,"555333326"),
(12952815, "06122007", "Luna Blanca Diez",0,"555555661");
