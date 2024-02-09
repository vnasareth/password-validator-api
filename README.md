# password-validator-api

# Password Validator

O Password Validator é uma ferramenta simples em Java que garante que as senhas atendam a critérios específicos de complexidade para aumentar a segurança. Ela verifica se a senha contém uma combinação de caracteres minúsculos, maiúsculos, numéricos e especiais, e também se possui um comprimento mínimo. Além disso, ela confirma que não há caracteres repetidos, nem espaços em branco na senha.

## Requisitos

Para utilizar o Password Validator, você precisará de:

- Java JDK 1.8 ou superior

## Como Usar

A classe `PasswordValidator` pode ser utilizada diretamente em seu código para verificar a força de uma senha. Aqui está um exemplo de como usá-la:

```java
String senha = "ExemploSenha123!";
boolean éValida = PasswordValidator.isValid(senha);

if (éValida) {
    System.out.println("A senha é válida!");
} else {
    System.out.println("A senha é inválida!");
}
```

## Critérios de Validação de Senha

Uma senha é considerada válida se ela atender aos seguintes critérios:

- Pelo menos 9 caracteres
- Contém pelo menos um dígito numérico (0-9)
- Contém pelo menos uma letra minúscula (a-z)
- Contém pelo menos uma letra maiúscula (A-Z)
- Contém pelo menos um caractere especial (!@#$%^&*()-+)
- Não contém caracteres repetidos
- Não contém espaços em branco

## Executando Testes

Você pode executar testes manuais utilizando o método `main` na classe `PasswordValidatorTest`. Este método irá executar uma série de testes de validação e imprimir os resultados no console.


