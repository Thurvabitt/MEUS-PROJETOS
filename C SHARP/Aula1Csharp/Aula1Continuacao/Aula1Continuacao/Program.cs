using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula1VerificaParImpar
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite um valor");
            //cast
            double valorString = 12.9;
            int valorInt = (int)valorString;

            int valor = int.Parse(Console.ReadLine());

            if(valor%2 == 0)
            {
                Console.WriteLine("É par!");
            }
            else
            {
                Console.WriteLine("É impar!");
            }
            Console.ReadLine();
             
        }
    }
}
