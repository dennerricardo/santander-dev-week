# Santander-dev-week
Java RESTful API 
## Class diagram

```mermaid

classDiagram
    class BankUser {
        -String name
        -Account account
        -List[Features] features
        -Card card
        -List[News] news
    }

    class Account {
        -String number
        -String agency
        -BigDecimal balance
        -BigDecimal limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -BigDecimal limit
    }

    class News {
        -String icon
        -String description
    }

    BankUser "1" *-- "1" Account
    BankUser "1" *-- "N"Feature
    BankUser "1" *-- "1"Card
    BankUser "1" *-- "N" News

    
    ```
