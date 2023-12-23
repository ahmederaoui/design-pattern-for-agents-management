# Design Patterns and Aspect-Oriented Programming Exam

## Overview
Develop an application for managing agents and their transactions. Key patterns and concepts include:

- **Builder Pattern**: For creating transactions.
- **Observer Pattern**: Agents subscribe to others for notifications.
- **Strategy Pattern**: Multiple strategies for notification processing.
- **Singleton Pattern**: A single container managing a collection of agents.

## Tasks
1. **Class Diagram**: Create a simplified class diagram.
2. **Class Implementation and Testing**: Implement and test Transaction, Agent, and Container classes.
3. **Additional Patterns**: Suggest other useful design patterns.
4. **Technical Aspects**:
   - Logging aspect with `@Log` annotation.
   - Caching aspect with `@Cachable` annotation.
   - Security aspect using roles and annotations.

## Requirements
- Agents manage transactions, defined by ID, date, amount, and type.
- Notifications are sent to subscribed agents on transaction addition.
- Agents can choose or change notification processing strategies.
- The container of agents should be a singleton and manage agents using a HashMap.
## class diagram
![image](https://github.com/ahmederaoui/design-pattern-for-agents-management/assets/96418903/0e10ed33-efbf-454c-9b77-b380b065cec4)
