--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:

delete from libro;
delete from prestamo;
delete from socio;

INSERT INTO libro(isbn,titulo,autor,edicion,categoria) VALUES 
(9788437622149,"El Quijote","Miguel de Cervantes", 2007,1),
(9788416434725,"Papá dice", "Margarita del Mazo",2017,0),
(9788419507594,"Cuento de Navidad", "Charles Dickens",2003,0),
(9788401034794,"El Albatros negro", "Maria Oruña",2025,1);


INSERT INTO prestamo(socio,libro,fechaPrestamo,fechaDevolucion) VALUES 
(12000001,9788437622149,"20250103","20250218"),
(99000001,9788416434725,"20250305","20250320");


INSERT INTO socio(numSocio,fechaNac,nombreCompleto,trabajador,masInfo) VALUES
(12000001, "19740523", "Antonio Anto Nio", 0, "555555555"),
(12001210, "19990915", "Pedro Pe Dro", 1, "555333325"),
(99000001, "20130502", "Ana Lana Nal",0, "555255362 tfno tutor"),
(99000002, "20121126", "Lucia Luz Cia",0, "555325661tfno tutor"), 
(12551276, "19711108", "Evaristo Evar Isto",1,"555333326"),
(12952815, "20071206", "Luna Blanca Diez",0,"555555661");
