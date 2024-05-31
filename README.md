#Santander BootCamp


## Diagrama de classes
```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }
    
    class Account {
        +String number
        +String agency
        +BigDecimal balancy
        +BigDecimal limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String type
        +String number
        +BigDecimal limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *-- "1"Account
    User "1" *-- "N" Feature
    User "1" *-- "1"Card
    User "1" *-- "N" News

```
