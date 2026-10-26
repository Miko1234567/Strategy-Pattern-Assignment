## 3. Clean Code Principles Applied
1. **Elimination of Conditional Logic:** Replaced a monolithic `switch(operator)` block inside the execution flow with polymorphic delegation through `OperationStrategy`.
2. **Meaningful, Intention-Revealing Names:** Classes like `AddStrategy` and `MultiplyStrategy` clearly communicate their exact operational intent without requiring internal inspection.
3. **Single Responsibility Principle (SRP):** Each concrete strategy class encapsulates exactly one mathematical algorithm (`+`, `-`, `*`, `^`), keeping units isolated and maintainable.
4. **Context Algorithm-Agnosticism:** The `CalculatorContext` holds no knowledge of concrete strategy internals or mathematical formulas; it only knows the `OperationStrategy` interface.
5. **Open/Closed Principle (Extensibility):** New capabilities (e.g., `PowerStrategy`) were added without modifying existing code or touching the `CalculatorContext` or peer strategies.

## 4. Strategy vs. State Pattern
While both patterns rely on composition and delegation, they serve fundamentally different design intents:
* **Strategy Pattern** is chosen for our calculator because the client or context **freely selects and swaps interchangeable algorithms** at runtime to perform a task (e.g., switching from addition to multiplication)[cite: 1]. The strategy changes based on external business logic or user input.
* **State Pattern**, conversely, manages an object's behavior based on its **internal state transitions**, where concrete states often govern how and when the object transitions to *other* states automatically. Our calculator does not track internal states or workflow lifecycles; it simply delegates calculations to stateless algorithmic modules.

## 5. Conclusion
Implementing the Strategy pattern significantly improved code flexibility and decoupled algorithm execution from the client and context. While the pattern introduces a few extra classes compared to a procedural `switch` block, the trade-off is immensely favorable: code maintenance is simplified, conditional nesting is entirely eliminated, and new features can be integrated seamlessly without breaking existing implementations.

## 6. GitHub Repository Link
[Insert your GitHub Repository URL here]
