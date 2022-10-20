/*
 * STORE SP_INVENTARY_DELETE CRUD PARA MODIFICAR
 * METODO PUT
 * 
 */

CREATE PROCEDURE SP_INVENTARY_PUT
@idInventario INT,
@nombre VARCHAR(100),
@apePat VARCHAR(100),
@apeMat VARCHAR(100),
@numEmpl INT

	AS
	
		UPDATE TestDB.dbo.INVENTARY SET nombre = @nombre  , APE_PAT = @apePat, APE_MAT = @apeMat, NUM_EMPLEADO = @numEmpl
		WHERE ID = @idInventario;

		
/*
 * EJECUTAR STORE
 * */	

	EXEC SP_INVENTARY_DELET;
	