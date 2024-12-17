#1. Single Responsibility Principle (SRP)
El principio Single Responsibility es fundamental porque facilita la refactorización del código al dividir las responsabilidades en partes más pequeñas y específicas. Al garantizar que cada clase se encargue de una única tarea o tenga una sola razón para cambiar, se reduce la complejidad y el riesgo de afectar otras funcionalidades al hacer modificaciones. Esto permite realizar cambios de manera sencilla, eficiente y sin necesidad de grandes ajustes, asegurando que el código sea más limpio, fácil de mantener y adaptable a nuevas necesidades o requisitos.

#2. Open/Closed Principle (OCP)
Aplicar el principio Open/Closed ayuda a crear sistemas robustos y sostenibles. Al extender funcionalidades mediante nuevas clases, el código existente se mantiene estable y confiable, promoviendo una arquitectura más limpia y eficiente.

#3. Liskov Substitution (LSP)
Al separar la funcionalidad en interfaces o clases más específicas, como diferenciar animales que pueden caminar de los que no pueden, se asegura que cada subclase cumpla con el "contrato" definido por su clase base. Esto mejora la modularidad, facilita la extensibilidad del código y reduce el riesgo de errores en tiempo de ejecución, promoviendo sistemas más robustos y fáciles de mantene

#4. Interface Segregation Principle (ISP)
En lugar de tener interfaces grandes y generalizadas, es preferible definir interfaces más pequeñas y específicas que se adapten a las necesidades particulares de cada clase. Esto evita que las clases implementen métodos irrelevantes, lo cual puede llevar a código innecesario, complejidad adicional, y una mayor probabilidad de errores.
