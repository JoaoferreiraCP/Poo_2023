public class Pessoa
{
    private String nome;
    private int identidade;
    private Date nascimento;
    
    public Pessoa(String n,int i,Date d)
    {
        nome = n; identidade = i; nascimento = d;
    }
    public String toString()
    {
        return "Nome: "+nome+"\nIdentidade: "+identidade+" "+
               "\nData de Nascimento: "+nascimento;
    }
}


public class Funcionario extends Pessoa
{
    private Date admissão;
    private float salário;
    public Funcionario(String nome,int id,Date nasc,Date adm,float sal)
    {
        super(nome,id,nasc);
        admissão = adm;
        salário = sal;
    }
    public String toString()
    {
        String resultado;
        resultado = super.toString()+"\n"; // chama o método toString 
                                           // da classe Pessoa
        resultado = resultado + "Data de admissão: "+admissão+"\n";
        resultado = resultado + "Salário: "+salário;
        return resultado;
    }
    public float qualSalário() { return salário; }
}