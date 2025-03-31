--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table libro;
drop table prestamo;
drop table socio;

CREATE TABLE "libro" (
	"isbn"	INTEGER NOT NULL,
	"titulo"	TEXT NOT NULL,
	"autor"	TEXT NOT NULL,
	"edicion"	INTEGER NOT NULL,
	"categoria"	INTEGER NOT NULL,
	PRIMARY KEY("isbn")
);

CREATE TABLE "prestamo" (
	"libro"	INTEGER NOT NULL,
	"socio"	INTEGER NOT NULL,
	"fechaPrestamo"	TEXT NOT NULL,
	"fechaDevolucion"	TEXT NOT NULL,
	PRIMARY KEY("socio","libro"),
	FOREIGN KEY("libro") REFERENCES "libro"("isbn")
);

CREATE TABLE "socio" (
	"numSocio"	INTEGER NOT NULL,
	"fechaNac"	TEXT NOT NULL,
	"nombreCompleto"	TEXT NOT NULL,
	"trabajador"	INTEGER NOT NULL,
	"sancion" INtEGER NOT NULL,
	"masInfo"	TEXT NOT NULL,
	PRIMARY KEY("numSocio")
);