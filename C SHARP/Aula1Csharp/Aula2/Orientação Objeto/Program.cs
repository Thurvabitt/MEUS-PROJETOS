using Aula2;

public class OrientacaoObjeto
{
    public static void Main(string[] args)
    {
        ContaCorrente c1 = new ContaCorrente();
        c1.titular = "12345678900";
            c1.saldo = 100;

        c1.Depositar(-1);

        Console.WriteLine("Saldo de " + c1.titular + " é " + c1.saldo);
        c1.Depositar(200);

        Console.WriteLine("Saldo de " + c1.titular + " é " + c1.saldo);
        c1.Sacar(350);

        Console.WriteLine("Saldo de " + c1.titular + " é " + c1.saldo);
        c1.Sacar(350);
    }


}
