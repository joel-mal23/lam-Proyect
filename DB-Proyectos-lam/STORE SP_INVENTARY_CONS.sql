/*
 * STORE SP_INVENTARY_CONS CRUD PARA CONSULTAS
 * METODO GET
 * 
 * */


CREATE PROCEDURE SP_INVENTARY_CONS 
	AS
		SELECT ID, NOMBRE , APE_PAT,APE_MAT,NUM_EMPLEADO as num_empleado_uno
		FROM TestDB.dbo.INVENTARY;
		
	
/*
 * EJECUTAR STORE
 * */	

	EXEC SP_INVENTARY_CONS;
	