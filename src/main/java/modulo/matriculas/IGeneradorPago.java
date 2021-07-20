package modulo.matriculas;

public interface IGeneradorPago {
    public int realizarSolicitudPago(Pago pago);
}
/*
La función retorna un valor entero que corresponde al estado de la solicitud de pago
a una entidad bancaria externa
1. Realizado con éxito
2. Error en solicitud de pago
 */
