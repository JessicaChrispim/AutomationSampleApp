#language:pt

Funcionalidade: Como usuario eu quero preencher e enviar os formularios do Automobile e por fim receber a mensagem de sucesso

  Cenario: Preencher e enviar os formularios do Automobile para entao validar a mensagem de sucesso
    Dado que estou no site Sample App
    Quando Preencho o formulario da aba enter Vehicle Data
    E clico em Next do formulario enter Vehicle Data
    E preencho o formulario da aba enter Insurant Data
    E clico em Next do formulario enter Insurant Data
    E preencho o formulario da aba enter Product Data
    E clico em Next do formulario enter Product Data
    E preencho o formulario da aba Select Price Option
    E clico em Next da aba Select Price Option
    E preencho  o formulario da aba Send Quote
    E clico em Send da aba Select Send Quote
    Entao e exibido a mensagem "Sending e-mail success!"

  Cenario: Validar mensagem de sucesso ao enviar formulario diretamente
    Dado que estou no site Sample App
    Quando Preencho as abas de formularios
    Entao e exibido a mensagem "Sending e-mail!"