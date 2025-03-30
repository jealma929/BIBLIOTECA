--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:

delete from libro;
delete from prestamo;
delete from socio;

INSERT INTO libro(isbn,titulo,autor,edicion,categoria) VALUES 
(437622149,"El Quijote","Miguel de Cervantes",2007,1),
(416434725,"Papá dice", "Margarita del Mazo",2017,0),
(419507594,"Cuento de Navidad", "Charles Dickens",2003,0),
(401034794,"El Albatros negro", "Maria Oruña",2025,1);


INSERT INTO prestamo(libro,socio,fechaPrestamo,fechaDevolucion) VALUES 
(437622149,12000001,"2025-01-03","2024-02-18"),
(416434725,99000001,"2025-03-05","2025-04-05");


INSERT INTO socio(numSocio,fechaNac,nombreCompleto,trabajador,sancion,masInfo) VALUES
(12000001, "1974-05-23", "Antonio Anto Nio", 0,0, "555555555"),
(12001210, "1999-09-15", "Pedro Pe Dro", 1,0, "555333325"),
(99000001, "2013-05-02", "Ana Lana Nal",0,0, "555255362 tfno tutor"),
(99000002, "2012-11-26", "Lucia Luz Cia",0,0, "555325661tfno tutor"), 
(12551276, "1971-11-06", "Evaristo Evar Isto",1,0,"555333326"),
(12952815, "2007-12-06", "Luna Blanca Diez",0,0,"555555661");
