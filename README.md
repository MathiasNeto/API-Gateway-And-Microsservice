# Api-Gateway-And-Microservices

Este repositório contém uma solução de exemplo para a implementação de um Gateway de API e Microsserviços. O objetivo dessa solução é fornecer uma estrutura básica para a criação de um ambiente de microsserviços que utiliza um gateway como ponto de entrada para rotear as solicitações entre os serviços.

## Estrutura do Repositório

O repositório está organizado da seguinte maneira:

- **gateway**: Contém o código-fonte do gateway de API, responsável por receber as solicitações e roteá-las para os microsserviços correspondentes.
- **service1**: Contém o código-fonte do Microsserviço 1.
- **service2**: Contém o código-fonte do Microsserviço 2.

## Pré-requisitos

Certifique-se de ter as seguintes dependências instaladas em sua máquina antes de executar a solução:

- Java (versão 17 ou superior)

## Executando a Solução

Siga as etapas abaixo para executar a solução localmente:

1. Clone este repositório em sua máquina local usando o comando:

   ```
   git clone https://github.com/MathiasNeto/Api-Gateway-And-Microsservices.git
   ```

2. Execulte a aplicação em sua IDE de preferência.

## Uso

Após seguir as etapas acima para iniciar o gateway e os microsserviços, você pode fazer solicitações para a API através do gateway usando o seguinte formato de URL:

```
http://localhost:8080/{microsservico}/{rota}
```

Certifique-se de substituir `{microsservico}` pelo nome do microsserviço desejado e `{rota}` pelo endpoint específico que deseja acessar.

## Contribuição

Se você deseja contribuir para este projeto, siga as etapas abaixo:

1. Fork este repositório.
2. Crie um branch para sua contribuição:

   ```
   git checkout -b minha-contribuicao
   ```

3. Faça suas alterações e faça commit delas:

   ```
   git commit -m "Minha contribuição"
   ```

4. Envie suas alterações para o seu fork:

   ```
   git push origin minha-contribuicao
   ```

5. Abra um Pull Request neste repositório original.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter mais informações.

## Contato

Se você tiver alguma dúvida ou sugestão em relação a este projeto, entre em contato comigo através do meu e-mail: [matias.neto.edu@gmail.com](Matias:matias.neto.edu@gmail.com).

Espero que este README forneça informações úteis sobre o projeto e como executá-lo. Sinta-se à vontade para personalizar o conteúdo de acordo com as necessidades do seu repositório.
