using AP.Models;
using Microsoft.EntityFrameworkCore;

namespace AP.Data
{
    public class Banco : DbContext
    {
        //Construtor da classe
        public Banco(DbContextOptions<Banco> options) : base(options)
        {
        }
        DbSet<Produto> Produtos { get; set; } 






    }
}
