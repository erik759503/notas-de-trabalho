public class validadorSenha
{
    public static boolean isSenhaValida(String senha)
    {
        if(senha==null)
        {
            return false;
        }
        int tamanho = senha.length();
        if(tamanho<8||tamanho>12)
        {
            return false;
        }
        boolean temMaiuscula = false;
        boolean temNumero = false;
        
        for(char c : senha.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                temMaiuscula = true;
            }
            if(Character.isDigit(c))
            {
                temNumero = true;
            }
        }
        
        return temMaiuscula&&temNumero;
    }
    public static void main(String[]args)
    {
        String[] senhas= 
        {"Senha123",
        "abc",
        "senhasemnumero",
        "12345678",
        "Teste2026"
        };
        for(String senha: senhas)
        {
        System.out.printf("senha'%s' é %s%n", senha , isSenhaValida(senha)?"VALIDA":"INVALIDA");
        }
    }

}