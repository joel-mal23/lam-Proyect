/*
 * STORE SP_INVENTARY_DELETE CRUD PARA INSERTAR
 * METODO POST
 * 
 */

CREATE PROCEDURE SP_INVENTARY_POST
@nombre VARCHAR(100),
@apePat VARCHAR(100),
@apeMat VARCHAR(100),
@numEmpl INT

	AS
	
		INSERT INTO TestDB.dbo.INVENTARY (nombre,APE_PAT,APE_MAT,NUM_EMPLEADO) VALUES(@nombre,@apePat,@apeMat,@numEmpl);

		
/*
 * EJECUTAR STORE
 * */	

	EXEC SP_INVENTARY_POST;



