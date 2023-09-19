using System.ComponentModel.DataAnnotations;

namespace AP.Models
{
    public class Produto
    {
        [Key]
        [Required]
        public int Id { get; set; }


        [Required(ErrorMessage = "coloca um nome aí otário")]
        public String Nome { get; set; }
        public int Quantidade { get; set; }
        public double ValorUnitario { get; set; }






























    }
}
