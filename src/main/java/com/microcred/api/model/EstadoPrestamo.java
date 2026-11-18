/*
Preparamos esta clase para ser importada en el futuro,
asignándole un nombre con apellido (analogía)
*/
package com.microcred.api.model;

/* 
Estamos usando "enum" y no "string", ya que cualquier
variante de los estados ("pagado", "Liquidado")
rompería la lógica. Entonces, este es una clase
especial de java que garantiza la seguridad de tipos
(Type safety)
*/
public enum EstadoPrestamo{
    PENDIENTE,
    ACTIVO,
    LIQUIDADO,
    VENCIDO
}

//Actualizando para probar