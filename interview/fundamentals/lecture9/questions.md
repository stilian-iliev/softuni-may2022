# Лекция Thymeleaf and Validations

1. За какво служи стартера spring-boot-starter-validation?
За валидиране на получени данни. Ако има грешки те ще се запишат в bindingResult-a. 
2. Как се използва анотацията `@Valid`?
Като се постави преди обекта който искаме да валидираме и като следващ аргумент поставим bindingResult в който ще се запишат грешките от валидацията ако има такива.
3. Как се имплементира custom валидатор?
Като създадем анотация и я имплементираме
4. За какво се използва `BindingResult`?
В него се съдържат грешките от валидиран обект.
5. Какво става ако имаме аргумент на метод анотиран с `@Valid` и следващия аргумент не е `BindingResult`?
6. Обяснете за какво служи POST-redirect-GET патърна?
отговорено