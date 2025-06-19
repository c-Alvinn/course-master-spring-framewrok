# Configurar diferentes ambientes para o mesmo projeto

É possível criar diferentes configurações para diferentes ambiente no mesmo projeto

No exemplo, será criado para os ambientes de DEV e PROD.

### 1º Passo - Criação de .properties para cada ambiente

- Cada ambiente deve ter o seu arquivo .properties com suas configurações específicas
- Cada arquivo deve seguir o padrao de formatação de nome:
    - **aplication.properties** (configuração padrão)
    - **aplication-dev.properties** (configuração específica para ambiente dev)
    - **aplication-prod.properties** (configuração específica para ambiente prod)

Para a configuração de um perfil padrão deve-se adicionar no arquivo **aplication.properties** o comando:

**spring.profiles.active=**

Exemplo: spring.profiles.active=dev

### 2º Passo - adicionar 