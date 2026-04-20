using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

/// <summary>
/// Descripción breve de OperacionesBasicas
/// </summary>
[WebService(Namespace = "http://tempuri.org/")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
// Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
// [System.Web.Script.Services.ScriptService]
public class OperacionesBasicas : System.Web.Services.WebService
{

    public OperacionesBasicas()
    {

        //Elimine la marca de comentario de la línea siguiente si utiliza los componentes diseñados 
        //InitializeComponent(); 
    }

    [WebMethod]
    
    public int Sumar(int a, int b)
    {
        return a + b;
    }
    [WebMethod]
    public int Restar(int a, int b)
    {
        return a - b;
    }
    [WebMethod]
    public int Multiplicar(int a, int b)
    {
        return a * b;
    }
    [WebMethod]
    public int Dividir(int a, int b)
    {
        if (b == 0)
        {
            throw new ArgumentException("No se puede dividir por cero.");
        }
        return a / b;
    }

}
