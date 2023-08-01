using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula1Continuacao
{
    class Class1
    {
        //Caixa eletrônico;
        //Usario digita um valor e voce calcula quantas notas serão utilizadas;
        //Considere que o caixa só tem nota de 100, 50, 20, 10 5 e 2;

        public static void Main(string[] args)
        {
            Console.WriteLine("Digite um valor a ser sacado: ");
            int valor = int.Parse(Console.ReadLine());

            int[] notasDisponiveis = { 100, 50, 20, 10, 5, 2 };
            int[] quantidadeNotas = new int[notasDisponiveis.Length];

            for (int i = 0; i < notasDisponiveis.Length; i++)
            {
                quantidadeNotas[i] = valor / notasDisponiveis[i];
                valor %= notasDisponiveis[i];
            }

            Console.WriteLine("Quantidade de notas: ");
            for (int i=0; i < notasDisponiveis.Length; i++)
            {
                Console.WriteLine($"{notasDisponiveis[i]}: {quantidadeNotas[i]}");
            }
        }
    }
}
